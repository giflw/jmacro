package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlstdcolorscale">https://docs.microsoft.com/en-us/office/vba/api/excel.xlstdcolorscale</a>}
*/
public enum XlStdColorScale implements COMEnum {
    
    /**@ Black over White. */
    ColorScaleBlackWhite(3),    
    /**@ GYR. */
    ColorScaleGYR(2),    
    /**@ RYG. */
    ColorScaleRYG(1),    
    /**@ White over Black. */
    ColorScaleWhiteBlack(4);

    private final long value;

    XlStdColorScale(long value) {
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
