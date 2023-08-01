package com.itquasar.multiverse.jmacro.commands.base.commands


import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.SelfConsumerCommand
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.exception.ExitException
import com.itquasar.multiverse.jmacro.core.interfaces.Constants
import groovy.transform.CompileDynamic

import javax.script.ScriptEngine
import java.util.function.Supplier

class ConsoleCommand extends AbstractCommand implements SelfConsumerCommand<ConsoleCommand>, Constants {

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


    private static final String PROMPT = '[INPT] '


    private InReader readerAndWriter = new InReader()

    ConsoleCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    String read() {
        System.out.print "${PROMPT}\$> "
        return readerAndWriter.readLine()
    }

    String read(Map<String, ?> args) {
        return read(
            (String) args.label,
            (String) args.fallback ?: '',
            (List<String>) args.allowed ?: Collections.EMPTY_LIST,
            (boolean) args.nonInteractive ?: false,
            (boolean) args.password ?: false
        )
    }


    String read(String label, String fallback = null, List<String> allowed = Collections.EMPTY_LIST, boolean nonInteractive = false, boolean password = false) {
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

    String password(String message, String fallback = "", boolean nonInteractive = false) {
        return read(message, fallback, null, nonInteractive)
    }

    @CompileDynamic
    def credentials(Map<String, Map<String, String>> fields, boolean nonInteractive = false, Supplier<Boolean> checkCredentials = { -> true }) {
        do {
            fields.each { entry ->
                String field = entry.key
                String label = entry.value.label
                String fallback = entry.value.fallback
                List<String> allowed = entry.value.allowed ?: List.of() as List<String>
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
