package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acopendatamode">https://docs.microsoft.com/en-us/office/vba/api/access.acopendatamode</a>}
*/
public enum AcOpenDataMode implements COMEnum {
    
    /**@ The user can add new records but can't view or edit existing records. */
    acAdd(0),    
    /**@ The user can view or edit existing records and add new records. */
    acEdit(1),    
    /**@ The user can only view records. */
    acReadOnly(2);

    private final long value;

    AcOpenDataMode(long value) {
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
