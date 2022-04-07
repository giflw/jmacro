package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pparrangestyle">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pparrangestyle</a>}
*/
public enum PpArrangeStyle implements COMEnum {
    
    /**@ Cascade */
    ppArrangeCascade(2),    
    /**@ Tiled */
    ppArrangeTiled(1);

    private final long value;

    PpArrangeStyle(long value) {
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
