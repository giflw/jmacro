package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdshapepositionrelative">https://docs.microsoft.com/en-us/office/vba/api/word.wdshapepositionrelative</a>}
*/
public enum WdShapePositionRelative implements COMEnum {
    
    /**@ Specifies that the LeftRelative or TopRelative property is not currently valid, so the shape is positioned according to the value specified in the Left or Top property, respectively. */
    wdShapePositionRelativeNone(-999999);

    private final long value;

    WdShapePositionRelative(long value) {
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
