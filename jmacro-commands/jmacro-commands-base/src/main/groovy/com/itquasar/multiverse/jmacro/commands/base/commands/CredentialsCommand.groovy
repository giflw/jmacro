package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.CommandUtils
import com.itquasar.multiverse.jmacro.core.command.ConsumerCommand
import com.itquasar.multiverse.jmacro.core.configuration.Credentials
import com.itquasar.multiverse.jmacro.core.engine.Core
import groovy.transform.CompileDynamic

import javax.script.ScriptEngine
import java.util.function.Consumer

class CredentialsCommand extends AbstractCommand implements ConsumerCommand<Credentials> {

    private final Credentials defaultCredentials = new Credentials()

    CredentialsCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    Credentials get() {
        return this.defaultCredentials
    }

    @Override
    Credentials call(Consumer<Credentials> consumer) {
        consumer.accept(defaultCredentials)
        return defaultCredentials
    }

    def propertyMissing(String name) {
        CommandUtils.propertyMissingOnOrChainToContext(this, defaultCredentials, name)
    }

    def methodMissing(String name, def args) {
        CommandUtils.methodMissingOnOrChainToContext(this, defaultCredentials, name, args)
    }
}
