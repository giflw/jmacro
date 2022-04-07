package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xllegendposition">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xllegendposition</a>}
*/
public enum XlLegendPosition implements COMEnum {
    
    /**@ Below the chart. */
    xlLegendPositionBottom(-4107),    
    /**@ In the upper-right corner of the chart border. */
    xlLegendPositionCorner(2),    
    /**@ A custom position. */
    xlLegendPositionCustom(-4161),    
    /**@ Left of the chart. */
    xlLegendPositionLeft(-4131),    
    /**@ Right of the chart. */
    xlLegendPositionRight(-4152),    
    /**@ Above the chart. */
    xlLegendPositionTop(-4160);

    private final long value;

    XlLegendPosition(long value) {
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
