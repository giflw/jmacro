package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrelativeverticalsize">https://docs.microsoft.com/en-us/office/vba/api/word.wdrelativeverticalsize</a>}
*/
public enum WdRelativeVerticalSize implements COMEnum {
    
    /**@ Height is relative to the size of the bottom margin. */
    wdRelativeVerticalSizeBottomMarginArea(3),    
    /**@ Height is relative to the size of the inside margin; to the size of the top margin for odd pages, and to the size of the bottom margin for even pages. */
    wdRelativeVerticalSizeInnerMarginArea(4),    
    /**@ Height is relative to the space between the left margin and the right margin. */
    wdRelativeVerticalSizeMargin(0),    
    /**@ Height is relative to the size of the outside margin; to the size of the bottom margin for odd pages, and to the size of the top margin for even pages. */
    wdRelativeVerticalSizeOuterMarginArea(5),    
    /**@ Height is relative to the height of the page. */
    wdRelativeVerticalSizePage(1),    
    /**@ Height is relative to the size of the top margin. */
    wdRelativeVerticalSizeTopMarginArea(2);

    private final long value;

    WdRelativeVerticalSize(long value) {
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
