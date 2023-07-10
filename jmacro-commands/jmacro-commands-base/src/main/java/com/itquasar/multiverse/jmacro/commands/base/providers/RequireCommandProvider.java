package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.CallableCommand;
import com.itquasar.multiverse.jmacro.core.Constants;
import com.itquasar.multiverse.jmacro.core.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

import javax.script.ScriptEngine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequireCommandProvider implements CommandProvider<RequireCommandProvider.RequireCommand> {

    @Override
    public String getName() {
        return "require";
    }

    @Override
    public Class<RequireCommand> getCommandType() {
        return RequireCommand.class;
    }

    @Override
    public RequireCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new RequireCommand(getName(), core, scriptEngine);
    }

    public static class RequireCommand extends CallableCommand implements Constants {

        public RequireCommand(String name, Core core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        void api(int version) {
            api(version + ".0.0");
        }

        void api(float version) {
            api(version + ".0");
        }

        void api(String version) {
            var requiredVersion = new ArrayList<>(
                Arrays.stream(version.split("\\.")).map(Integer::valueOf).toList()
            );
            while (requiredVersion.size() < 3) {
                requiredVersion.add(0);
            }
            api(version, requiredVersion);
        }

        void api(List<Integer> requiredVersion) {
            api(requiredVersion.stream().map(String::valueOf).reduce((a, b) -> a + b).get(), requiredVersion);
        }

        private void api(String version, List<Integer> requiredVersion) {
            var apiVersion = new ArrayList<>(
                Arrays.stream(API_VERSION.split("\\.")).map(Integer::valueOf).toList()
            );
            while (apiVersion.size() < 3) {
                apiVersion.add(0);
            }
            // check major version (api == required)
            boolean matched = apiVersion.get(0) == requiredVersion.get(0);
            // check minor/fix version (major: api == required && minor: api >= required || major: api > required)
            matched = matched && apiVersion.get(1) == requiredVersion.get(1) ? apiVersion.get(2) >= requiredVersion.get(2) : apiVersion.get(1) > requiredVersion.get(1);
            if (!matched) {
                throw new JMacroException("Required API version " + version + " not supported. Actual version is " + API_VERSION + ".");
            }
            getScriptLogger().warn("Required API version matched: " + API_VERSION + " >= " + version + " (matching == major)");
        }

        void call(String commandName) {
            var command = getBindings().get(commandName);
            if (command == null) {
                throw new JMacroException("Required command " + commandName + " not available.");
            }
            getScriptLogger().warn("Required command found: " + commandName + " = " + command);
        }

        @Override
        public Object methodMissing(String name, Object args) {
            throw new JMacroException("Method missing not implemented in " + this.getClass().getSimpleName());
        }

        @Override
        public Object propertyMissing(String name) {
            call(name);
            return null;
        }

        @Override
        public Object propertyMissing(String name, Object arg) {
            throw new JMacroException("Property missing (set) not implemented in " + this.getClass().getSimpleName());
        }

    }

}
