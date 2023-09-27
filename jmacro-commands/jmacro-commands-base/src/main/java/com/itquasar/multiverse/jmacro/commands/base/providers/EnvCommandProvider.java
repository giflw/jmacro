package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.CallableCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.command.ConfigurationAwareCommand;
import com.itquasar.multiverse.jmacro.core.configuration.Env;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class EnvCommandProvider implements CommandProvider<EnvCommandProvider.EnvCommand> {

    @Override
    public Class<EnvCommand> getCommandType() {
        return EnvCommand.class;
    }

    @Override
    public EnvCommand getCommand(final Core core, final ScriptEngineAware scriptEngineAware) {
        return new EnvCommand(core, scriptEngineAware);
    }

    public static class EnvCommand extends ConfigurationAwareCommand<Env> implements CallableCommand<String, Env> {

        public EnvCommand(Core core, ScriptEngineAware scriptEngineAware) {
            super(core, scriptEngineAware);
        }

        @Override
        protected Env initConfiguration() {
            return Env.env("DEV");
        }

        public Env call() {
            return this.configuration.get();
        }

        public Env call(String name) {
            return this.call(Env.env(name));
        }

        public Env call(Env env) {
            this.configuration.set(Env.env(env));
            return this.configuration.get();
        }

        @Override
        public Object propertyMissing(String name) {
            return Env.env(name);
        }
    }

}
