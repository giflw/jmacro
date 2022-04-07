package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlfileaccess">https://docs.microsoft.com/en-us/office/vba/api/excel.xlfileaccess</a>}
*/
public enum XlFileAccess implements COMEnum {
    
    /**@ Read-only */
    xlReadOnly(3),    
    /**@ Read/write */
    xlReadWrite(2);

    private final long value;

    XlFileAccess(long value) {
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
