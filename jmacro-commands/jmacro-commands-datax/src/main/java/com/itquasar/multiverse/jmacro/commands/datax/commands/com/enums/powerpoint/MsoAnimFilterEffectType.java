package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimfiltereffecttype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimfiltereffecttype</a>}
*/
public enum MsoAnimFilterEffectType implements COMEnum {
    
    /**@ Barn */
    msoAnimFilterEffectTypeBarn(1),    
    /**@ Blinds */
    msoAnimFilterEffectTypeBlinds(2),    
    /**@ Box */
    msoAnimFilterEffectTypeBox(3),    
    /**@ Checkerboard */
    msoAnimFilterEffectTypeCheckerboard(4),    
    /**@ Circle */
    msoAnimFilterEffectTypeCircle(5),    
    /**@ Diamond */
    msoAnimFilterEffectTypeDiamond(6),    
    /**@ Dissolve */
    msoAnimFilterEffectTypeDissolve(7),    
    /**@ Fade */
    msoAnimFilterEffectTypeFade(8),    
    /**@ Image */
    msoAnimFilterEffectTypeImage(9),    
    /**@ No effect */
    msoAnimFilterEffectTypeNone(0),    
    /**@ Pixelate */
    msoAnimFilterEffectTypePixelate(10),    
    /**@ Plus */
    msoAnimFilterEffectTypePlus(11),    
    /**@ Random bars */
    msoAnimFilterEffectTypeRandomBar(12),    
    /**@ Slide */
    msoAnimFilterEffectTypeSlide(13),    
    /**@ Stretch */
    msoAnimFilterEffectTypeStretch(14),    
    /**@ Strips */
    msoAnimFilterEffectTypeStrips(15),    
    /**@ Wedge */
    msoAnimFilterEffectTypeWedge(16),    
    /**@ Wheel */
    msoAnimFilterEffectTypeWheel(17),    
    /**@ Wipe */
    msoAnimFilterEffectTypeWipe(18);

    private final long value;

    MsoAnimFilterEffectType(long value) {
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
