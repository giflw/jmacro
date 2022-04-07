package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acvalueaxis">https://docs.microsoft.com/en-us/office/vba/api/access.acvalueaxis</a>}
*/
public enum AcValueAxis implements COMEnum {
    
    /**@ Primary axis */
    acPrimaryAxis(0),    
    /**@ Secondary axis */
    acSecondaryAxis(1);

    private final long value;

    AcValueAxis(long value) {
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
