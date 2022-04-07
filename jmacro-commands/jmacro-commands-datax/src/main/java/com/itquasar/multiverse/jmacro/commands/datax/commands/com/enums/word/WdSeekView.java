package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdseekview">https://docs.microsoft.com/en-us/office/vba/api/word.wdseekview</a>}
*/
public enum WdSeekView implements COMEnum {
    
    /**@ The current page footer. */
    wdSeekCurrentPageFooter(10),    
    /**@ The current page header. */
    wdSeekCurrentPageHeader(9),    
    /**@ Endnotes. */
    wdSeekEndnotes(8),    
    /**@ The even pages footer. */
    wdSeekEvenPagesFooter(6),    
    /**@ The even pages header. */
    wdSeekEvenPagesHeader(3),    
    /**@ The first page footer. */
    wdSeekFirstPageFooter(5),    
    /**@ The first page header. */
    wdSeekFirstPageHeader(2),    
    /**@ Footnotes. */
    wdSeekFootnotes(7),    
    /**@ The main document. */
    wdSeekMainDocument(0),    
    /**@ The primary footer. */
    wdSeekPrimaryFooter(4),    
    /**@ The primary header. */
    wdSeekPrimaryHeader(1);

    private final long value;

    WdSeekView(long value) {
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
