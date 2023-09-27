package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.CommandUtils
import com.itquasar.multiverse.jmacro.core.command.ConsumerCommand
import com.itquasar.multiverse.jmacro.core.configuration.Credentials
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware

import java.util.function.Consumer

class CredentialsCommand extends AbstractCommand implements ConsumerCommand<Credentials> {

    private final Credentials defaultCredentials = new Credentials()

    CredentialsCommand(Core core, ScriptEngineAware scriptEngineAware) {
        super(core, scriptEngineAware)
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

    def propertyMissing(String name, def args) {
        CommandUtils.propertyMissingOnOrChainToContext(this, defaultCredentials, name, args)
    }

    def methodMissing(String name, def args) {
        CommandUtils.methodMissingOnOrChainToContext(this, defaultCredentials, name, args)
    }
}
