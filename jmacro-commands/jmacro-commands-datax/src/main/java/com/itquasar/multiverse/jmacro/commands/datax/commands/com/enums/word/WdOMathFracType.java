package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdomathfractype">https://docs.microsoft.com/en-us/office/vba/api/word.wdomathfractype</a>}
*/
public enum WdOMathFracType implements COMEnum {
    
    /**@ Normal fraction bar. */
    wdOMathFracBar(0),    
    /**@ Show fraction inline. */
    wdOMathFracLin(3),    
    /**@ No fraction bar. */
    wdOMathFracNoBar(1),    
    /**@ Skewed fraction bar. */
    wdOMathFracSkw(2);

    private final long value;

    WdOMathFracType(long value) {
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
