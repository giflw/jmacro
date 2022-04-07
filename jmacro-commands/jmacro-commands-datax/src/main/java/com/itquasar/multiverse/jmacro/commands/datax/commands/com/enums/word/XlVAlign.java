package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlvalign">https://docs.microsoft.com/en-us/office/vba/api/word.xlvalign</a>}
*/
public enum XlVAlign implements COMEnum {
    
    /**@ Bottom alignment. */
    xlVAlignBottom(-4107),    
    /**@ Center alignment. */
    xlVAlignCenter(-4108),    
    /**@ Distributed alignment. */
    xlVAlignDistributed(-4117),    
    /**@ Justified alignment. */
    xlVAlignJustify(-4130),    
    /**@ Top alignment. */
    xlVAlignTop(-4160);

    private final long value;

    XlVAlign(long value) {
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
