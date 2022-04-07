package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjearnedvaluemethod">https://docs.microsoft.com/en-us/office/vba/api/project.pjearnedvaluemethod</a>}
*/
public enum PjEarnedValueMethod implements COMEnum {
    
    /**@ Percent complete. */
    pjPercentComplete(0),    
    /**@ Percent complete physically. */
    pjPhysicalPercentComplete(1);

    private final long value;

    PjEarnedValueMethod(long value) {
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
