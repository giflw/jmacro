package com.itquasar.multiverse.jmacro.commands.io.commands

import com.itquasar.multiverse.jmacro.commands.io.commands.request.Request
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Core
import groovy.transform.CompileDynamic

import javax.script.ScriptContext
import javax.script.ScriptEngine

/**
 * Request is used to make HTTP requests.
 * Request block are executed automatically at the end of the block,
 * or can be executed at any time using {@link RequestCommand#execute()}.
 *
 * Syntax:
 *
 * <pre>
 *     request {*       // METHOD and url must be before body calls
 *       POST|GET url
 *       header = value
 *
 *       body_call()
 *       // code
 *}* </pre>*/
class RequestCommand extends Command {

    RequestCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    @CompileDynamic
    Request call(Closure closure) {
        def action = new Request(getBindings())
        def requestConfig = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).get('configuration')?.request
        if (requestConfig?.headers) {
            action.headers.putAll(requestConfig.headers as Map<String, String>)
        }
        action.call(closure)
        return action
    }

}
