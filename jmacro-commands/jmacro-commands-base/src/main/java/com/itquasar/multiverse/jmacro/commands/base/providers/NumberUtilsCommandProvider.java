package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.*;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.interfaces.Constants;
import lombok.Getter;

import java.math.BigDecimal;

public class NumberUtilsCommandProvider implements CommandProvider<NumberUtilsCommandProvider.NumberUtilsCommand> {

    @Override
    public Class<NumberUtilsCommand> getCommandType() {
        return NumberUtilsCommand.class;
    }

    @Override
    public NumberUtilsCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new NumberUtilsCommand(core, scriptEngineAware);
    }

    @CommandName("numberUtils")
    @CommandAlias("number")
    @CommandAlias("num")
    @CommandAlias("n")
    @Getter
    public static class NumberUtilsCommand extends AbstractCommand implements CallableCommand<String, NumberUtilsCommand.StringToNumber>, Constants {

        public NumberUtilsCommand(Core core, ScriptEngineAware scriptEngineAware) {
            super(core, scriptEngineAware);
        }

        @Override
        public StringToNumber call(String s) {
            return new StringToNumber(s);
        }

        /**
         * @param n      Number to format
         * @param format As used in {@link String#format(String, Object...)}
         * @return Formatted string
         */
        public String call(Number n, String format) {
            return String.format(format, n);
        }

        /**
         * See {@link #call(Number, String)}
         */
        public String call(BigDecimal n, String format) {
            return String.format(format, n);
        }

        /**
         * @param precision Left of decimal point.
         * @param scale     Right of decimal point.
         */
        public record Decimal(int precision, int scale) {

            public Decimal(String precision, String scale) {
                this(Integer.parseInt(precision), Integer.parseInt(scale));
            }

            public int getPrecision() {
                return precision;
            }

            public int getScale() {
                return scale;
            }

            public int left() {
                return precision;
            }

            public int l() {
                return precision;
            }

            public int getL() {
                return precision;
            }

            public int right() {
                return scale;
            }

            public int r() {
                return scale;
            }

            public int getR() {
                return scale;
            }


            @Override
            public String toString() {
                return "Decimal(" + precision + "." + scale + ')';
            }
        }

        public static class StringToNumber extends Number {

            private final String s;
            public StringToNumber(String s) {
                this.s = s;
            }

            @Override
            public int intValue() {
                return Integer.parseInt(s);
            }

            public int i() {
                return intValue();
            }

            public int getI() {
                return intValue();
            }

            @Override
            public long longValue() {
                return Long.parseLong(s);
            }

            public long l() {
                return longValue();
            }

            public long getL() {
                return longValue();
            }

            @Override
            public float floatValue() {
                return Float.parseFloat(s);
            }

            public float f() {
                return floatValue();
            }

            public float getF() {
                return floatValue();
            }

            @Override
            public double doubleValue() {
                return Double.parseDouble(s);
            }

            public double d() {
                return doubleValue();
            }

            public double getD() {
                return doubleValue();
            }

            public BigDecimal bigDecimalValue() {
                return new BigDecimal(s);
            }

            public BigDecimal bd() {
                return bigDecimalValue();
            }

            public BigDecimal getBd() {
                return bigDecimalValue();
            }

            public Decimal decimalValue(String precision, String scale) {
                return new Decimal(precision, scale);
            }

            public Decimal decimalValue(String s) {
                String[] parts = s.split("\\.");
                return decimalValue(parts[0], parts.length < 2 ? "0" : parts[1]);
            }

            public Decimal d(String s) {
                return decimalValue(s);
            }

            public Decimal getD(String s) {
                return decimalValue(s);
            }
        }
    }

}
