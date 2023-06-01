package com.itquasar.multiverse.jmacro.commands.server.providers;

import com.itquasar.multiverse.jmacro.core.Core;
import com.itquasar.multiverse.jmacro.core.WrappingCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.command.Doc;
import groovy.lang.Closure;
import io.javalin.Javalin;

import javax.script.ScriptEngine;

public class HttpdProvider implements CommandProvider<HttpdProvider.HttpdCommand> {

    @Override
    public String getName() {
        return "httpd";
    }

    @Override
    public Class<HttpdCommand> getCommandType() {
        return HttpdCommand.class;
    }

    @Override
    public HttpdCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new HttpdCommand(getName(), core, scriptEngine);
    }

    public static class HttpdCommand extends WrappingCommand<Javalin> implements AutoCloseable {

        public HttpdCommand(String name, Core core, ScriptEngine scriptEngine) {
            super(() -> Javalin.create(), name, core, scriptEngine);
        }

        @Doc("""
            Dispatch closure calls to Javalin inner instance.

            See http://javalin.io
            """)
        public Object call(Closure closure) {
            closure.setDelegate(this.unwrap());
            closure.setResolveStrategy(Closure.DELEGATE_FIRST);
            return closure.call();
        }

        @Doc("""
            Returns wrapped Javalin instance.

            See http://javalin.io
            """)
        @Override
        public Javalin unwrap() {
            return super.unwrap();
        }

        @Override
        public void close() {
            this.unwrap().stop();
        }
    }

}
