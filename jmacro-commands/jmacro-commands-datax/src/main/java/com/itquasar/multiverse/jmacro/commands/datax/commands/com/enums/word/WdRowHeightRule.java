package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrowheightrule">https://docs.microsoft.com/en-us/office/vba/api/word.wdrowheightrule</a>}
*/
public enum WdRowHeightRule implements COMEnum {
    
    /**@ The row height is at least a minimum specified value. */
    wdRowHeightAtLeast(1),    
    /**@ The row height is adjusted to accommodate the tallest value in the row. */
    wdRowHeightAuto(0),    
    /**@ The row height is an exact value. */
    wdRowHeightExactly(2);

    private final long value;

    WdRowHeightRule(long value) {
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
