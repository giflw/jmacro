package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdindexsortby">https://docs.microsoft.com/en-us/office/vba/api/word.wdindexsortby</a>}
*/
public enum WdIndexSortBy implements COMEnum {
    
    /**@ Sort by the number of strokes in a character. */
    wdIndexSortByStroke(0),    
    /**@ Sort phonetically. */
    wdIndexSortBySyllable(1);

    private final long value;

    WdIndexSortBy(long value) {
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
