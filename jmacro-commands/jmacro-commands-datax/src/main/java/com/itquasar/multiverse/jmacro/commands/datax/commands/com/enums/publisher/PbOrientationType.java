package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pborientationtype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pborientationtype</a>}
*/
public enum PbOrientationType implements COMEnum {
    
    /**@ Landscape orientation */
    pbOrientationLandscape(2),    
    /**@ Portrait orientation */
    pbOrientationPortrait(1);

    private final long value;

    PbOrientationType(long value) {
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
