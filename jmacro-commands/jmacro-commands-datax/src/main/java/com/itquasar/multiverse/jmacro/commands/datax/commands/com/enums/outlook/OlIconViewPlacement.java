package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oliconviewplacement">https://docs.microsoft.com/en-us/office/vba/api/outlook.oliconviewplacement</a>}
*/
public enum OlIconViewPlacement implements COMEnum {
    
    /**@ Icons are automatically lined up and arranged to prevent gaps or overlaps, but are not sorted. */
    olIconAutoArrange(2),    
    /**@ Icons are not automatically sorted, lined up, or arranged. */
    olIconDoNotArrange(0),    
    /**@ Icons are automatically lined up, but are not sorted or arranged. */
    olIconLineUp(1),    
    /**@ Icons are automatically sorted, lined up, and arranged to prevent gaps or overlaps. */
    olIconSortAndAutoArrange(3);

    private final long value;

    OlIconViewPlacement(long value) {
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
