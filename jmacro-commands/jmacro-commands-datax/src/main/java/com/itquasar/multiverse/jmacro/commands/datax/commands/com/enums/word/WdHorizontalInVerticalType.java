package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdhorizontalinverticaltype">https://docs.microsoft.com/en-us/office/vba/api/word.wdhorizontalinverticaltype</a>}
*/
public enum WdHorizontalInVerticalType implements COMEnum {
    
    /**@ The horizontal text is sized to fit in the line of vertical text. */
    wdHorizontalInVerticalFitInLine(1),    
    /**@ No formatting is applied to the horizontal text. */
    wdHorizontalInVerticalNone(0),    
    /**@ The line of vertical text is sized to accommodate the horizontal text. */
    wdHorizontalInVerticalResizeLine(2);

    private final long value;

    WdHorizontalInVerticalType(long value) {
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
