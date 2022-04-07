package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbdirectiontype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbdirectiontype</a>}
*/
public enum PbDirectionType implements COMEnum {
    
    /**@ Left to Right */
    pbDirectionLeftToRight(1),    
    /**@ Right to Left */
    pbDirectionRightToLeft(2);

    private final long value;

    PbDirectionType(long value) {
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
