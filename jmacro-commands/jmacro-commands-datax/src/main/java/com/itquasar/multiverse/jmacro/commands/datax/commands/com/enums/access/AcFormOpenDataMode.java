package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acformopendatamode">https://docs.microsoft.com/en-us/office/vba/api/access.acformopendatamode</a>}
*/
public enum AcFormOpenDataMode implements COMEnum {
    
    /**@ The user can add new records but can't edit existing records. */
    acFormAdd(0),    
    /**@ The user can edit existing records and add new records. */
    acFormEdit(1),    
    /**@ The user can only change the form's properties. */
    acFormPropertySettings(-1),    
    /**@ The user can only view records. */
    acFormReadOnly(2);

    private final long value;

    AcFormOpenDataMode(long value) {
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
