package com.itquasar.multiverse.jmacro.core.util;

import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

import java.io.*;
import java.util.function.Consumer;

@UtilityClass
@Log4j2
public class IOUtils {


    @SneakyThrows
    void transfer(InputStream in, OutputStream out) {
        in.transferTo(out);
    }

    @SneakyThrows
    public Pipe pipe() {
        return new Pipe();
    }

    public static class Pipe {
        private final PipedInputStream in;
        private final PipedOutputStream out;

        @SneakyThrows
        Pipe() {
            this.in = new PipedInputStream();
            this.out = new PipedOutputStream(in);
        }

        public void flow(Consumer<OutputStream> consumer) {
            Thread.startVirtualThread(() -> {
                consumer.accept(this.out);
                try {
                    this.out.close();
                } catch (IOException e) {
                    throw new JMacroException("Error flowing pipe", e);
                }
            });
        }

        public InputStream in() {
            return this.in;
        }

        public OutputStream out() {
            return this.out;
        }
    }
}
