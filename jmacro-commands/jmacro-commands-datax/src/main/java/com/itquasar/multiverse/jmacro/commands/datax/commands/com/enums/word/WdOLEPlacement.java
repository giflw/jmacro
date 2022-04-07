package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdoleplacement">https://docs.microsoft.com/en-us/office/vba/api/word.wdoleplacement</a>}
*/
public enum WdOLEPlacement implements COMEnum {
    
    /**@ Float over text. */
    wdFloatOverText(1),    
    /**@ In line with text. */
    wdInLine(0);

    private final long value;

    WdOLEPlacement(long value) {
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
