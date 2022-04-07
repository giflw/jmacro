package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddocpartinsertoptions">https://docs.microsoft.com/en-us/office/vba/api/word.wddocpartinsertoptions</a>}
*/
public enum WdDocPartInsertOptions implements COMEnum {
    
    /**@ Inline building block. */
    wdInsertContent(0),    
    /**@ Page-level building block. */
    wdInsertPage(2),    
    /**@ Paragraph-level building block. */
    wdInsertParagraph(1);

    private final long value;

    WdDocPartInsertOptions(long value) {
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
