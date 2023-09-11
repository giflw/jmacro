package com.itquasar.multiverse.jmacro.commands.base.commands.configuration;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import lombok.Getter;

import javax.script.ScriptEngine;


@Getter
public abstract class ConfigurationAwareCommand<C> extends AbstractCommand {

    protected final ConfigurationHolder<C> configuration;

    public ConfigurationAwareCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
        this.configuration = new ConfigurationHolder<>(this.initConfiguration());
    }

    protected abstract C initConfiguration();

}
