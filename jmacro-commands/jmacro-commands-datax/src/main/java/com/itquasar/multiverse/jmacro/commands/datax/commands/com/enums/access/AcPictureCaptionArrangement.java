package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acpicturecaptionarrangement">https://docs.microsoft.com/en-us/office/vba/api/access.acpicturecaptionarrangement</a>}
*/
public enum AcPictureCaptionArrangement implements COMEnum {
    
    /**@ The caption appears below the picture. */
    acBottom(3),    
    /**@ The caption uses the General alignment setting. */
    acGeneral(1),    
    /**@ The caption appears to the left of the picture. */
    acLeft(4),    
    /**@ The caption is not displayed. */
    acNoPictureCaption(0),    
    /**@ The caption appears to the right of the picture. */
    acRight(5),    
    /**@ The caption appears above the picture. */
    acTop(2);

    private final long value;

    AcPictureCaptionArrangement(long value) {
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
