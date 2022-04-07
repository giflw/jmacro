package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlaxistype">https://docs.microsoft.com/en-us/office/vba/api/word.xlaxistype</a>}
*/
public enum XlAxisType implements COMEnum {
    
    /**@ Axis displays categories. */
    xlCategory(1),    
    /**@ Axis displays data series. */
    xlSeriesAxis(3),    
    /**@ Axis displays values. */
    xlValue(2);

    private final long value;

    XlAxisType(long value) {
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
