package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.achorizontalanchor">https://docs.microsoft.com/en-us/office/vba/api/access.achorizontalanchor</a>}
*/
public enum AcHorizontalAnchor implements COMEnum {
    
    /**@ The control is stretched horizontally across its layout. */
    acHorizontalAnchorBoth(2),    
    /**@ The control is anchored to the left side of its layout. */
    acHorizontalAnchorLeft(0),    
    /**@ The control is anchored to the right side of its layout. */
    acHorizontalAnchorRight(1);

    private final long value;

    AcHorizontalAnchor(long value) {
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
