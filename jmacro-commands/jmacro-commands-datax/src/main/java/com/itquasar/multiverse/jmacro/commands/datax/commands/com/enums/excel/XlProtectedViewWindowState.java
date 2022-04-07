package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlprotectedviewwindowstate">https://docs.microsoft.com/en-us/office/vba/api/excel.xlprotectedviewwindowstate</a>}
*/
public enum XlProtectedViewWindowState implements COMEnum {
    
    /**@ Maximized */
    xlProtectedViewWindowMaximized(2),    
    /**@ Minimized */
    xlProtectedViewWindowMinimized(1),    
    /**@ Normal */
    xlProtectedViewWindowNormal(0);

    private final long value;

    XlProtectedViewWindowState(long value) {
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
