package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimfiltereffectsubtype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimfiltereffectsubtype</a>}
*/
public enum MsoAnimFilterEffectSubtype implements COMEnum {
    
    /**@ Across */
    msoAnimFilterEffectSubtypeAcross(9),    
    /**@ Down */
    msoAnimFilterEffectSubtypeDown(25),    
    /**@ Left */
    msoAnimFilterEffectSubtypeDownLeft(14),    
    /**@ Right */
    msoAnimFilterEffectSubtypeDownRight(16),    
    /**@ From Bottom */
    msoAnimFilterEffectSubtypeFromBottom(13),    
    /**@ From Left */
    msoAnimFilterEffectSubtypeFromLeft(10),    
    /**@ From Right */
    msoAnimFilterEffectSubtypeFromRight(11),    
    /**@ From Top */
    msoAnimFilterEffectSubtypeFromTop(12),    
    /**@ Horizontal */
    msoAnimFilterEffectSubtypeHorizontal(5),    
    /**@ In */
    msoAnimFilterEffectSubtypeIn(7),    
    /**@ In Horizontal */
    msoAnimFilterEffectSubtypeInHorizontal(3),    
    /**@ In Vertical */
    msoAnimFilterEffectSubtypeInVertical(1),    
    /**@ Left */
    msoAnimFilterEffectSubtypeLeft(23),    
    /**@ None */
    msoAnimFilterEffectSubtypeNone(0),    
    /**@ Out */
    msoAnimFilterEffectSubtypeOut(8),    
    /**@ Out Horizontal */
    msoAnimFilterEffectSubtypeOutHorizontal(4),    
    /**@ Out Vertical */
    msoAnimFilterEffectSubtypeOutVertical(2),    
    /**@ Right */
    msoAnimFilterEffectSubtypeRight(24),    
    /**@ Spokes 1 */
    msoAnimFilterEffectSubtypeSpokes1(18),    
    /**@ Spokes 2 */
    msoAnimFilterEffectSubtypeSpokes2(19),    
    /**@ Spokes 3 */
    msoAnimFilterEffectSubtypeSpokes3(20),    
    /**@ Spokes 4 */
    msoAnimFilterEffectSubtypeSpokes4(21),    
    /**@ Spokes 8 */
    msoAnimFilterEffectSubtypeSpokes8(22),    
    /**@ Up */
    msoAnimFilterEffectSubtypeUp(26),    
    /**@ Up Left */
    msoAnimFilterEffectSubtypeUpLeft(15),    
    /**@ Up Right */
    msoAnimFilterEffectSubtypeUpRight(17),    
    /**@ Vertical */
    msoAnimFilterEffectSubtypeVertical(6);

    private final long value;

    MsoAnimFilterEffectSubtype(long value) {
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
