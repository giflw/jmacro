package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjwindowstate">https://docs.microsoft.com/en-us/office/vba/api/project.pjwindowstate</a>}
*/
public enum PjWindowState implements COMEnum {
    
    /**@ Maximized. */
    pjMaximized(3),    
    /**@ Minimized. */
    pjMinimized(2),    
    /**@ Normal. */
    pjNormal(1);

    private final long value;

    PjWindowState(long value) {
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
