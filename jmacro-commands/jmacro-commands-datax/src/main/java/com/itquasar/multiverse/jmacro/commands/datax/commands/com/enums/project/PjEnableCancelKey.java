package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjenablecancelkey">https://docs.microsoft.com/en-us/office/vba/api/project.pjenablecancelkey</a>}
*/
public enum PjEnableCancelKey implements COMEnum {
    
    /**@ CTRL+BREAK is ignored. */
    pjDisabled(0),    
    /**@ Sends the interrupt to the macro as a trappable error. The error code is 18. */
    pjErrorHandler(2),    
    /**@ CTRL+BREAK interrupts the macro. */
    pjInterrupt(1);

    private final long value;

    PjEnableCancelKey(long value) {
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
