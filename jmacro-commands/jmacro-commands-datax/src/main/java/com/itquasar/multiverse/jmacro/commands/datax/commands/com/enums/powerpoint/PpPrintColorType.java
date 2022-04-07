package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppprintcolortype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppprintcolortype</a>}
*/
public enum PpPrintColorType implements COMEnum {
    
    /**@ Black and White */
    ppPrintBlackAndWhite(2),    
    /**@ Colored */
    ppPrintColor(1),    
    /**@ Pure Black and White */
    ppPrintPureBlackAndWhite(3);

    private final long value;

    PpPrintColorType(long value) {
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
