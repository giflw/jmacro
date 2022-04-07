package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlerrorbartype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlerrorbartype</a>}
*/
public enum XlErrorBarType implements COMEnum {
    
    /**@ Range is set by fixed values or cell values. */
    xlErrorBarTypeCustom(-4114),    
    /**@ Fixed-length error bars. */
    xlErrorBarTypeFixedValue(1),    
    /**@ Percentage of range to be covered by the error bars. */
    xlErrorBarTypePercent(2),    
    /**@ Shows range for specified number of standard deviations. */
    xlErrorBarTypeStDev(-4155),    
    /**@ Shows standard error range. */
    xlErrorBarTypeStError(4);

    private final long value;

    XlErrorBarType(long value) {
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
