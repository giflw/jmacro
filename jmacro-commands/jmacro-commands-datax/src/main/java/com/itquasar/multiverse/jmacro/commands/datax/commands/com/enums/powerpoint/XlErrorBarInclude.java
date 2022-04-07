package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlerrorbarinclude">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlerrorbarinclude</a>}
*/
public enum XlErrorBarInclude implements COMEnum {
    
    /**@ Both the positive and negative error range. */
    xlErrorBarIncludeBoth(1),    
    /**@ Only the negative error range. */
    xlErrorBarIncludeMinusValues(3),    
    /**@ No error bar range. */
    xlErrorBarIncludeNone(-4142),    
    /**@ Only the positive error range. */
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
