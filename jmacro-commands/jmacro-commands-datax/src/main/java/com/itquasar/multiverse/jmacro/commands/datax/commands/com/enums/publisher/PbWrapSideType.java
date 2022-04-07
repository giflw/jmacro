package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwrapsidetype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwrapsidetype</a>}
*/
public enum PbWrapSideType implements COMEnum {
    
    /**@ Wrap both sides of the shape */
    pbWrapSideBoth(0),    
    /**@ Wrap the larger side of the shape */
    pbWrapSideLarger(3),    
    /**@ Wrap the left side of the shape */
    pbWrapSideLeft(1),    
    /**@ Wrap the shape in different proportions */
    pbWrapSideMixed(-1),    
    /**@ Does not wrap the shape on the sides */
    pbWrapSideNeither(4),    
    /**@ Wrap the right side of the shape */
    pbWrapSideRight(2);

    private final long value;

    PbWrapSideType(long value) {
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
