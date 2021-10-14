package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.core.script.GlobalScriptRepository;
import com.itquasar.multiverse.jmacro.core.script.Script;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Log4j2
public class Include {

    private final GlobalScriptRepository repository;
    private final ScriptEngine scriptEngine;
    private final ScriptContext scriptContext;
    private List<Script> included = new ArrayList<>();

    public Include(GlobalScriptRepository repository, ScriptEngine scriptEngine, ScriptContext scriptContext) {
        this.repository = repository;
        this.scriptEngine = scriptEngine;
        this.scriptContext = scriptContext;
    }

    @SneakyThrows
    public void call(String name) {
        Optional<Script> optionalScript = this.repository.get(name);
        if (optionalScript.isPresent()) {
            this.scriptEngine.eval(optionalScript.get().getSource(), this.scriptContext);
        }
    }

    @SneakyThrows
    public void call(Map<String, String> scriptsAndRepos) {
        for (String repo : scriptsAndRepos.keySet()) {
            Optional<Script> optionalScript = this.repository.get(
                repo,
                scriptsAndRepos.get(repo)
            );
            if (optionalScript.isPresent()) {
                this.scriptEngine.eval(optionalScript.get().getSource(), this.scriptContext);
            }
        }
    }
}
