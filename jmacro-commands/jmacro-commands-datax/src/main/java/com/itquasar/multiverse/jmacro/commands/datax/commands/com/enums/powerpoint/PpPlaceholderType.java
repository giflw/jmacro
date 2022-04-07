package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppplaceholdertype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppplaceholdertype</a>}
*/
public enum PpPlaceholderType implements COMEnum {
    
    /**@ Bitmap */
    ppPlaceholderBitmap(9),    
    /**@ Body */
    ppPlaceholderBody(2),    
    /**@ Center Title */
    ppPlaceholderCenterTitle(3),    
    /**@ Chart */
    ppPlaceholderChart(8),    
    /**@ Date */
    ppPlaceholderDate(16),    
    /**@ Footer */
    ppPlaceholderFooter(15),    
    /**@ Header */
    ppPlaceholderHeader(14),    
    /**@ Media Clip */
    ppPlaceholderMediaClip(10),    
    /**@ Mixed */
    ppPlaceholderMixed(-2),    
    /**@ Object */
    ppPlaceholderObject(7),    
    /**@ Organization Chart */
    ppPlaceholderOrgChart(11),    
    /**@ Picture */
    ppPlaceholderPicture(18),    
    /**@ Slide Number */
    ppPlaceholderSlideNumber(13),    
    /**@ Subtitle */
    ppPlaceholderSubtitle(4),    
    /**@ Table */
    ppPlaceholderTable(12),    
    /**@ Title */
    ppPlaceholderTitle(1),    
    /**@ Vertical Body */
    ppPlaceholderVerticalBody(6),    
    /**@ Vertical Object */
    ppPlaceholderVerticalObject(17),    
    /**@ Vertical Title */
    ppPlaceholderVerticalTitle(5);

    private final long value;

    PpPlaceholderType(long value) {
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
