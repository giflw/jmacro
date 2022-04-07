package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbnavbarorientation">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbnavbarorientation</a>}
*/
public enum PbNavBarOrientation implements COMEnum {
    
    /**@ Horizontal orientation */
    pbNavBarOrientHorizontal(1),    
    /**@ Vertical orientation */
    pbNavBarOrientVertical(2);

    private final long value;

    PbNavBarOrientation(long value) {
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
