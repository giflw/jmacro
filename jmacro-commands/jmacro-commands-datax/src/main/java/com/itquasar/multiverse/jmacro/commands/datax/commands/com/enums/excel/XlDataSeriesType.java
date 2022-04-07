package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldataseriestype">https://docs.microsoft.com/en-us/office/vba/api/excel.xldataseriestype</a>}
*/
public enum XlDataSeriesType implements COMEnum {
    
    /**@ Fill series according to AutoFill settings. */
    xlAutoFill(4),    
    /**@ Fill with date values. */
    xlChronological(3),    
    /**@ Extend values, assuming an additive progression (for example, '1, 2' is extended as '3, 4, 5'). */
    xlDataSeriesLinear(-4132),    
    /**@ Extend values, assuming a multiplicative progression (for example, '1, 2' is extended as '4, 8, 16'). */
    xlGrowth(2);

    private final long value;

    XlDataSeriesType(long value) {
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
