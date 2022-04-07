package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdexportrange">https://docs.microsoft.com/en-us/office/vba/api/word.wdexportrange</a>}
*/
public enum WdExportRange implements COMEnum {
    
    /**@ Exports the entire document. */
    wdExportAllDocument(0),    
    /**@ Exports the current page. */
    wdExportCurrentPage(2),    
    /**@ Exports the contents of a range using the starting and ending positions. */
    wdExportFromTo(3),    
    /**@ Exports the contents of the current selection. */
    wdExportSelection(1);

    private final long value;

    WdExportRange(long value) {
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
