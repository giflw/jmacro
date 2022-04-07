package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlerrorbartype">https://docs.microsoft.com/en-us/office/vba/api/word.xlerrorbartype</a>}
*/
public enum XlErrorBarType implements COMEnum {
    
    /**@ The range is set by fixed values or cell values. */
    xlErrorBarTypeCustom(-4114),    
    /**@ Fixed-length error bars. */
    xlErrorBarTypeFixedValue(1),    
    /**@ The percentage of the range to be covered by the error bars. */
    xlErrorBarTypePercent(2),    
    /**@ Shows the range for a specified number of standard deviations. */
    xlErrorBarTypeStDev(-4155),    
    /**@ Shows the standard error range. */
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
