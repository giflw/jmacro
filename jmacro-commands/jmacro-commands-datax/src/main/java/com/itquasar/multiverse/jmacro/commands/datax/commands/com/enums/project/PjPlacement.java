package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjplacement">https://docs.microsoft.com/en-us/office/vba/api/project.pjplacement</a>}
*/
public enum PjPlacement implements COMEnum {
    
    /**@ After. */
    pjAfter(1),    
    /**@ After with a space. */
    pjAfterWithSpace(3),    
    /**@ Before. */
    pjBefore(0),    
    /**@ Before with a space. */
    pjBeforeWithSpace(2);

    private final long value;

    PjPlacement(long value) {
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
