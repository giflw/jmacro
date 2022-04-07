package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtextorientation">https://docs.microsoft.com/en-us/office/vba/api/word.wdtextorientation</a>}
*/
public enum WdTextOrientation implements COMEnum {
    
    /**@ Text flows downward on a slope. */
    wdTextOrientationDownward(3),    
    /**@ Text flows horizontally. Default. */
    wdTextOrientationHorizontal(0),    
    /**@ Text flows horizontally but from right to left to accommodate right-to-left languages. */
    wdTextOrientationHorizontalRotatedFarEast(4),    
    /**@ Text flows upward on a slope. */
    wdTextOrientationUpward(2),    
    /**@ Text flows vertically and reads downward from the top, right to left. */
    wdTextOrientationVerticalFarEast(1),    
    /**@ Text flows vertically and reads downward from the top, left to right. */
    wdTextOrientationVertical(5);

    private final long value;

    WdTextOrientation(long value) {
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
