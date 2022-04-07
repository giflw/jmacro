package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdomathtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdomathtype</a>}
*/
public enum WdOMathType implements COMEnum {
    
    /**@ Professional format. */
    wdOMathDisplay(0),    
    /**@ Inline. */
    wdOMathInline(1);

    private final long value;

    WdOMathType(long value) {
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
