package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddocumentviewdirection">https://docs.microsoft.com/en-us/office/vba/api/word.wddocumentviewdirection</a>}
*/
public enum WdDocumentViewDirection implements COMEnum {
    
    /**@ Displays the document with left alignment and left-to-right reading order. */
    wdDocumentViewLtr(1),    
    /**@ Displays the document with right alignment and right-to-left reading order. */
    wdDocumentViewRtl(0);

    private final long value;

    WdDocumentViewDirection(long value) {
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
