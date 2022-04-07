package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtabledirection">https://docs.microsoft.com/en-us/office/vba/api/word.wdtabledirection</a>}
*/
public enum WdTableDirection implements COMEnum {
    
    /**@ The selected rows are arranged with the first column in the leftmost position. */
    wdTableDirectionLtr(1),    
    /**@ The selected rows are arranged with the first column in the rightmost position. */
    wdTableDirectionRtl(0);

    private final long value;

    WdTableDirection(long value) {
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
