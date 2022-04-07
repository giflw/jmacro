package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppfareastlinebreaklevel">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppfareastlinebreaklevel</a>}
*/
public enum PpFarEastLineBreakLevel implements COMEnum {
    
    /**@ Custom level */
    ppFarEastLineBreakLevelCustom(3),    
    /**@ Normal level */
    ppFarEastLineBreakLevelNormal(1),    
    /**@ Strict level */
    ppFarEastLineBreakLevelStrict(2);

    private final long value;

    PpFarEastLineBreakLevel(long value) {
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
