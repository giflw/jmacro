package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdendnotelocation">https://docs.microsoft.com/en-us/office/vba/api/word.wdendnotelocation</a>}
*/
public enum WdEndnoteLocation implements COMEnum {
    
    /**@ At end of active document. */
    wdEndOfDocument(1),    
    /**@ At end of current section. */
    wdEndOfSection(0);

    private final long value;

    WdEndnoteLocation(long value) {
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
