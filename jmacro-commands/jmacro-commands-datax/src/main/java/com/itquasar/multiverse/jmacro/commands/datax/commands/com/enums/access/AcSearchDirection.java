package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acsearchdirection">https://docs.microsoft.com/en-us/office/vba/api/access.acsearchdirection</a>}
*/
public enum AcSearchDirection implements COMEnum {
    
    /**@ Search all records below the current record. */
    acDown(1),    
    /**@ Search all records. */
    acSearchAll(2),    
    /**@ Search all records above the current record. */
    acUp(0);

    private final long value;

    AcSearchDirection(long value) {
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
