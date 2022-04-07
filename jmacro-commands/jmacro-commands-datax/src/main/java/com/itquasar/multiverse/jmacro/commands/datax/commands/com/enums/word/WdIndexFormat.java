package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdindexformat">https://docs.microsoft.com/en-us/office/vba/api/word.wdindexformat</a>}
*/
public enum WdIndexFormat implements COMEnum {
    
    /**@ Bulleted. */
    wdIndexBulleted(4),    
    /**@ Classic. */
    wdIndexClassic(1),    
    /**@ Fancy. */
    wdIndexFancy(2),    
    /**@ Formal. */
    wdIndexFormal(5),    
    /**@ Modern. */
    wdIndexModern(3),    
    /**@ Simple. */
    wdIndexSimple(6),    
    /**@ From template. */
    wdIndexTemplate(0);

    private final long value;

    WdIndexFormat(long value) {
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
