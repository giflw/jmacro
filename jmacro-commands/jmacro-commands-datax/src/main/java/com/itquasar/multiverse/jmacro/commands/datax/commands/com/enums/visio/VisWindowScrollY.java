package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viswindowscrolly">https://docs.microsoft.com/en-us/office/vba/api/visio.viswindowscrolly</a>}
*/
public enum VisWindowScrollY implements COMEnum {
    
    /**@ Scroll vertically so that the upper edge of the drawing page is centered in the window. */
    visScrollDownPage(3),    
    /**@ Scroll vertically down the same distance as clicking the down scroll button. */
    visScrollDown(1),    
    /**@ Do not scroll vertically. */
    visScrollNoneY(9),    
    /**@ Scroll so that the lower-right corner of the drawing page is centered in the window. */
    visScrollToBottom(7),    
    /**@ Scroll so that the upper-left corner of the drawing page is centered in the window. */
    visScrollToTop(6),    
    /**@ Scroll vertically so that the lower edge of the drawing page is centered in the window. */
    visScrollUpPage(2),    
    /**@ Scroll vertically up the same distance as clicking the up scroll button. */
    visScrollUp(0);

    private final long value;

    VisWindowScrollY(long value) {
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
