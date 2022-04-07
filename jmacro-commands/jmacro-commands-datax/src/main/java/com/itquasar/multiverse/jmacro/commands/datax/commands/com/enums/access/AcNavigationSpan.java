package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acnavigationspan">https://docs.microsoft.com/en-us/office/vba/api/access.acnavigationspan</a>}
*/
public enum AcNavigationSpan implements COMEnum {
    
    /**@ The navigation buttons are displayed horizontally. */
    acHorizontal(0),    
    /**@ The navigation buttons are displayed vertically. */
    acVertical(1);

    private final long value;

    AcNavigationSpan(long value) {
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
