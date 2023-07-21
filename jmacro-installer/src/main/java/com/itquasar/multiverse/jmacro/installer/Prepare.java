package com.itquasar.multiverse.jmacro.installer;

import org.update4j.Configuration;
import org.update4j.FileMetadata;

import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

import static picocli.CommandLine.*;
import static picocli.CommandLine.Model.CommandSpec;


@Command(
    name = "prepare",
    description = "Prepare update configuration",
    showEndOfOptionsDelimiterInUsageHelp = true
)
public class Prepare implements Callable<CliResult>, Constants, KeyFunctions {

    private final static Logger LOGGER = Logger.getLogger(Prepare.class.getName());

    @Parameters(paramLabel = "BASE_PATH=BASE_URI", description = "Base PATH and base URI pairs to prepare update config file")
    private Map<Path, URI> apps = new LinkedHashMap<>();
    @Option(names = {"-p", "--prop", "--property"}, paramLabel = "KEY=VALUE")
    private Map<String, String> properties = new LinkedHashMap<>();
    @Option(names = {"-r", "--replace-props", "--replace-properties"}, defaultValue = "false", description = "Replace given properties on base Path AND base URL")
    private boolean replaceProperties = false;
    @Option(names = {"--privk", "--private-key"}, paramLabel = "KEY_FILE", description = "Private key PKCS8 pem file")
    private Path privateKeyFile;
    @Option(names = {"--pubk", "--public-key"}, paramLabel = "KEY_FILE", description = "Public key PKCS8 pem file")
    private Path publicKeyFile;
    @Option(names = {"-a", "--algorithm"}, paramLabel = "KEY_ALGORITHM", defaultValue = "RSA", description = "Private key algorithm")
    private String keyAlgorithm;
    @Spec
    private CommandSpec spec; // injected by picocli

    @ParentCommand
    private Cli cli;

    @Override
    public CliResult call() throws Exception {
        for (Map.Entry<Path, URI> entry : apps.entrySet()) {
            Path basePath = entry.getKey();
            URI baseUri = entry.getValue();
            prepareConfiguration(basePath.toAbsolutePath().normalize(), baseUri);
        }
        return null;
    }

    private void prepareConfiguration(Path basePath, URI baseUri) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        basePath = basePath.normalize();
        baseUri = baseUri.normalize();
        LOGGER.info("Configuring update for:");
        LOGGER.info("    Base path: " + basePath);
        LOGGER.info("    Base uri: " + baseUri);

        Configuration.Builder builder = Configuration.builder()
            .baseUri(baseUri)
            .basePath(basePath);

        if (this.privateKeyFile != null) {
            builder.signer(readPrivateKey(privateKeyFile, keyAlgorithm));
        }

        builder.property(BASE_URI, baseUri.toString());
        builder.property(BASE_PATH, "");
        builder.dynamicProperty(BASE_PATH, basePath.toString());
        this.properties.forEach((key, value) -> builder.property(key, value));

        if (!Files.exists(basePath)) {
            LOGGER.log(Level.SEVERE, "Base path " + basePath + " not found! Exiting...");
            System.exit(1);
        }
        builder
            .files(
                FileMetadata.streamDirectory(basePath)
                    .peek(
                        r -> r.classpath(r.getSource().toString().endsWith(".jar"))
                    )
            );
        Configuration configuration = builder.build();

        try (Writer out = Files.newBufferedWriter(basePath.resolve(MANIFEST_XML))) {
            configuration.write(out);
        }
    }
}
