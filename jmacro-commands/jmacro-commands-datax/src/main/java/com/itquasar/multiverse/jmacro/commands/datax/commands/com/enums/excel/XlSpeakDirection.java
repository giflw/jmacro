package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlspeakdirection">https://docs.microsoft.com/en-us/office/vba/api/excel.xlspeakdirection</a>}
*/
public enum XlSpeakDirection implements COMEnum {
    
    /**@ Reads down a column, then moves to the next column. */
    xlSpeakByColumns(1),    
    /**@ Reads across a row, then moves to the next row. */
    xlSpeakByRows(0);

    private final long value;

    XlSpeakDirection(long value) {
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
