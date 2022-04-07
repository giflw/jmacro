package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlforecastaggregation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlforecastaggregation</a>}
*/
public enum XlForecastAggregation implements COMEnum {
    
    /**@ No description provided */
    xlForecastAggregationCount(2),    
    /**@ No description provided */
    xlForecastAggregationCountA(3),    
    /**@ No description provided */
    xlForecastAggregationMax(4),    
    /**@ No description provided */
    xlForecastAggregationMedian(5),    
    /**@ No description provided */
    xlForecastAggregationMin(6),    
    /**@ No description provided */
    xlForecastAggregationSum(7);

    private final long value;

    XlForecastAggregation(long value) {
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
