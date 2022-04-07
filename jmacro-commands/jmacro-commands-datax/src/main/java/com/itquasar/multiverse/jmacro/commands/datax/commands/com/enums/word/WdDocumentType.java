package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddocumenttype">https://docs.microsoft.com/en-us/office/vba/api/word.wddocumenttype</a>}
*/
public enum WdDocumentType implements COMEnum {
    
    /**@ Document. */
    wdTypeDocument(0),    
    /**@ Frameset. */
    wdTypeFrameset(2),    
    /**@ Template. */
    wdTypeTemplate(1);

    private final long value;

    WdDocumentType(long value) {
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
