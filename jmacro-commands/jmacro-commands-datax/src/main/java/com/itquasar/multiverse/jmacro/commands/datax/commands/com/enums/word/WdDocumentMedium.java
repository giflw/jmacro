package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddocumentmedium">https://docs.microsoft.com/en-us/office/vba/api/word.wddocumentmedium</a>}
*/
public enum WdDocumentMedium implements COMEnum {
    
    /**@ Document. */
    wdDocument(1),    
    /**@ Email message. */
    wdEmailMessage(0),    
    /**@ Web page. */
    wdWebPage(2);

    private final long value;

    WdDocumentMedium(long value) {
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
