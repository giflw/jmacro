package com.itquasar.multiverse.jmacro.installer;

import org.update4j.Archive;
import org.update4j.Configuration;
import org.update4j.UpdateOptions;
import org.update4j.UpdateResult;
import org.update4j.service.DefaultUpdateHandler;

import java.io.BufferedReader;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.PublicKey;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

import static picocli.CommandLine.*;
import static picocli.CommandLine.Model.CommandSpec;


@Command(
    name = "update",
    description = "Do update",
    showEndOfOptionsDelimiterInUsageHelp = true
)
public class Update implements Callable<CliResult>, Constants, KeyFunctions {
    private final static Logger LOGGER = Logger.getLogger(Update.class.getName());

    @Parameters(paramLabel = "BASE_URI=BASE_PATH", description = "Base URI and base PATH pairs to apply update config")
    private final Map<URI, Path> apps = new LinkedHashMap<>();

    @Option(names = {"--pubk", "--public-key"}, paramLabel = "KEY_FILE", description = "Public key PKCS8 pem file")
    private Path publicKeyFile;

    @Option(names = {"-a", "--algorithm"}, paramLabel = "KEY_ALGORITHM", defaultValue = "RSA", description = "Private key algorithm")
    private String keyAlgorithm;

    @Option(names = {"-l", "--login"}, paramLabel = "LOGIN", description = "User login to access update, if needed (login or domain\\login)")
    private String login;

    @Option(names = {"-p", "--password"}, paramLabel = "PASSWORD", description = "User password to access update, if needed")
    private String password;

    @Option(names = {"-L", "--ask-login"}, description = "Asks for user login to access update, if needed (login or domain\\login)")
    private boolean askLogin;

    @Option(names = {"-P", "--ask-password"}, description = "Asks for user password to access update, if needed")
    private boolean askPassword;

    @Option(names = {"--max-redirects"}, description = "Max follow http redirects")
    private int maxredirects = 3;

    @Spec
    private CommandSpec spec; // injected by picocli

    @ParentCommand
    private Cli cli;

    @Override
    public CliResult call() throws Exception {
        System.setProperty("http.maxRedirects", String.valueOf(this.maxredirects));
        if (this.askLogin) {
            var providedLogin = this.login;
            this.login = System.console().readLine("Login [%s]: ", providedLogin);
            if (providedLogin != null && this.login.isEmpty()) {
                this.login = providedLogin;
            }
        }
        if (this.askPassword) {
            this.password = new String(System.console().readPassword("Password: "));
        }
        if (this.login != null || this.password != null) {
            this.setAuthenticator();
        }

        for (Map.Entry<URI, Path> entry : apps.entrySet()) {
            URI baseUri = entry.getKey();
            Path basePath = entry.getValue();
            update(baseUri, basePath.toAbsolutePath().normalize());
        }
        return null;
    }

    private void setAuthenticator() {
        Authenticator.setDefault(new Authenticator() {
            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                // login for NTLMv2 -> domain\\user
                return new PasswordAuthentication(login, password.toCharArray());
            }
        });
    }

    private void update(URI baseUri, Path basePath) throws Exception {
        LOGGER.info("Configuring update for:");
        LOGGER.info("    Base path: " + basePath);
        LOGGER.info("    Base uri: " + baseUri);

        PublicKey publicKey = null;
        if (this.publicKeyFile != null) {
            publicKey = readPublicKey(this.publicKeyFile, this.keyAlgorithm);
        }

        Path archivePath = basePath.resolve("tmp").resolve("update.zip");
        if (Files.exists(archivePath)) {
            Files.delete(archivePath);
        } else if (!Files.exists(archivePath.getParent())) {
            Files.createDirectories(archivePath.getParent());
        }

        UpdateOptions.ArchiveUpdateOptions archive = UpdateOptions.archive(archivePath).updateHandler(new DefaultUpdateHandler());

        if (publicKey != null) {
            archive = archive.publicKey(publicKey);
        }

        Path oldManifestFile = basePath.resolve(MANIFEST_XML);
        Path newManifestFile = basePath.resolve(UPDATE_MANIFEST_XML);

        Configuration configuration = null;

        URI uriUpdateManifestXml = baseUri.resolve(MANIFEST_XML);
        try (InputStream in = uriUpdateManifestXml.toURL().openStream()) {
            LOGGER.info("Downloading update manifest from " + uriUpdateManifestXml);
            Files.copy(in, newManifestFile, StandardCopyOption.REPLACE_EXISTING);
        }

        Map<String, String> dynamicProperties = new LinkedHashMap<>();
        dynamicProperties.put(BASE_URI, baseUri.toString());
        dynamicProperties.put(BASE_PATH, basePath.toString());

        try (BufferedReader reader = Files.newBufferedReader(newManifestFile)) {
            LOGGER.info("Reading update manifest " + newManifestFile);
            if (publicKey != null) {
                configuration = Configuration.read(reader, publicKey, dynamicProperties);
            } else {
                configuration = Configuration.read(reader, dynamicProperties);
            }
        }

        UpdateResult updateResult = configuration.update(archive);

        if (updateResult.getException() == null && configuration.requiresUpdate()) {
            LOGGER.info("Installing update...");
            Archive.read(archivePath).install(false);

            LOGGER.info("Cleanup...");
            Files.deleteIfExists(archivePath);

            if (Files.exists(oldManifestFile)) {
                try (BufferedReader reader = Files.newBufferedReader(oldManifestFile)) {
                    Configuration oldConfiguration = Configuration.read(reader, dynamicProperties);
                    configuration.deleteOldFiles(oldConfiguration);
                }
                Files.move(newManifestFile, oldManifestFile, StandardCopyOption.REPLACE_EXISTING);
            }

            LOGGER.info("Done updating " + basePath);
        } else if (updateResult.getException() != null) {
            LOGGER.log(Level.SEVERE, "Error updating " + basePath, updateResult.getException());
        } else if (!configuration.requiresUpdate()) {
            LOGGER.info("Nothing to update");
        } else {
            LOGGER.log(Level.SEVERE, "Something wrong happened");
        }
    }
}
