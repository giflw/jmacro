package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppfollowcolors">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppfollowcolors</a>}
*/
public enum PpFollowColors implements COMEnum {
    
    /**@ The chart colors follow a mixed format of the slide's color scheme. */
    ppFollowColorsMixed(-2),    
    /**@ The chart colors don't follow the slide's color scheme. */
    ppFollowColorsNone(0),    
    /**@ All the colors in the chart follow the slide's color scheme. */
    ppFollowColorsScheme(1),    
    /**@ Only the text and background follow the slide's color scheme. */
    ppFollowColorsTextAndBackground(2);

    private final long value;

    PpFollowColors(long value) {
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
