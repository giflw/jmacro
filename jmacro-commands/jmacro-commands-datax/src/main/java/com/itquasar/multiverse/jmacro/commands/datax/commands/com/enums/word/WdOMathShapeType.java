package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdomathshapetype">https://docs.microsoft.com/en-us/office/vba/api/word.wdomathshapetype</a>}
*/
public enum WdOMathShapeType implements COMEnum {
    
    /**@ Vertically centers delimiters around the entire height of the equation causing delimiters grow equally above and below their midpoint. */
    wdOMathShapeCentered(0),    
    /**@ Matches the shape of the delimiters to the size of their contents. */
    wdOMathShapeMatch(1);

    private final long value;

    WdOMathShapeType(long value) {
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
