package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlerrorbardirection">https://docs.microsoft.com/en-us/office/vba/api/word.xlerrorbardirection</a>}
*/
public enum XlErrorBarDirection implements COMEnum {
    
    /**@ Bars run parallel to the y-axis for x-axis values. */
    xlChartX(-4168),    
    /**@ Bars run parallel to the x-axis for y-axis values. */
    xlChartY(1);

    private final long value;

    XlErrorBarDirection(long value) {
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
