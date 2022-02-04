package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.commands.base.Result
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.JMacroCore

import javax.script.ScriptEngine

class ConsoleCommand extends Command implements Constants {

    private Console console = System.console()

    ConsoleCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    Result call(Console console, Closure closure) {
        this.console = console
        return call(closure)
    }

    Result call(Closure closure) {
        closure.delegate = this
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        return closure.call()
    }

    String read() {
        System.out.print '[INPT]$> '
        return console.readLine()
    }

    String read(Map<String, ?> args) {
        return read(args.label, args.fallback ?: '', args.allowed ?: Collections.EMPTY_LIST, args.nonInteractive ?: false, args.password ?: false)
    }

    String read(String label, String fallback = null, List<String> allowed = Collections.EMPTY_LIST, boolean nonInteractive = false, boolean password = false) {
        def showValue = fallback ?: ''
        showValue = password ? showValue.replaceAll('.', '*') : showValue
        def allowedStr = "[${allowed.join(',')}] "
        System.out.print "[INPT] $label ${allowedStr.length() > 3 ? allowedStr : ''}[${showValue}]: "
        def value = nonInteractive
            ? System.out.println()
            : (password ? console.readPassword().toString() : console.readLine())?.trim()
        return (value ?: fallback) ?: ''
    }

    String password(String message, String defaultValue = "", boolean nonInteractive = false) {
        return read(message, defaultValue, nonInteractive, true)
    }

    def credentials(Map<String, Map<String, String>> fields, boolean nonInteractive = false, Closure<Boolean> checkCredentials = { -> true }) {
        do {
            fields.each { entry ->
                String field = entry.key
                String label = entry.value.label
                String fallback = entry.value.fallback
                List<String> allowed = entry.value.allowed ?: List.of()
                this.credential(field, label, fallback, allowed, nonInteractive)
            }
        } while (!checkCredentials())
    }

    def credential(String field, String label, String fallback, List<String> allowed, boolean nonInteractive = false) {
        bindings.credentials."$field" = read(label, bindings.credentials."$field" ?: fallback, allowed, nonInteractive, field == 'password')
        return bindings.credentials."$field"
    }

    boolean assureCredentials(String... fields) {
        boolean isOk = true
        fields.each { field ->
            isOk = isOk && !(bindings.credentials."$field" ?: '').isEmpty()
        }
        return isOk
    }
}
