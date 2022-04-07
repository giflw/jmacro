package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjexceptionitem">https://docs.microsoft.com/en-us/office/vba/api/project.pjexceptionitem</a>}
*/
public enum PjExceptionItem implements COMEnum {
    
    /**@ The exception occurs on a Friday. */
    pjItemFriday(8),    
    /**@ The exception occurs on a Monday. */
    pjItemMonday(4),    
    /**@ The exception occurs on a Saturday. */
    pjItemSaturday(9),    
    /**@ The exception occurs on a Sunday. */
    pjItemSunday(3),    
    /**@ The exception occurs on a Thursday. */
    pjItemThursday(7),    
    /**@ The exception occurs on a Tuesday. */
    pjItemTuesday(5),    
    /**@ The exception occurs on a Wednesday. */
    pjItemWednesday(6);

    private final long value;

    PjExceptionItem(long value) {
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
