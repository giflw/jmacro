package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlistlevelalignment">https://docs.microsoft.com/en-us/office/vba/api/word.wdlistlevelalignment</a>}
*/
public enum WdListLevelAlignment implements COMEnum {
    
    /**@ Center-aligned. */
    wdListLevelAlignCenter(1),    
    /**@ Left-aligned. */
    wdListLevelAlignLeft(0),    
    /**@ Right-aligned. */
    wdListLevelAlignRight(2);

    private final long value;

    WdListLevelAlignment(long value) {
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
