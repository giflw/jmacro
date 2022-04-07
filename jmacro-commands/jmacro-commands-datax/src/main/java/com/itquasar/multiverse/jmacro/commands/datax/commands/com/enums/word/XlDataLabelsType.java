package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xldatalabelstype">https://docs.microsoft.com/en-us/office/vba/api/word.xldatalabelstype</a>}
*/
public enum XlDataLabelsType implements COMEnum {
    
    /**@ Show the size of the bubble in reference to the absolute value. */
    xlDataLabelsShowBubbleSizes(6),    
    /**@ The category for the point. */
    xlDataLabelsShowLabel(4),    
    /**@ The percentage of the total, and the category for the point. Available only for pie charts and doughnut charts. */
    xlDataLabelsShowLabelAndPercent(5),    
    /**@ No data labels. */
    xlDataLabelsShowNone(-4142),    
    /**@ The percentage of the total. Available only for pie charts and doughnut charts. */
    xlDataLabelsShowPercent(3),    
    /**@ The default value for the point (assumed if this argument is not specified). */
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
