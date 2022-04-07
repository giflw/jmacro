package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppslideshowrangetype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppslideshowrangetype</a>}
*/
public enum PpSlideShowRangeType implements COMEnum {
    
    /**@ Show all. */
    ppShowAll(1),    
    /**@ Show named slideshow. */
    ppShowNamedSlideShow(3),    
    /**@ Show slide range. */
    ppShowSlideRange(2);

    private final long value;

    PpSlideShowRangeType(long value) {
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
