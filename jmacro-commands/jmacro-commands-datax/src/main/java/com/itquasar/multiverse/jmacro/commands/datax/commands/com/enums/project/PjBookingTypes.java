package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjbookingtypes">https://docs.microsoft.com/en-us/office/vba/api/project.pjbookingtypes</a>}
*/
public enum PjBookingTypes implements COMEnum {
    
    /**@ Committed. */
    pjBookingTypeCommitted(0),    
    /**@ Proposed. */
    pjBookingTypeProposed(1);

    private final long value;

    PjBookingTypes(long value) {
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
