package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.aclegendposition">https://docs.microsoft.com/en-us/office/vba/api/access.aclegendposition</a>}
*/
public enum AcLegendPosition implements COMEnum {
    
    /**@ Bottom edge of the chart */
    acLegendPositionBottom(3),    
    /**@ Left edge of the chart */
    acLegendPositionLeft(0),    
    /**@ Right edge of the chart */
    acLegendPositionRight(2),    
    /**@ Top edge of the chart */
    acLegendPositionTop(1);

    private final long value;

    AcLegendPosition(long value) {
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
