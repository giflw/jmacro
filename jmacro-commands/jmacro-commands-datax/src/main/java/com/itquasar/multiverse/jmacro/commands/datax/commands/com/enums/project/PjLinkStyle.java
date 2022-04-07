package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjlinkstyle">https://docs.microsoft.com/en-us/office/vba/api/project.pjlinkstyle</a>}
*/
public enum PjLinkStyle implements COMEnum {
    
    /**@ Lines follow paths along 90 degree angles. */
    pjLinkRectilinear(2),    
    /**@ Lines are straight between boxes. */
    pjLinkStraight(1);

    private final long value;

    PjLinkStyle(long value) {
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
