package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.commands.base.commands.Credentials;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.script.ScriptResult;
import lombok.ToString;

import javax.script.Bindings;
import javax.script.ScriptContext;
import java.util.concurrent.Callable;

import static picocli.CommandLine.Command;
import static picocli.CommandLine.Option;
import static picocli.CommandLine.Parameters;

@ToString
@Command(name = "jmacro-cli", showAtFileInUsageHelp = true, mixinStandardHelpOptions = true, version = "1.0")
public class Cli implements Callable<CliResult> {

    @Option(names = {"-l", "--login"}, description = "Login")
    private String login;

    @Option(names = {"-p", "--password"}, description = "Password", interactive = true, arity = "0..1", prompt = "Password:")
    private char[] password;

    @Option(names = {"-d", "--debug"}, description = "Debug mode")
    boolean debug;

    @Parameters(arity = "0..1")
    private String path;

    @Override
    public CliResult call() throws Exception {
        var core = new JMacroCore();
        core.start();
        if (debug) {
            System.out.println(core.getConfiguration().serialize());
            core.getConfiguration().getRepository().getRepositories().forEach((repo) -> {
                System.out.println(repo.getId() + ":" + repo.getUri());
                repo.list().forEach(script -> {
                    System.out.println(" - " + repo.pathToLocation(script.getPath()));
                });
            });
        }

        var script = core.getConfiguration().getRepository().get(this.path);
        ScriptResult scriptResult = core.getEngine().execute(
            script.get(),
            scriptEngine -> {
                Bindings bindings = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE);
                Credentials credentials = (Credentials) bindings.get("credentials");
                credentials.setLogin(login);
                credentials.setPassword(password);
            }
        );
        return new CliResult(scriptResult);
    }
}
