package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdseparatortype">https://docs.microsoft.com/en-us/office/vba/api/word.wdseparatortype</a>}
*/
public enum WdSeparatorType implements COMEnum {
    
    /**@ A colon. */
    wdSeparatorColon(2),    
    /**@ An emphasized dash. */
    wdSeparatorEmDash(3),    
    /**@ A standard dash. */
    wdSeparatorEnDash(4),    
    /**@ A hyphen. */
    wdSeparatorHyphen(0),    
    /**@ A period. */
    wdSeparatorPeriod(1);

    private final long value;

    WdSeparatorType(long value) {
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
