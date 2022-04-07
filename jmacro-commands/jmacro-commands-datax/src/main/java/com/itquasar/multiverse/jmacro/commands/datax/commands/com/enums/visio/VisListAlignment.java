package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vislistalignment">https://docs.microsoft.com/en-us/office/vba/api/visio.vislistalignment</a>}
*/
public enum VisListAlignment implements COMEnum {
    
    /**@ Left-align or top-align shapes. */
    visListAlignLeftOrTop(0),    
    /**@ Center-align or middle-align shapes. */
    visListAlignCenterOrMiddle(1),    
    /**@ Right-align or bottom-align shapes. */
    visListAlignRightOrBottom(2);

    private final long value;

    VisListAlignment(long value) {
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
