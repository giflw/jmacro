package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlseriesnamelevel">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlseriesnamelevel</a>}
*/
public enum XlSeriesNameLevel implements COMEnum {
    
    /**@ Sets series names to all series name levels within range on the chart. The default. */
    xlSeriesNameLevelAll(-1),    
    /**@ Indicates literal data in the series names. */
    xlSeriesNameLevelCustom(-2),    
    /**@ Sets no series names in the chart. */
    xlSeriesNameLevelNone(-3);

    private final long value;

    XlSeriesNameLevel(long value) {
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
