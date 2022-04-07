package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlerrorbarinclude">https://docs.microsoft.com/en-us/office/vba/api/excel.xlerrorbarinclude</a>}
*/
public enum XlErrorBarInclude implements COMEnum {
    
    /**@ Both positive and negative error range. */
    xlErrorBarIncludeBoth(1),    
    /**@ Only negative error range. */
    xlErrorBarIncludeMinusValues(3),    
    /**@ No error bar range. */
    xlErrorBarIncludeNone(-4142),    
    /**@ Only positive error range. */
    xlErrorBarIncludePlusValues(2);

    private final long value;

    XlErrorBarInclude(long value) {
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
