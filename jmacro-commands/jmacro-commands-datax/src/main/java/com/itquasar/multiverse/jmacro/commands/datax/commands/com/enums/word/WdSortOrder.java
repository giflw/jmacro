package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdsortorder">https://docs.microsoft.com/en-us/office/vba/api/word.wdsortorder</a>}
*/
public enum WdSortOrder implements COMEnum {
    
    /**@ Ascending order. Default. */
    wdSortOrderAscending(0),    
    /**@ Descending order. */
    wdSortOrderDescending(1);

    private final long value;

    WdSortOrder(long value) {
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
