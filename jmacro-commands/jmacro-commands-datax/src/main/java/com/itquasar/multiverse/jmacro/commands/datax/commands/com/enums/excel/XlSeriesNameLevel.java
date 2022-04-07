package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlseriesnamelevel">https://docs.microsoft.com/en-us/office/vba/api/excel.xlseriesnamelevel</a>}
*/
public enum XlSeriesNameLevel implements COMEnum {
    
    /**@ Set series names to all series name levels w/in range on the chart. */
    xlSeriesNameLevelAll(-1),    
    /**@ Indicates literal data in the series names. */
    xlSeriesNameLevelCustom(-2),    
    /**@ Set no category labels in the chart. Defaults to automatic indexed labels. */
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
