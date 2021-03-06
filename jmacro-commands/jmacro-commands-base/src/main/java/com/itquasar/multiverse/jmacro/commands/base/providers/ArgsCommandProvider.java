package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.Constants;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import lombok.Getter;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import java.util.*;
import java.util.stream.Collectors;

// FIXME shouldnt have a "catch" block ???
public class ArgsCommandProvider implements CommandProvider<ArgsCommandProvider.ArgsCommand> {

    @Override
    public String getName() {
        return "args";
    }

    @Override
    public Class<ArgsCommand> getCommandType() {
        return ArgsCommand.class;
    }

    @Override
    public ArgsCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new ArgsCommand(getName(), jMacroCore, scriptEngine);
    }

    public static class ArgsCommand extends Command implements Constants {

        @Getter
        private List<String> args = null;
        @Getter
        private Map<String, ?> argm = null;

        public ArgsCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        public void allCommandsRegistered() {
            Bindings bindings = getScriptEngine().getBindings(ScriptContext.ENGINE_SCOPE);
            this.setArgs((List<String>) bindings.get(ARGV));
        }

        synchronized private void setArgs(List<String> args) {
            if (this.args == null) {
                args = new ArrayList<>(args);
                args.set(0, SCRIPT_LOCATION  + "=" + args.get(0));
                this.args = Collections.unmodifiableList(args);
                Map<String, Object> argsMap = new LinkedHashMap<>();
                this.args.forEach(arg -> {
                    String key = cleanKey(arg);
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
                throw new JMacroException("Args already setted!");
            }
        }

        public boolean isIncluded() {
            Object included = argm.get(INCLUDED);
            return included != null && ((boolean) included) == true;
        }

        public <T> T get(String key) {
            return (T) argm.get(key);
        }

        public <T> T get(int key) {
            return (T) args.get(key);
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

        private String cleanKey(String key) {
//            while (key.startsWith("-")) {
//                key = key.substring(1);
//            }
            return key;
        }

        @Override
        public String toString() {
            return argm.toString();
        }
    }

}
