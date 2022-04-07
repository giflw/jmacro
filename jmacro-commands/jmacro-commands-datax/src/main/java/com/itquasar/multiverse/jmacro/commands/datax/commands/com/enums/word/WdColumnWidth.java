package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcolumnwidth">https://docs.microsoft.com/en-us/office/vba/api/word.wdcolumnwidth</a>}
*/
public enum WdColumnWidth implements COMEnum {
    
    /**@ Default column width. */
    wdColumnWidthDefault(2),    
    /**@ Narrow column width. */
    wdColumnWidthNarrow(1),    
    /**@ Wide column width. */
    wdColumnWidthWide(3);

    private final long value;

    WdColumnWidth(long value) {
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
