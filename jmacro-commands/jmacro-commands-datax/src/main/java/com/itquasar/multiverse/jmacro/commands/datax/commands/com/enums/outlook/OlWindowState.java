package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olwindowstate">https://docs.microsoft.com/en-us/office/vba/api/outlook.olwindowstate</a>}
*/
public enum OlWindowState implements COMEnum {
    
    /**@ The window is maximized. */
    olMaximized(0),    
    /**@ The window is minimized. */
    olMinimized(1),    
    /**@ The window is in the normal state (not minimized or maximized). */
    olNormalWindow(2);

    private final long value;

    OlWindowState(long value) {
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
