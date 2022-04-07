package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdalignmenttabrelative">https://docs.microsoft.com/en-us/office/vba/api/word.wdalignmenttabrelative</a>}
*/
public enum WdAlignmentTabRelative implements COMEnum {
    
    /**@ Word calculates tab alignment relative to the paragraph indents. */
    wdIndent(1),    
    /**@ Word calculates tab alignment relative to the margins */
    wdMargin(0);

    private final long value;

    WdAlignmentTabRelative(long value) {
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
