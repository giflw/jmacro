package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlrowcol">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlrowcol</a>}
*/
public enum XlRowCol implements COMEnum {
    
    /**@ The data series is in a row. */
    xlColumns(2),    
    /**@ The data series is in a column. */
    xlRows(1);

    private final long value;

    XlRowCol(long value) {
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
