package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdoriginalformat">https://docs.microsoft.com/en-us/office/vba/api/word.wdoriginalformat</a>}
*/
public enum WdOriginalFormat implements COMEnum {
    
    /**@ Original document format. */
    wdOriginalDocumentFormat(1),    
    /**@ Prompt user to select a document format. */
    wdPromptUser(2),    
    /**@ Microsoft Word document format. */
    wdWordDocument(0);

    private final long value;

    WdOriginalFormat(long value) {
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
