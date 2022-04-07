package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olcategorycolor">https://docs.microsoft.com/en-us/office/vba/api/outlook.olcategorycolor</a>}
*/
public enum OlCategoryColor implements COMEnum {
    
    /**@ Black */
    olCategoryColorBlack(15),    
    /**@ Blue */
    olCategoryColorBlue(8),    
    /**@ Dark Blue */
    olCategoryColorDarkBlue(23),    
    /**@ Dark Gray */
    olCategoryColorDarkGray(14),    
    /**@ Dark Green */
    olCategoryColorDarkGreen(20),    
    /**@ Dark Maroon */
    olCategoryColorDarkMaroon(25),    
    /**@ Dark Olive */
    olCategoryColorDarkOlive(22),    
    /**@ Dark Orange */
    olCategoryColorDarkOrange(17),    
    /**@ Dark Peach */
    olCategoryColorDarkPeach(18),    
    /**@ Dark Purple */
    olCategoryColorDarkPurple(24),    
    /**@ Dark Red */
    olCategoryColorDarkRed(16),    
    /**@ Dark Steel */
    olCategoryColorDarkSteel(12),    
    /**@ Dark Teal */
    olCategoryColorDarkTeal(21),    
    /**@ Dark Yellow */
    olCategoryColorDarkYellow(19),    
    /**@ Gray */
    olCategoryColorGray(13),    
    /**@ Green */
    olCategoryColorGreen(5),    
    /**@ Maroon */
    olCategoryColorMaroon(10),    
    /**@ No color assigned. */
    olCategoryColorNone(0),    
    /**@ Olive */
    olCategoryColorOlive(7),    
    /**@ Orange */
    olCategoryColorOrange(2),    
    /**@ Peach */
    olCategoryColorPeach(3),    
    /**@ Purple */
    olCategoryColorPurple(9),    
    /**@ Red */
    olCategoryColorRed(1),    
    /**@ Steel */
    olCategoryColorSteel(11),    
    /**@ Teal */
    olCategoryColorTeal(6),    
    /**@ Yellow */
    olCategoryColorYellow(4);

    private final long value;

    OlCategoryColor(long value) {
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
