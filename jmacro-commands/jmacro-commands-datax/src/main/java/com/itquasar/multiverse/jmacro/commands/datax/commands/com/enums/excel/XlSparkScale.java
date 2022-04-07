package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsparkscale">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsparkscale</a>}
*/
public enum XlSparkScale implements COMEnum {
    
    /**@ The minimum or maximum value for the vertical axis of the sparkline has a user-defined value. */
    xlSparkScaleCustom(3),    
    /**@ The minimum or maximum value for the vertical axes of all of the sparklines in the group have the same value. */
    xlSparkScaleGroup(1),    
    /**@ The minimum or maximum value for the vertical axis of each sparkline in the group is automatically set to its own calculated value. */
    xlSparkScaleSingle(2);

    private final long value;

    XlSparkScale(long value) {
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
