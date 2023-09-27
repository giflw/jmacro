package com.itquasar.multiverse.jmacro.core.command;

import com.itquasar.multiverse.jmacro.core.engine.ConfigurationHolder;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import lombok.Getter;


@Getter
public abstract class ConfigurationAwareCommand<C> extends AbstractCommand {

    protected final ConfigurationHolder<C> configuration;

    public ConfigurationAwareCommand(Core core, ScriptEngineAware scriptEngineAware) {
        super(core, scriptEngineAware);
        this.configuration = new ConfigurationHolder<>(this.initConfiguration());
    }

    protected abstract C initConfiguration();

}
