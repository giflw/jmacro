package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjpoolaction">https://docs.microsoft.com/en-us/office/vba/api/project.pjpoolaction</a>}
*/
public enum PjPoolAction implements COMEnum {
    
    /**@ Opens all sharers into a consolidated project. */
    pjOpenAllSharers(4),    
    /**@ Opens the specified sharer. */
    pjOpenSharer(3),    
    /**@ Causes the resource pool to take precedence over the sharers. */
    pjPoolTakesPrecedence(1),    
    /**@ Causes the sharers to take precedence over the resource pool. */
    pjSharersTakePrecedence(2),    
    /**@ Unlinks the sharer from the resource pool. */
    pjUnlinkSharer(5);

    private final long value;

    PjPoolAction(long value) {
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
