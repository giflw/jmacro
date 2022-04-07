package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppmediatype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppmediatype</a>}
*/
public enum PpMediaType implements COMEnum {
    
    /**@ Mixed */
    ppMediaTypeMixed(-2),    
    /**@ Movie */
    ppMediaTypeMovie(3),    
    /**@ Others */
    ppMediaTypeOther(1),    
    /**@ Sound */
    ppMediaTypeSound(2);

    private final long value;

    PpMediaType(long value) {
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
