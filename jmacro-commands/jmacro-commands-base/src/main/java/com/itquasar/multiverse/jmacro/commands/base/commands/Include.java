package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.core.command.LoggingCommand;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.repository.GlobalScriptRepository;
import com.itquasar.multiverse.jmacro.core.script.Script;
import lombok.SneakyThrows;

import javax.script.ScriptEngine;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Include extends LoggingCommand {

    private final GlobalScriptRepository repository;
    private final ScriptEngine scriptEngine;
    private final String extension;
    private List<Script> included = new ArrayList<>();

    public Include(GlobalScriptRepository repository, ScriptEngine scriptEngine) {
        super(scriptEngine.getContext());
        this.repository = repository;
        this.scriptEngine = scriptEngine;
        this.extension = scriptEngine.getFactory().getExtensions().get(0);
    }

    @SneakyThrows
    public void call(String name) {
        Optional<Script> optionalScript = this.repository.get(name.endsWith(extension) ? name : name + '.' + extension);
        this.include(name, optionalScript);
    }

    public void call(Map<String, String> scriptsAndRepos) {
        for (String repo : scriptsAndRepos.keySet()) {
            String script = scriptsAndRepos.get(repo);
            script = script.endsWith(extension) ? script : script + '.' + extension;
            Optional<Script> optionalScript = this.repository.get(repo, script);
            this.include(repo + ":" + script, optionalScript);
        }
    }

    @SneakyThrows
    private void include(String locator, Optional<Script> script) {
        if (script.isPresent()) {
            this.getLogger().warn("Including " + locator);
            this.scriptEngine.eval(script.get().getSource());
        } else {
            throw new JMacroException(this, "Could not find " + locator + " to include");
        }
    }
}
