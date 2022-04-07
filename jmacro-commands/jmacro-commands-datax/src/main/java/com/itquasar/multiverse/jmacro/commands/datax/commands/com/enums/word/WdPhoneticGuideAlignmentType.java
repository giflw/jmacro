package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdphoneticguidealignmenttype">https://docs.microsoft.com/en-us/office/vba/api/word.wdphoneticguidealignmenttype</a>}
*/
public enum WdPhoneticGuideAlignmentType implements COMEnum {
    
    /**@ Microsoft Word centers phonetic text over the specified range. This is the default value. */
    wdPhoneticGuideAlignmentCenter(0),    
    /**@ Word left-aligns phonetic text with the specified range. */
    wdPhoneticGuideAlignmentLeft(3),    
    /**@ Word adjusts the inside and outside spacing of the phonetic text in a 1:2:1 ratio. */
    wdPhoneticGuideAlignmentOneTwoOne(2),    
    /**@ Word right-aligns phonetic text with the specified range. */
    wdPhoneticGuideAlignmentRight(4),    
    /**@ Word aligns the phonetic text on the right side of vertical text. */
    wdPhoneticGuideAlignmentRightVertical(5),    
    /**@ Word adjusts the inside and outside spacing of the phonetic text in a 0:1:0 ratio. */
    wdPhoneticGuideAlignmentZeroOneZero(1);

    private final long value;

    WdPhoneticGuideAlignmentType(long value) {
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
