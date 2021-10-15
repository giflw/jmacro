package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.core.command.LoggingCommand;
import com.itquasar.multiverse.jmacro.core.exceptions.JMacroException;
import com.itquasar.multiverse.jmacro.core.script.GlobalScriptRepository;
import com.itquasar.multiverse.jmacro.core.script.Script;
import lombok.SneakyThrows;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Include extends LoggingCommand {

    private final GlobalScriptRepository repository;
    private final ScriptEngine scriptEngine;
    private final ScriptContext scriptContext;
    private List<Script> included = new ArrayList<>();

    public Include(GlobalScriptRepository repository, ScriptEngine scriptEngine, ScriptContext scriptContext) {
        super(scriptContext);
        this.repository = repository;
        this.scriptEngine = scriptEngine;
        this.scriptContext = scriptContext;
    }

    @SneakyThrows
    public void call(String name) {
        Optional<Script> optionalScript = this.repository.get(name);
        this.include(name, optionalScript);
    }

    public void call(Map<String, String> scriptsAndRepos) {
        for (String repo : scriptsAndRepos.keySet()) {
            String script = scriptsAndRepos.get(repo);
            Optional<Script> optionalScript = this.repository.get(repo, script);
            this.include(repo + ":" + script, optionalScript);
        }
    }

    @SneakyThrows
    private void include(String locator, Optional<Script> script) {
        if (script.isPresent()) {
            this.getLogger().warn("Including " + locator);
            this.scriptEngine.eval(script.get().getSource(), this.scriptContext);
        } else {
            throw new JMacroException(this, "Could not find " + locator + " to include");
        }
    }
}
