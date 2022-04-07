package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcheckinversiontype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcheckinversiontype</a>}
*/
public enum XlCheckInVersionType implements COMEnum {
    
    /**@ Check in the major version. */
    xlCheckInMajorVersion(1),    
    /**@ Check in the minor version. */
    xlCheckInMinorVersion(0),    
    /**@ Overwrite current version on the server. */
    xlCheckInOverwriteVersion(2);

    private final long value;

    XlCheckInVersionType(long value) {
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
