package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppframecolors">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppframecolors</a>}
*/
public enum PpFrameColors implements COMEnum {
    
    /**@ Use White text on a Black frame. */
    ppFrameColorsBlackTextOnWhite(5),    
    /**@ Use browser colors for the pane and text. */
    ppFrameColorsBrowserColors(1),    
    /**@ Use the Presentation Scheme Accent color. */
    ppFrameColorsPresentationSchemeAccentColor(3),    
    /**@ Use the Presentation Scheme Text Color. */
    ppFrameColorsPresentationSchemeTextColor(2),    
    /**@ Use Black text on a White frame. */
    ppFrameColorsWhiteTextOnBlack(4);

    private final long value;

    PpFrameColors(long value) {
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
