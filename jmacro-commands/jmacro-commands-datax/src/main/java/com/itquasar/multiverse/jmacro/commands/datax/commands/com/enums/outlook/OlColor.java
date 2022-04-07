package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olcolor">https://docs.microsoft.com/en-us/office/vba/api/outlook.olcolor</a>}
*/
public enum OlColor implements COMEnum {
    
    /**@ Color is based on system preferences */
    olAutoColor(0),    
    /**@ Aqua */
    olColorAqua(15),    
    /**@ Black */
    olColorBlack(1),    
    /**@ Blue */
    olColorBlue(13),    
    /**@ Fuchsia */
    olColorFuchsia(14),    
    /**@ Gray */
    olColorGray(8),    
    /**@ Green */
    olColorGreen(3),    
    /**@ Lime */
    olColorLime(11),    
    /**@ Maroon */
    olColorMaroon(2),    
    /**@ Navy */
    olColorNavy(5),    
    /**@ Olive */
    olColorOlive(4),    
    /**@ Purple */
    olColorPurple(6),    
    /**@ Red */
    olColorRed(10),    
    /**@ Silver */
    olColorSilver(9),    
    /**@ Teal */
    olColorTeal(7),    
    /**@ White */
    olColorWhite(16),    
    /**@ Yellow */
    olColorYellow(12);

    private final long value;

    OlColor(long value) {
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
