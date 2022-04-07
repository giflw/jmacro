package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddocumentdirection">https://docs.microsoft.com/en-us/office/vba/api/word.wddocumentdirection</a>}
*/
public enum WdDocumentDirection implements COMEnum {
    
    /**@ Left to right. */
    wdLeftToRight(0),    
    /**@ Right to left. */
    wdRightToLeft(1);

    private final long value;

    WdDocumentDirection(long value) {
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
