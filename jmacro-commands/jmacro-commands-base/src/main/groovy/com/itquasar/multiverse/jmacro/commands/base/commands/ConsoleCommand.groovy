package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.commands.base.Result
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.Core
import com.itquasar.multiverse.jmacro.core.command.Doc
import com.itquasar.multiverse.jmacro.core.exception.ExitException
import groovy.transform.CompileDynamic

import javax.script.ScriptEngine

@Doc("Allows reading from java console.")
class ConsoleCommand extends Command implements Constants {

    static class InReader implements Closeable {

        private final Object reader

        InReader() {
            def reader = System.console()
            if (reader == null) {
                reader = new BufferedReader(new InputStreamReader(System.in))
            }
            this.reader = reader
        }

        String readLine() {
            String line = (String) this.reader.invokeMethod('readLine', null)
            if (line == null) {
                throw new ExitException(0)
            }
            return line
        }

        char[] readPassword() {
            if (this.reader.respondsTo('readPassword')) {
                return (char[]) this.reader.invokeMethod('readPassword', null)
            } else {
                return this.reader.invokeMethod('readLine', null)?.toString()?.toCharArray()
            }
        }


        @CompileDynamic
        @Override
        void close() throws IOException {
            if (reader != null && reader.respondsTo('close')) {
                reader.invokeMethod('close', null)
            }
        }
    }

    @Doc("Prompt prefix constant.")
    private static final String PROMPT = '[INPT] '

    @Doc("Java system console.")
    private InReader readerAndWriter = new InReader()

    ConsoleCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

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
        return (Result) closure.call()
    }

    @Doc("Read line from console.")
    String read() {
        System.out.print "${PROMPT}\$> "
        return readerAndWriter.readLine()
    }

    @Doc("Read line as field from console using map as parameter configuration.")
    String read(
        @Doc(name = "args", value = "Map describing field to read: `[label: 'Label', fallback: 'default value', allowed: ['allowed', 'values'], nonInteractive: false, password: false]`")
            Map<String, ?> args) {
        return read(
            (String) args.label,
            (String) args.fallback ?: '',
            (List<String>) args.allowed ?: Collections.EMPTY_LIST,
            (boolean) args.nonInteractive ?: false,
            (boolean) args.password ?: false
        )
    }

    @Doc("Read line as field from console using explicit parameter configuration.")
    String read(
        @Doc(name = "label", value = "Field label") String label,
        @Doc(name = "fallback", value = "Fallback (default) value. Default is `null`.") String fallback = null,
        @Doc(name = "allowed", value = "List of allowed values as String. Default is empty list.") List<String> allowed = Collections.EMPTY_LIST,
        @Doc(name = "nonInteractive", value = "Non interactive flag. Disable interaction if value is `true`. Useful for automation. Default is `false`") boolean nonInteractive = false,
        @Doc(name = "password", value = "Password flag. Change read mode to password if `true`. Default is `false`") boolean password = false) {
        def showValue = fallback ?: ''
        showValue = password ? showValue.replaceAll('.', '*') : showValue
        allowed = allowed ?: []
        def allowedStr = "[${allowed.join(',')}] "
        String prompt = "$label ${allowedStr.length() > 3 ? allowedStr : ''}${showValue ? '[' + showValue + ']' : ''}"
        if (!prompt.trim().isEmpty()) {
            prompt = "${prompt}: "
        }
        System.out.print "${PROMPT}${prompt}"
        def value = nonInteractive
            ? System.out.println()
            : (password ? readerAndWriter.readPassword().toString() : readerAndWriter.readLine())?.trim()
        return (value ?: fallback) ?: ''
    }

    @Doc("Read password from console.")
    String password(
        @Doc(name = "message", value = "Message to show.") String message,
        @Doc(name = "fallback", value = "Default value.") String fallback = "",
        @Doc(name = "nonInteractive", value = "Non interactive flag.") boolean nonInteractive = false) {
        return read(message, fallback, null, true)
    }

    @CompileDynamic
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

    @CompileDynamic
    def credential(String field, String label, String fallback, List<String> allowed, boolean nonInteractive = false) {
        bindings.credentials."$field" = read(label, bindings.credentials."$field" ?: fallback, allowed, nonInteractive, field == 'password')
        return bindings.credentials."$field"
    }

    @CompileDynamic
    boolean assureCredentials(String... fields) {
        boolean isOk = true
        fields.each { field ->
            isOk = isOk && !(bindings.credentials."$field" ?: '').isEmpty()
        }
        return isOk
    }
}
