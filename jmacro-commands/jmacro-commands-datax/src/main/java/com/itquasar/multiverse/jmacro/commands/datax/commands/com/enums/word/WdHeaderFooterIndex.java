package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdheaderfooterindex">https://docs.microsoft.com/en-us/office/vba/api/word.wdheaderfooterindex</a>}
*/
public enum WdHeaderFooterIndex implements COMEnum {
    
    /**@ Returns all headers or footers on even-numbered pages. */
    wdHeaderFooterEvenPages(3),    
    /**@ Returns the first header or footer in a document or section. */
    wdHeaderFooterFirstPage(2),    
    /**@ Returns the header or footer on all pages other than the first page of a document or section. */
    wdHeaderFooterPrimary(1);

    private final long value;

    WdHeaderFooterIndex(long value) {
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
