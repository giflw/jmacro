package com.itquasar.multiverse.jmacro.commands.base.providers;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.List;

import javax.script.ScriptEngine;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import lombok.Getter;
import lombok.SneakyThrows;

public class Base64CommandProvider implements CommandProvider<Base64CommandProvider.Base64Command> {

    @Override
    public String getName() {
        return "base64";
    }

    @Override
    public List<String> getAliases() {
        return List.of("b64");
    }

    @Override
    public Class<Base64Command> getCommandType() {
        return Base64Command.class;
    }

    @Override
    public Base64Command getCommand(final JMacroCore jMacroCore, final ScriptEngine scriptEngine) {
        return new Base64Command(this.getName(), jMacroCore, scriptEngine);
    }

    static public class Base64Command extends Command {

        public enum Codec {

            BASIC(Base64.getEncoder(), Base64.getDecoder()),
            MIME(Base64.getMimeEncoder(), Base64.getMimeDecoder()),
            URL(Base64.getUrlEncoder(), Base64.getUrlDecoder());

            @Getter
            private final Encoder encoder;

            @Getter
            private final Decoder decoder;

            Codec(final Encoder encoder, final Decoder decoder) {
                this.encoder = encoder;
                this.decoder = decoder;
            }
        }

        public Base64Command(final String name, final JMacroCore core, final ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }



        /**
         * Encode to base64 and return String
         * base64 << text
         *
         * @param text
         * @return
         */
        public String leftShift(final String text) {
            return this.encode(text);
        }

        /**
         * Decode base64 and return String
         * base64 >> text
         *
         * @param text
         * @return
         */
        public String rightShift(final String text) {
            return new String(this.decode(text), StandardCharsets.UTF_8);
        }

        public String call(final String text) {
            return this.encode(text);
        }

        public String call(final byte[] bytes) {
            return this.encode(bytes);
        }

        public String enc(final String text) {
            return this.encode(text);
        }

        public String encode(final String text) {
            return this.encode(text.getBytes(StandardCharsets.UTF_8));
        }

        public String encode(final byte[] bytes) {
            return Codec.BASIC.getEncoder().encodeToString(bytes);
        }

        public String dec(final String text) {
            return new String(this.decode(text), StandardCharsets.UTF_8);
        }

        public byte[] decode(final String text) {
            return this.decode(text.getBytes(StandardCharsets.UTF_8));
        }

        public byte[] decode(final byte[] bytes) {
            return Codec.BASIC.getDecoder().decode(bytes);
        }

        public InputStream decode(final InputStream input) {
            return this.decode(input, Codec.BASIC);
        }

        @SneakyThrows
        public InputStream decode(final InputStream input, final Codec codec) {
            final var buffer = codec.getDecoder().decode(input.readAllBytes());
            return new ByteArrayInputStream(buffer);
        }

    }
}


