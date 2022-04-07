package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcheckouttype">https://docs.microsoft.com/en-us/office/vba/api/project.pjcheckouttype</a>}
*/
public enum PjCheckOutType implements COMEnum {
    
    /**@ Check out as read-only. */
    pjReadOnly(0),    
    /**@ Check out as read/write. */
    pjReadWrite(1);

    private final long value;

    PjCheckOutType(long value) {
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
