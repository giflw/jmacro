package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldvalertstyle">https://docs.microsoft.com/en-us/office/vba/api/excel.xldvalertstyle</a>}
*/
public enum XlDVAlertStyle implements COMEnum {
    
    /**@ Information icon. */
    xlValidAlertInformation(3),    
    /**@ Stop icon. */
    xlValidAlertStop(1),    
    /**@ Warning icon. */
    xlValidAlertWarning(2);

    private final long value;

    XlDVAlertStyle(long value) {
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
