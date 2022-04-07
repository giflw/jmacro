package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrowalignment">https://docs.microsoft.com/en-us/office/vba/api/word.wdrowalignment</a>}
*/
public enum WdRowAlignment implements COMEnum {
    
    /**@ Centered. */
    wdAlignRowCenter(1),    
    /**@ Left-aligned. Default. */
    wdAlignRowLeft(0),    
    /**@ Right-aligned. */
    wdAlignRowRight(2);

    private final long value;

    WdRowAlignment(long value) {
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
