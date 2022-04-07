package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcolorindex">https://docs.microsoft.com/en-us/office/vba/api/word.wdcolorindex</a>}
*/
public enum WdColorIndex implements COMEnum {
    
    /**@ Automatic color. Default; usually black. */
    wdAuto(0),    
    /**@ Black color. */
    wdBlack(1),    
    /**@ Blue color. */
    wdBlue(2),    
    /**@ Bright green color. */
    wdBrightGreen(4),    
    /**@ Color defined by document author. */
    wdByAuthor(-1),    
    /**@ Dark blue color. */
    wdDarkBlue(9),    
    /**@ Dark red color. */
    wdDarkRed(13),    
    /**@ Dark yellow color. */
    wdDarkYellow(14),    
    /**@ Shade 25 of gray color. */
    wdGray25(16),    
    /**@ Shade 50 of gray color. */
    wdGray50(15),    
    /**@ Green color. */
    wdGreen(11),    
    /**@ Removes highlighting that has been applied. */
    wdNoHighlight(0),    
    /**@ Pink color. */
    wdPink(5),    
    /**@ Red color. */
    wdRed(6),    
    /**@ Teal color. */
    wdTeal(10),    
    /**@ Turquoise color. */
    wdTurquoise(3),    
    /**@ Violet color. */
    wdViolet(12),    
    /**@ White color. */
    wdWhite(8),    
    /**@ Yellow color. */
    wdYellow(7);

    private final long value;

    WdColorIndex(long value) {
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
