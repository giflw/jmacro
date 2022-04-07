package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlchartsplittype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlchartsplittype</a>}
*/
public enum XlChartSplitType implements COMEnum {
    
    /**@ Arbitrary slides are displayed in the second chart. */
    xlSplitByCustomSplit(4),    
    /**@ Second chart displays values less than some percentage of the total value. The percentage is specified by the SplitValue property. */
    xlSplitByPercentValue(3),    
    /**@ Second chart displays the smallest values in the data series. The number of values to display is specified by the SplitValue property. */
    xlSplitByPosition(1),    
    /**@ Second chart displays values less than the value specified by the SplitValue property. */
    xlSplitByValue(2);

    private final long value;

    XlChartSplitType(long value) {
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
