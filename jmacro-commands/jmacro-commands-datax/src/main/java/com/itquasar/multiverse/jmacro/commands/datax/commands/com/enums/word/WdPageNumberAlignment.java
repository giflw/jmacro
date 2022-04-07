package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpagenumberalignment">https://docs.microsoft.com/en-us/office/vba/api/word.wdpagenumberalignment</a>}
*/
public enum WdPageNumberAlignment implements COMEnum {
    
    /**@ Centered. */
    wdAlignPageNumberCenter(1),    
    /**@ Left-aligned just inside the footer. */
    wdAlignPageNumberInside(3),    
    /**@ Left-aligned. */
    wdAlignPageNumberLeft(0),    
    /**@ Right-aligned just outside the footer. */
    wdAlignPageNumberOutside(4),    
    /**@ Right-aligned. */
    wdAlignPageNumberRight(2);

    private final long value;

    WdPageNumberAlignment(long value) {
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
