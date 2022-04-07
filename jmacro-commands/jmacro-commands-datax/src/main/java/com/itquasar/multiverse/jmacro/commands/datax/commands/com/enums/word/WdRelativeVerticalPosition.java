package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrelativeverticalposition">https://docs.microsoft.com/en-us/office/vba/api/word.wdrelativeverticalposition</a>}
*/
public enum WdRelativeVerticalPosition implements COMEnum {
    
    /**@ Relative to line. */
    wdRelativeVerticalPositionLine(3),    
    /**@ Relative to margin. */
    wdRelativeVerticalPositionMargin(0),    
    /**@ Relative to page. */
    wdRelativeVerticalPositionPage(1),    
    /**@ Relative to paragraph. */
    wdRelativeVerticalPositionParagraph(2),    
    /**@ Relative to bottom margin. */
    wdRelativeVerticalPositionBottomMarginArea(5),    
    /**@ Relative to inner margin area. */
    wdRelativeVerticalPositionInnerMarginArea(6),    
    /**@ Relative to outer margin area. */
    wdRelativeVerticalPositionOuterMarginArea(7),    
    /**@ Relative to top margin. */
    wdRelativeVerticalPositionTopMarginArea(4);

    private final long value;

    WdRelativeVerticalPosition(long value) {
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
