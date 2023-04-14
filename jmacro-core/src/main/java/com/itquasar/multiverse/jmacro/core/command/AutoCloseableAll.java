package com.itquasar.multiverse.jmacro.core.command;


public interface AutoCloseableAll extends AutoCloseable {

    void closeAll() throws Exception;
}
