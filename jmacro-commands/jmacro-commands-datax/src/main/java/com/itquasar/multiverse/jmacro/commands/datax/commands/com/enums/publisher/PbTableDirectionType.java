package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtabledirectiontype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtabledirectiontype</a>}
*/
public enum PbTableDirectionType implements COMEnum {
    
    /**@ Left to Right */
    pbTableDirectionLeftToRight(1),    
    /**@ Right to Left */
    pbTableDirectionRightToLeft(2);

    private final long value;

    PbTableDirectionType(long value) {
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
