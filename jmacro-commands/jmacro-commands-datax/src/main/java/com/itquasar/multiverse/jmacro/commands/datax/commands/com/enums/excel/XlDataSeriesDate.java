package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldataseriesdate">https://docs.microsoft.com/en-us/office/vba/api/excel.xldataseriesdate</a>}
*/
public enum XlDataSeriesDate implements COMEnum {
    
    /**@ Day */
    xlDay(1),    
    /**@ Month */
    xlMonth(3),    
    /**@ Weekdays */
    xlWeekday(2),    
    /**@ Year */
    xlYear(4);

    private final long value;

    XlDataSeriesDate(long value) {
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
