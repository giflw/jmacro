package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlchartelementposition">https://docs.microsoft.com/en-us/office/vba/api/word.xlchartelementposition</a>}
*/
public enum XlChartElementPosition implements COMEnum {
    
    /**@ Automatically sets the position of the chart element. */
    xlChartElementPositionAutomatic(-4105),    
    /**@ Specifies a specific position for the chart element. */
    xlChartElementPositionCustom(-4114);

    private final long value;

    XlChartElementPosition(long value) {
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
