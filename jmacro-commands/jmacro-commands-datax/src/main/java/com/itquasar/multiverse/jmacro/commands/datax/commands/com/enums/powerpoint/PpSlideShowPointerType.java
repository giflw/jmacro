package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppslideshowpointertype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppslideshowpointertype</a>}
*/
public enum PpSlideShowPointerType implements COMEnum {
    
    /**@ Pointer is always hidden. */
    ppSlideShowPointerAlwaysHidden(3),    
    /**@ Arrow pointer used. */
    ppSlideShowPointerArrow(1),    
    /**@ AutoArrow pointer used. */
    ppSlideShowPointerAutoArrow(4),    
    /**@ Eraser pointer used. */
    ppSlideShowPointerEraser(5),    
    /**@ No pointer used. */
    ppSlideShowPointerNone(0),    
    /**@ Pen pointer used. */
    ppSlideShowPointerPen(2);

    private final long value;

    PpSlideShowPointerType(long value) {
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
