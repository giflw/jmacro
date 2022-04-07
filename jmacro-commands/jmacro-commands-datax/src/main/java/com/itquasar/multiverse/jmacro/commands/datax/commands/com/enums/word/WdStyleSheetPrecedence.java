package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdstylesheetprecedence">https://docs.microsoft.com/en-us/office/vba/api/word.wdstylesheetprecedence</a>}
*/
public enum WdStyleSheetPrecedence implements COMEnum {
    
    /**@ Raise precedence. */
    wdStyleSheetPrecedenceHigher(-1),    
    /**@ Highest precedence. */
    wdStyleSheetPrecedenceHighest(1),    
    /**@ Lower precedence. */
    wdStyleSheetPrecedenceLower(-2),    
    /**@ Lowest precedence. */
    wdStyleSheetPrecedenceLowest(0);

    private final long value;

    WdStyleSheetPrecedence(long value) {
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
