package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjlinkcolormode">https://docs.microsoft.com/en-us/office/vba/api/project.pjlinkcolormode</a>}
*/
public enum PjLinkColorMode implements COMEnum {
    
    /**@ Critical and noncritical colors can be custom values. */
    pjColorModeCustom(1),    
    /**@ Critical and noncritical colors are inherited from the predecessor task. */
    pjColorModePredecessor(2);

    private final long value;

    PjLinkColorMode(long value) {
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
