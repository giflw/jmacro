package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlaxisgroup">https://docs.microsoft.com/en-us/office/vba/api/excel.xlaxisgroup</a>}
*/
public enum XlAxisGroup implements COMEnum {
    
    /**@ Primary axis group */
    xlPrimary(1),    
    /**@ Secondary axis group */
    xlSecondary(2);

    private final long value;

    XlAxisGroup(long value) {
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
