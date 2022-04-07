package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlticklabelposition">https://docs.microsoft.com/en-us/office/vba/api/word.xlticklabelposition</a>}
*/
public enum XlTickLabelPosition implements COMEnum {
    
    /**@ The top or right side of the chart. */
    xlTickLabelPositionHigh(-4127),    
    /**@ The bottom or left side of the chart. */
    xlTickLabelPositionLow(-4134),    
    /**@ Next to the axis (where the axis is not at either side of the chart). */
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
