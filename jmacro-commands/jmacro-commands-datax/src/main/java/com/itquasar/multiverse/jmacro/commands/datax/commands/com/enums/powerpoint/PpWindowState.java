package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppwindowstate">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppwindowstate</a>}
*/
public enum PpWindowState implements COMEnum {
    
    /**@ Maximized */
    ppWindowMaximized(3),    
    /**@ Minimized */
    ppWindowMinimized(2),    
    /**@ Normal */
    ppWindowNormal(1);

    private final long value;

    PpWindowState(long value) {
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
