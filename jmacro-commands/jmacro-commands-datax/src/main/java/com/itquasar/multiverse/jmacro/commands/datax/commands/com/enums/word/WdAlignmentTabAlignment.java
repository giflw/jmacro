package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdalignmenttabalignment">https://docs.microsoft.com/en-us/office/vba/api/word.wdalignmenttabalignment</a>}
*/
public enum WdAlignmentTabAlignment implements COMEnum {
    
    /**@ Centered tab. */
    wdCenter(1),    
    /**@ Left-aligned tab. */
    wdLeft(0),    
    /**@ Right-aligned tab. */
    wdRight(2);

    private final long value;

    WdAlignmentTabAlignment(long value) {
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
