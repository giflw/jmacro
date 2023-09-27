package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CallableCommand;
import com.itquasar.multiverse.jmacro.core.command.Command;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.interfaces.Constants;
import lombok.Getter;

import javax.script.Bindings;
import javax.script.ScriptContext;
import java.util.*;
import java.util.stream.Collectors;

// FIXME shouldnt have a "catch" block ???
public class ArgsCommandProvider implements CommandProvider<ArgsCommandProvider.ArgsCommand> {

    @Override
    public Class<ArgsCommand> getCommandType() {
        return ArgsCommand.class;
    }

    @Override
    public ArgsCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new ArgsCommand(core, scriptEngineAware);
    }

    @Getter
    public static class ArgsCommand extends AbstractCommand implements CallableCommand<String, Object>, Constants, Iterable<String> {

        private List<String> args = null;

        private Map<String, ?> argm = null;

        public ArgsCommand(Core core, ScriptEngineAware scriptEngineAware) {
            super(core, scriptEngineAware);
        }

        @SuppressWarnings("unchecked")
        @Override
        public void allCommandsRegistered(Collection<? extends Command> commands) {
            Bindings bindings = getScriptEngine().getBindings(ScriptContext.ENGINE_SCOPE);
            this.setArgs((List<String>) bindings.get(ARGV));
        }

        synchronized private void setArgs(List<String> argsOrig) {
            if (this.args == null) {
                Map<String, Object> argsMap = new LinkedHashMap<>();

                getScriptLogger().warn("Setting args to " + argsOrig);
                this.args = Collections.unmodifiableList(argsOrig);

                argsMap.put(SCRIPT_LOCATION, args.isEmpty() ? "" : args.get(0));

                this.args.forEach(key -> {
                    Object value = true;
                    if (key.contains("=")) {
                        String[] parts = key.split("=", 2);
                        key = parts[0];
                        value = cast(parts[1]);
                    }
                    argsMap.put(key, value);
                });
                this.argm = Collections.unmodifiableMap(argsMap);
            } else {
                throw new JMacroException("Args already set!");
            }
        }

        @Override
        public Object call(String argName) {
            return get(argName);
        }

        public boolean isIncluded() {
            return args.get(0).startsWith(INCLUDED);
        }

        public <T> T get(String key) {
            return (T) argm.get(key);
        }

        public <T> T getAt(String key) {
            return this.get(key);
        }

        public <T> T get(int key) {
            return (T) args.get(key);
        }

        public <T> T getAt(int key) {
            return this.get(key);
        }

        public <T> T script() {
            return this.get(0);
        }

        public <T> T first() {
            return this.get(1);
        }

        @Override
        public Iterator<String> iterator() {
            return this.args.subList(1, this.args.size()).iterator();
        }

        public <T> T last() {
            return (T) this.args.get(this.args.size() - 1);
        }

        private Object cast(String value) {
            // -f=true / --foo=false
            if ("true".equals(value) || "false".equals(value)) {
                return Boolean.valueOf(value);
            }
            // -f=123 / --foo=123
            if (value.matches("\\d+")) {
                return Long.valueOf(value);
            }
            // -f=123,45 / --foo=123.45
            if (value.matches("[\\d,.]+")) {
                return Double.valueOf(value);
            }
            // -f=a=123,b=abc / --foo=a=123,b=abc
            if (value.contains(",") && value.contains("=")) {
                return Arrays.asList(value.split(",")).stream()
                    .map(entry -> {
                        String[] parts = entry.split("=", 2);
                        return new Object[]{parts[0], parts.length == 2 ? cast(parts[1]) : true};
                    })
                    .collect(Collectors.toMap(it -> it[0], it -> it[1]));
            }
            // -f=123,abc / --foo=a=123,abc
            if (value.contains(",")) {
                return Collections.unmodifiableList(Arrays.asList(value.split(",")));
            }
            // otherwise, keeps given value
            return value;
        }

        @Override
        public String toString() {
            return argm.toString();
        }
    }

}
