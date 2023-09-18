package com.itquasar.multiverse.jmacro.core.engine;

import java.io.Closeable;

public interface ScriptUI extends Closeable {

    String EMPTY = "";

    static ScriptUI get() {
        return new ConsoleScriptUI();
    }

    default String read() {
        return readLine(EMPTY);
    }

    default String readLine() {
        return readLine(EMPTY);
    }

    default String read(String prompt) {
        return this.readLine(prompt);
    }

    /**
     * @param prompt Must be not null
     * @return read line
     */
    String readLine(String prompt);

    default String password() {
        return readPassword(EMPTY);
    }

    default String readPassword() {
        return readPassword(EMPTY);
    }

    default String password(String prompt) {
        return readPassword(prompt);
    }

    /**
     * @param prompt Must be not null
     * @return read password
     */
    String readPassword(String prompt);


    default void writeln(String str) {
        this.write(str, true);
    }
    default void write(String str) {
        this.write(str, false);
    }

    void newLine();

    /**
     * @param text    Must be not null
     * @param newLine If a new line must be issued after text
     */
    void write(String text, boolean newLine);

}
