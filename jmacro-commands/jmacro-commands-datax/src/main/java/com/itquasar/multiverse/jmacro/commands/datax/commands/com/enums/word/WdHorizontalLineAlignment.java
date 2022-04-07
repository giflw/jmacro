package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdhorizontallinealignment">https://docs.microsoft.com/en-us/office/vba/api/word.wdhorizontallinealignment</a>}
*/
public enum WdHorizontalLineAlignment implements COMEnum {
    
    /**@ Centered. */
    wdHorizontalLineAlignCenter(1),    
    /**@ Aligned to the left. */
    wdHorizontalLineAlignLeft(0),    
    /**@ Aligned to the right. */
    wdHorizontalLineAlignRight(2);

    private final long value;

    WdHorizontalLineAlignment(long value) {
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
