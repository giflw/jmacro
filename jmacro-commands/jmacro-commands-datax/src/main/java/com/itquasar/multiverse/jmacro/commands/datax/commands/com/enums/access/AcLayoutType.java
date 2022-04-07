package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.aclayouttype">https://docs.microsoft.com/en-us/office/vba/api/access.aclayouttype</a>}
*/
public enum AcLayoutType implements COMEnum {
    
    /**@ The control is not part of a layout. */
    acLayoutNone(0),    
    /**@ The control is part of a stacked layout. */
    acLayoutStacked(2),    
    /**@ The control is part of a tabular layout. */
    acLayoutTabular(1);

    private final long value;

    AcLayoutType(long value) {
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
