package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtablefieldseparator">https://docs.microsoft.com/en-us/office/vba/api/word.wdtablefieldseparator</a>}
*/
public enum WdTableFieldSeparator implements COMEnum {
    
    /**@ A comma. */
    wdSeparateByCommas(2),    
    /**@ The default list separator. */
    wdSeparateByDefaultListSeparator(3),    
    /**@ Paragraph markers. */
    wdSeparateByParagraphs(0),    
    /**@ A tab. */
    wdSeparateByTabs(1);

    private final long value;

    WdTableFieldSeparator(long value) {
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
