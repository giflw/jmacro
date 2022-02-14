package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.commands.base.Result
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.command.Doc

import javax.script.ScriptEngine

@Doc("Allows reading from java console.")
class ConsoleCommand extends Command implements Constants {

    @Doc("Prompt prefix constant.")
    private static final String PROMPT = '[INPT] '

    @Doc("Java system console.")
    private Console console = System.console()

    ConsoleCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    /*Result call(Console console, Closure closure) {
        this.console = console
        return call(closure)
    }*/

    @Doc("""
            Allow calling console as function, redirecting closure calls to console as delegate:

            ```
            console {
                def foo = read()
                def bar = read('fieldLabel')
            }
            ```

            instead of
            ```
            def foo = console.read()
            def bar = console.read('fieldLabel')
            ```
            """)
    Result call(@Doc(name = "closure") Closure closure) {
        closure.delegate = this
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        return closure.call()
    }

    @Doc("Read line from console.")
    String read() {
        System.out.print "${PROMPT}\$> "
        return console.readLine()
    }

    @Doc("Read line as field from console using map as parameter configuration.")
    String read(
        @Doc(name = "args", value = "Map describing field to read: `[label: 'Label', fallback: 'default value', allowed: ['allowed', 'values'], nonInteractive: false, password: false]`")
            Map<String, ?> args) {
        return read(args.label, args.fallback ?: '', args.allowed ?: Collections.EMPTY_LIST, args.nonInteractive ?: false, args.password ?: false)
    }

    @Doc("Read line as field from console using explicit parameter configuration.")
    String read(
        @Doc(name = "label", value = "Field label")        String label,
        @Doc(name = "fallback", value = "Fallback (default) value. Default is `null`.") String fallback = null,
        @Doc(name = "allowed", value = "List of allowed values as String. Default is empty list.") List<String> allowed = Collections.EMPTY_LIST,
        @Doc(name = "nonInteractive", value = "Non interactive flag. Disable interaction if value is `true`. Useful for automation. Default is `false`")boolean nonInteractive = false,
        @Doc(name = "password", value = "Password flag. Change read mode to password if `true`. Default is `false`")boolean password = false) {
        def showValue = fallback ?: ''
        showValue = password ? showValue.replaceAll('.', '*') : showValue
        def allowedStr = "[${allowed.join(',')}] "
        System.out.print "${PROMPT}$label ${allowedStr.length() > 3 ? allowedStr : ''}[${showValue}]: "
        def value = nonInteractive
            ? System.out.println()
            : (password ? console.readPassword().toString() : console.readLine())?.trim()
        return (value ?: fallback) ?: ''
    }

    @Doc("Read password from console.")
    String password(
        @Doc(name = "message", value = "Message to show.") String message,
        @Doc(name = "defaultValue", value = "Default value.") String defaultValue = "",
        @Doc(name = "nonInteractive", value = "Non interactive flag.") boolean nonInteractive = false) {
        return read(message, defaultValue, nonInteractive, true)
    }

    def credentials(Map<String, Map<String, String>> fields, boolean nonInteractive = false, Closure<Boolean> checkCredentials = {
        ->
        true
    }) {
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
