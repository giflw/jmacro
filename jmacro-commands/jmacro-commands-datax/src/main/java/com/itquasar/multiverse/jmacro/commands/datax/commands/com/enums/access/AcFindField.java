package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acfindfield">https://docs.microsoft.com/en-us/office/vba/api/access.acfindfield</a>}
*/
public enum AcFindField implements COMEnum {
    
    /**@ Search in all fields in each record. */
    acAll(0),    
    /**@ Confine the search to the current field. */
    acCurrent(-1);

    private final long value;

    AcFindField(long value) {
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
