package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbplacementtype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbplacementtype</a>}
*/
public enum PbPlacementType implements COMEnum {
    
    /**@ Center */
    pbPlacementCenter(3),    
    /**@ Left */
    pbPlacementLeft(1),    
    /**@ Right */
    pbPlacementRight(2);

    private final long value;

    PbPlacementType(long value) {
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
