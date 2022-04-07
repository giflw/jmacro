package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdsortseparator">https://docs.microsoft.com/en-us/office/vba/api/word.wdsortseparator</a>}
*/
public enum WdSortSeparator implements COMEnum {
    
    /**@ Comma. */
    wdSortSeparateByCommas(1),    
    /**@ Default table separator. */
    wdSortSeparateByDefaultTableSeparator(2),    
    /**@ Tab. */
    wdSortSeparateByTabs(0);

    private final long value;

    WdSortSeparator(long value) {
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
