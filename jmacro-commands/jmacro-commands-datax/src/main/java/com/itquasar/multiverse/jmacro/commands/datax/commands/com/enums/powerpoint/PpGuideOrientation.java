package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppguideorientation">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppguideorientation</a>}
*/
public enum PpGuideOrientation implements COMEnum {
    
    /**@ Represents a horizontal guide, spanning from the left to right of the slide editing window. */
    ppHorizontalGuide(1),    
    /**@ Represents a vertical guide, spanning from top edge to bottom of the slide editing window. */
    ppVerticalGuide(2);

    private final long value;

    PpGuideOrientation(long value) {
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
