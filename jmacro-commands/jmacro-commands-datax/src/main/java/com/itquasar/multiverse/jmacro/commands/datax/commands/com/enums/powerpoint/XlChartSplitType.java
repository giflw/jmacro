package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlchartsplittype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlchartsplittype</a>}
*/
public enum XlChartSplitType implements COMEnum {
    
    /**@ The second chart displays arbitrary slides. */
    xlSplitByCustomSplit(4),    
    /**@ The second chart displays values less than a percentage of the total value. The percentage is specified by the SplitValue property. */
    xlSplitByPercentValue(3),    
    /**@ The second chart displays the smallest values in the data series. The number of values to display is specified by the SplitValue property. */
    xlSplitByPosition(1),    
    /**@ The second chart displays values less than the value specified by the SplitValue property. */
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
