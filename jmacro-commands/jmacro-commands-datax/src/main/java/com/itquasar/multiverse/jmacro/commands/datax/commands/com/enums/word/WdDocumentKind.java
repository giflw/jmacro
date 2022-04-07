package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddocumentkind">https://docs.microsoft.com/en-us/office/vba/api/word.wddocumentkind</a>}
*/
public enum WdDocumentKind implements COMEnum {
    
    /**@ Email format. */
    wdDocumentEmail(2),    
    /**@ Letter format. */
    wdDocumentLetter(1),    
    /**@ No format specified. */
    wdDocumentNotSpecified(0);

    private final long value;

    WdDocumentKind(long value) {
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
