package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlticklabelposition">https://docs.microsoft.com/en-us/office/vba/api/excel.xlticklabelposition</a>}
*/
public enum XlTickLabelPosition implements COMEnum {
    
    /**@ Top or right side of the chart. */
    xlTickLabelPositionHigh(-4127),    
    /**@ Bottom or left side of the chart. */
    xlTickLabelPositionLow(-4134),    
    /**@ Next to axis (where axis is not at either side of the chart). */
    xlTickLabelPositionNextToAxis(4),    
    /**@ No tick marks. */
    xlTickLabelPositionNone(-4142);

    private final long value;

    XlTickLabelPosition(long value) {
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
