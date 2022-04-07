package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldatalabelstype">https://docs.microsoft.com/en-us/office/vba/api/excel.xldatalabelstype</a>}
*/
public enum XlDataLabelsType implements COMEnum {
    
    /**@ Show the size of the bubble in reference to the absolute value. */
    xlDataLabelsShowBubbleSizes(6),    
    /**@ Category for the point. */
    xlDataLabelsShowLabel(4),    
    /**@ Percentage of the total, and category for the point. Available only for pie charts and doughnut charts. */
    xlDataLabelsShowLabelAndPercent(5),    
    /**@ No data labels. */
    xlDataLabelsShowNone(-4142),    
    /**@ Percentage of the total. Available only for pie charts and doughnut charts. */
    xlDataLabelsShowPercent(3),    
    /**@ Default value for the point (assumed if this argument is not specified). */
    xlDataLabelsShowValue(2);

    private final long value;

    XlDataLabelsType(long value) {
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
