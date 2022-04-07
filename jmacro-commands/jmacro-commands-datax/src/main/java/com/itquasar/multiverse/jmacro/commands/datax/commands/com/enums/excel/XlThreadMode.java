package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlthreadmode">https://docs.microsoft.com/en-us/office/vba/api/excel.xlthreadmode</a>}
*/
public enum XlThreadMode implements COMEnum {
    
    /**@ Multi-threaded calculation mode is automatic. */
    xlThreadModeAutomatic(0),    
    /**@ Multi-threaded calculation mode is manual. */
    xlThreadModeManual(1);

    private final long value;

    XlThreadMode(long value) {
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
