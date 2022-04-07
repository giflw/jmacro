package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viswindowscrollx">https://docs.microsoft.com/en-us/office/vba/api/visio.viswindowscrollx</a>}
*/
public enum VisWindowScrollX implements COMEnum {
    
    /**@ Scroll horizontally so that the left edge of the drawing page is centered in the window. */
    visScrollLeftPage(2),    
    /**@ Scroll horizontally to the left the same distance as clicking the left scroll button. */
    visScrollLeft(0),    
    /**@ Do not scroll horizontally. */
    visScrollNoneX(9),    
    /**@ Scroll horizontally so that the right edge of the drawing page is centered in the window. */
    visScrollRightPage(3),    
    /**@ Scroll horizontally to the right the same distance as clicking the right scroll button. */
    visScrollRight(1),    
    /**@ Scroll so that the upper-left corner of the drawing page is centered in the window. */
    visScrollToLeft(6),    
    /**@ Scroll so that the lower-right corner of the drawing page is centered in the window. */
    visScrollToRight(7);

    private final long value;

    VisWindowScrollX(long value) {
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
