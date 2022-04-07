package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlforecastcharttype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlforecastcharttype</a>}
*/
public enum XlForecastChartType implements COMEnum {
    
    /**@ No description provided */
    xlForecastChartTypeLine(0);

    private final long value;

    XlForecastChartType(long value) {
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
