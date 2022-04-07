package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acverticalanchor">https://docs.microsoft.com/en-us/office/vba/api/access.acverticalanchor</a>}
*/
public enum AcVerticalAnchor implements COMEnum {
    
    /**@ The control is stretched vertically across its layout. */
    acVerticalAnchorBoth(2),    
    /**@ The control is anchored at the bottom of its layout. */
    acVerticalAnchorBottom(1),    
    /**@ The control is anchored at the top of its layout. */
    acVerticalAnchorTop(0);

    private final long value;

    AcVerticalAnchor(long value) {
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
