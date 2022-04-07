package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlmousepointer">https://docs.microsoft.com/en-us/office/vba/api/excel.xlmousepointer</a>}
*/
public enum XlMousePointer implements COMEnum {
    
    /**@ The default pointer. */
    xlDefault(-4143),    
    /**@ The I-beam pointer. */
    xlIBeam(3),    
    /**@ The northwest-arrow pointer. */
    xlNorthwestArrow(1),    
    /**@ The hourglass pointer. */
    xlWait(2);

    private final long value;

    XlMousePointer(long value) {
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
