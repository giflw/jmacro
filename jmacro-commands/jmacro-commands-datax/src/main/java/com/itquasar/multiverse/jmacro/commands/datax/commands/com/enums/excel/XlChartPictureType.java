package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlchartpicturetype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlchartpicturetype</a>}
*/
public enum XlChartPictureType implements COMEnum {
    
    /**@ Picture is sized to repeat a maximum of 15 times in the longest stacked bar. */
    xlStack(2),    
    /**@ Picture is sized to a specified number of units and repeated the length of the bar. */
    xlStackScale(3),    
    /**@ Picture is stretched the full length of the stacked bar. */
    xlStretch(1);

    private final long value;

    XlChartPictureType(long value) {
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
