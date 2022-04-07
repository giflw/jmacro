package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlwindowstate">https://docs.microsoft.com/en-us/office/vba/api/excel.xlwindowstate</a>}
*/
public enum XlWindowState implements COMEnum {
    
    /**@ Maximized */
    xlMaximized(-4137),    
    /**@ Minimized */
    xlMinimized(-4140),    
    /**@ Normal */
    xlNormal(-4143);

    private final long value;

    XlWindowState(long value) {
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
