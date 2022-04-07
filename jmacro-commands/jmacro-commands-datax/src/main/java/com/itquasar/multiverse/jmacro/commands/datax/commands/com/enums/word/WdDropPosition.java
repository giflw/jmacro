package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddropposition">https://docs.microsoft.com/en-us/office/vba/api/word.wddropposition</a>}
*/
public enum WdDropPosition implements COMEnum {
    
    /**@ Dropped capital letter ends at the left margin. */
    wdDropMargin(2),    
    /**@ No dropped capital letter. */
    wdDropNone(0),    
    /**@ Dropped capital letter begins at the left margin. */
    wdDropNormal(1);

    private final long value;

    WdDropPosition(long value) {
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
