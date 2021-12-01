package com.itquasar.multiverse.jmacro.commands.io.commands

import com.itquasar.multiverse.jmacro.commands.io.commands.request.Request as RequestAction
import groovy.transform.CompileDynamic
import groovy.util.logging.Log4j2

import javax.script.ScriptContext
import javax.script.ScriptEngine

/**
 * Request is used to make HTTP requests.
 * Request block are executed automatically at the end of the block,
 * or can be executed at any time using {@link Request#execute()}.
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
@Log4j2
@CompileDynamic
class Request {

    private ScriptEngine scriptEngine

    Request(ScriptEngine scriptEngine) {
        this.scriptEngine = scriptEngine
    }

    RequestAction call(Closure closure) {
        def action = new RequestAction(scriptEngine.getContext())
        def requestConfig = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).get('configuration')?.request
        if (requestConfig?.headers) {
            action.headers.putAll(requestConfig.headers as Map<String, String>)
        }
        action.call(closure)
        return action
    }

}
