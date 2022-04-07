package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xltimelinelevel">https://docs.microsoft.com/en-us/office/vba/api/excel.xltimelinelevel</a>}
*/
public enum XlTimelineLevel implements COMEnum {
    
    /**@ Years level */
    xlTimelineLevelYears(0),    
    /**@ Quarters level */
    xlTimelineLevelQuarters(1),    
    /**@ Months level */
    xlTimelineLevelMonths(2),    
    /**@ Days level */
    xlTimelineLevelDays(3);

    private final long value;

    XlTimelineLevel(long value) {
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
