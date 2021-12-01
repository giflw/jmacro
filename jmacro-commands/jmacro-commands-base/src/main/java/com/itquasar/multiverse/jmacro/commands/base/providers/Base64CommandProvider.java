package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;
import java.nio.charset.StandardCharsets;

public class Base64CommandProvider implements CommandProvider<Base64CommandProvider.Base64> {

    @Override
    public Class<Base64> getCommandType() {
        return Base64.class;
    }

    @Override
    public Base64 getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Base64();
    }

    static public class Base64 {

        /**
         * Encode to base64 and return String
         * base64 << text
         *
         * @param text
         * @return
         */
        public String leftShift(String text) {
            return this.encode(text);
        }

        /**
         * Decode base64 and return String
         * base64 >> text
         *
         * @param text
         * @return
         */
        public String rightShift(String text) {
            return new String(this.decode(text), StandardCharsets.UTF_8);
        }

        public String call(String text) {
            return this.encode(text);
        }

        public String call(byte[] bytes) {
            return this.encode(bytes);
        }

        public String enc(String text) {
            return this.encode(text);
        }

        public String encode(String text) {
            return this.encode(text.getBytes(StandardCharsets.UTF_8));
        }

        public String encode(byte[] bytes) {
            return java.util.Base64.getEncoder().encodeToString(bytes);
        }

        public String dec(String text) {
            return new String(this.decode(text), StandardCharsets.UTF_8);
        }

        public byte[] decode(String text) {
            return this.decode(text.getBytes(StandardCharsets.UTF_8));
        }

        public byte[] decode(byte[] bytes) {
            return java.util.Base64.getDecoder().decode(bytes);
        }

    }
}


