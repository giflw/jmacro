package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsparktype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsparktype</a>}
*/
public enum XlSparkType implements COMEnum {
    
    /**@ A column chart sparkline. */
    xlSparkColumn(2),    
    /**@ A win/loss chart sparkline. */
    xlSparkColumnStacked100(3),    
    /**@ A line chart sparkline. */
    xlSparkLine(1);

    private final long value;

    XlSparkType(long value) {
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
