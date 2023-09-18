package com.itquasar.multiverse.jmacro.core.engine

import com.itquasar.multiverse.jmacro.core.exception.ExitException
import groovy.transform.CompileDynamic

class ConsoleScriptUI implements ScriptUI {

    private final Object reader

    ConsoleScriptUI() {
        def reader = System.console()
        if (reader == null) {
            reader = new BufferedReader(new InputStreamReader(System.in))
        }
        this.reader = reader
    }

    String readLine(String prompt) {
        this.write(prompt, false)
        String line = (String) this.reader.invokeMethod('readLine', null)
        if (line == null) {
            throw new ExitException(0)
        }
        return line
    }

    String readPassword(String prompt) {
        this.write(prompt, false)
        if (this.reader.respondsTo('readPassword')) {
            return new String((char[]) this.reader.invokeMethod('readPassword', null))
        } else {
            return this.reader.invokeMethod('readLine', null)?.toString()
        }
    }

    @Override
    void write(String text, boolean newLine) {
        if (text != null && !text.isEmpty()) {
            if (newLine) {
                println(text)
            } else {
                print(text)
            }
        }
    }

    @Override
    void newLine() {
        println()
    }

    @CompileDynamic
    @Override
    void close() throws IOException {
        if (reader != null && reader.respondsTo('close')) {
            reader.invokeMethod('close', null)
        }
    }


}
