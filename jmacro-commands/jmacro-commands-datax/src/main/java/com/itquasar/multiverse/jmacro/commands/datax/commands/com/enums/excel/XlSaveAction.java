package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsaveaction">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsaveaction</a>}
*/
public enum XlSaveAction implements COMEnum {
    
    /**@ Changes will not be saved. */
    xlDoNotSaveChanges(2),    
    /**@ Changes will be saved. */
    xlSaveChanges(1);

    private final long value;

    XlSaveAction(long value) {
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
