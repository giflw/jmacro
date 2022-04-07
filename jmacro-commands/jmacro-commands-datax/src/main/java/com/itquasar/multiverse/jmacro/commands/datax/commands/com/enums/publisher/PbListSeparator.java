package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pblistseparator">https://docs.microsoft.com/en-us/office/vba/api/publisher.pblistseparator</a>}
*/
public enum PbListSeparator implements COMEnum {
    
    /**@ Colon */
    pbListSeparatorColon(327680),    
    /**@ Double Hyphen */
    pbListSeparatorDoubleHyphen(458752),    
    /**@ Double Parenthesis */
    pbListSeparatorDoubleParen(65536),    
    /**@ Double Square */
    pbListSeparatorDoubleSquare(393216),    
    /**@ Parenthesis */
    pbListSeparatorParenthesis(0),    
    /**@ Period */
    pbListSeparatorPeriod(131072),    
    /**@ Plain */
    pbListSeparatorPlain(196608),    
    /**@ Square */
    pbListSeparatorSquare(262144),    
    /**@ WideComma */
    pbListSeparatorWideComma(524288);

    private final long value;

    PbListSeparator(long value) {
        this.value = value;
    }

    @Override
    public Variant toVariant() {
        return new Variant(this.value);
    }

    @Override
    public long getValue() {
        return this.value;
    }
}
