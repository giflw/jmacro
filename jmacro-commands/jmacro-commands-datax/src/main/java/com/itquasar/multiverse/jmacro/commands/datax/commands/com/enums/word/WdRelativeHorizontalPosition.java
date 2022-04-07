package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrelativehorizontalposition">https://docs.microsoft.com/en-us/office/vba/api/word.wdrelativehorizontalposition</a>}
*/
public enum WdRelativeHorizontalPosition implements COMEnum {
    
    /**@ Relative to character. */
    wdRelativeHorizontalPositionCharacter(3),    
    /**@ Relative to column. */
    wdRelativeHorizontalPositionColumn(2),    
    /**@ Relative to margin. */
    wdRelativeHorizontalPositionMargin(0),    
    /**@ Relative to page. */
    wdRelativeHorizontalPositionPage(1),    
    /**@ Relative to inner margin area. */
    wdRelativeHorizontalPositionInnerMarginArea(6),    
    /**@ Relative to left margin. */
    wdRelativeHorizontalPositionLeftMarginArea(4),    
    /**@ Relative to outer margin area. */
    wdRelativeHorizontalPositionOuterMarginArea(7),    
    /**@ Relative to right margin. */
    wdRelativeHorizontalPositionRightMarginArea(5);

    private final long value;

    WdRelativeHorizontalPosition(long value) {
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
