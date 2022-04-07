package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwraptype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwraptype</a>}
*/
public enum PbWrapType implements COMEnum {
    
    /**@ Mixed */
    pbWrapTypeMixed(-1),    
    /**@ None */
    pbWrapTypeNone(0),    
    /**@ Square */
    pbWrapTypeSquare(1),    
    /**@ Through */
    pbWrapTypeThrough(3),    
    /**@ Tight */
    pbWrapTypeTight(2),    
    /**@ Top and Bottom */
    pbWrapTypeTopAndBottom(4);

    private final long value;

    PbWrapType(long value) {
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
