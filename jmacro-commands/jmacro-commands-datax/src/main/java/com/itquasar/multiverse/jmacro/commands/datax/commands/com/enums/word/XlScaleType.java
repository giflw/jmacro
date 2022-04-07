package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlscaletype">https://docs.microsoft.com/en-us/office/vba/api/word.xlscaletype</a>}
*/
public enum XlScaleType implements COMEnum {
    
    /**@ A linear scale. */
    xlScaleLinear(-4132),    
    /**@ A logarithmic scale. */
    xlScaleLogarithmic(-4133);

    private final long value;

    XlScaleType(long value) {
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
