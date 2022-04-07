package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdprintoutpages">https://docs.microsoft.com/en-us/office/vba/api/word.wdprintoutpages</a>}
*/
public enum WdPrintOutPages implements COMEnum {
    
    /**@ All pages. */
    wdPrintAllPages(0),    
    /**@ Even-numbered pages only. */
    wdPrintEvenPagesOnly(2),    
    /**@ Odd-numbered pages only. */
    wdPrintOddPagesOnly(1);

    private final long value;

    WdPrintOutPages(long value) {
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
