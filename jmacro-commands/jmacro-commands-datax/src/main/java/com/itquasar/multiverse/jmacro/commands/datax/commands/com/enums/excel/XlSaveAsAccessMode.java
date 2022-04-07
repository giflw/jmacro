package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsaveasaccessmode">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsaveasaccessmode</a>}
*/
public enum XlSaveAsAccessMode implements COMEnum {
    
    /**@ Exclusive mode */
    xlExclusive(3),    
    /**@ Default (does not change the access mode) */
    xlNoChange(1),    
    /**@ Share list */
    xlShared(2);

    private final long value;

    XlSaveAsAccessMode(long value) {
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
