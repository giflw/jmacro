package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.interfaces.Constants;

import java.util.*;

public class RequireCommandProvider implements CommandProvider<RequireCommandProvider.RequireCommand> {

    @Override
    public Class<RequireCommand> getCommandType() {
        return RequireCommand.class;
    }

    @Override
    public RequireCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new RequireCommand(core, scriptEngineAware);
    }

    public static class RequireCommand extends AbstractCommand implements Constants {

        public RequireCommand(Core core, ScriptEngineAware scriptEngineAware) {
            super(core, scriptEngineAware);
        }

        void api(float version) {
            api(version + ".0");
        }

        void api(Number version) {
            api(version.floatValue());
        }

        void api(String version) {
            var requiredVersion = new ArrayList<>(Arrays.stream(version.split("\\.")).map(Integer::valueOf).toList());
            while (requiredVersion.size() < 3) {
                requiredVersion.add(0);
            }
            api(version, requiredVersion);
        }

        void api(List<Integer> requiredVersion) {
            api(requiredVersion.stream().map(String::valueOf).reduce("", String::concat), requiredVersion);
        }

        private void api(String version, List<Integer> requiredVersion) {
            var apiVersion = new ArrayList<>(Arrays.stream(API_VERSION.split("\\.")).map(Integer::valueOf).toList());
            while (apiVersion.size() < 3) {
                apiVersion.add(0);
            }
            // check major version (api == required)
            boolean matched = apiVersion.get(0).equals(requiredVersion.get(0));
            // check minor/fix version (major: api == required && minor: api >= required || major: api > required)
            matched = matched && (apiVersion.get(1).equals(requiredVersion.get(1)) ? apiVersion.get(2) >= requiredVersion.get(2) : apiVersion.get(1) > requiredVersion.get(1));
            if (!matched) {
                throw new JMacroException("Required API version " + version + " not supported. Actual version is " + API_VERSION + ".");
            }
            getScriptLogger().warn("Required API version matched: " + API_VERSION + " >= " + version + " (matching == major)");
        }

        void call(String... commandNames) {
            call(Collections.emptyMap(), commandNames);
        }

        void call(Map<String, Object> options, String... commandNames) {
            var api = options.getOrDefault("api", Constants.API_VERSION);
            if (api instanceof Number number) {
                api(number);
            } else {
                api(api.toString());
            }
            Arrays.stream(commandNames).forEach(commandName -> {
                var command = getBindings().get(commandName);
                if (command == null) {
                    throw new JMacroException("Required command " + commandName + " not available.");
                }
                getScriptLogger().warn("Required command found: " + commandName + " = " + command);
            });
        }

    }

}
