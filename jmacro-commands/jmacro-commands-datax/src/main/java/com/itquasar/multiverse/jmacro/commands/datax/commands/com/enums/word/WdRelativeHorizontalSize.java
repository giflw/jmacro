package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrelativehorizontalsize">https://docs.microsoft.com/en-us/office/vba/api/word.wdrelativehorizontalsize</a>}
*/
public enum WdRelativeHorizontalSize implements COMEnum {
    
    /**@ Width is relative to the size of the inside margin; to the size of the left margin for odd pages, and to the size of the right margin for even pages. */
    wdRelativeHorizontalSizeInnerMarginArea(4),    
    /**@ Width is relative to the size of the left margin. */
    wdRelativeHorizontalSizeLeftMarginArea(2),    
    /**@ Width is relative to the space between the left margin and the right margin. */
    wdRelativeHorizontalSizeMargin(0),    
    /**@ Width is relative to the size of the outside margin; to the size of the right margin for odd pages, and to the size of the left margin for even pages. */
    wdRelativeHorizontalSizeOuterMarginArea(5),    
    /**@ Width is relative to the width of the page. */
    wdRelativeHorizontalSizePage(1),    
    /**@ Width is relative to the width of the right margin. */
    wdRelativeHorizontalSizeRightMarginArea(3);

    private final long value;

    WdRelativeHorizontalSize(long value) {
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
