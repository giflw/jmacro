package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdprintoutrange">https://docs.microsoft.com/en-us/office/vba/api/word.wdprintoutrange</a>}
*/
public enum WdPrintOutRange implements COMEnum {
    
    /**@ The entire document. */
    wdPrintAllDocument(0),    
    /**@ The current page. */
    wdPrintCurrentPage(2),    
    /**@ A specified range. */
    wdPrintFromTo(3),    
    /**@ A specified range of pages. */
    wdPrintRangeOfPages(4),    
    /**@ The current selection. */
    wdPrintSelection(1);

    private final long value;

    WdPrintOutRange(long value) {
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
