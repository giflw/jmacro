package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimdirection">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimdirection</a>}
*/
public enum MsoAnimDirection implements COMEnum {
    
    /**@ Across */
    msoAnimDirectionAcross(18),    
    /**@ Bottom */
    msoAnimDirectionBottom(11),    
    /**@ Bottom Left */
    msoAnimDirectionBottomLeft(15),    
    /**@ Bottom Right */
    msoAnimDirectionBottomRight(14),    
    /**@ Center */
    msoAnimDirectionCenter(28),    
    /**@ Clockwise */
    msoAnimDirectionClockwise(21),    
    /**@ Counterclockwise */
    msoAnimDirectionCounterclockwise(22),    
    /**@ Cycle Clockwise */
    msoAnimDirectionCycleClockwise(43),    
    /**@ Cycle Counterclockwise */
    msoAnimDirectionCycleCounterclockwise(44),    
    /**@ Down */
    msoAnimDirectionDown(3),    
    /**@ Down Left */
    msoAnimDirectionDownLeft(9),    
    /**@ Down Right */
    msoAnimDirectionDownRight(8),    
    /**@ Text is all caps */
    msoAnimDirectionFontAllCaps(40),    
    /**@ Bold style is used */
    msoAnimDirectionFontBold(35),    
    /**@ Italic style is used */
    msoAnimDirectionFontItalic(36),    
    /**@ Shadow style is used */
    msoAnimDirectionFontShadow(39),    
    /**@ Strikethrough style is used */
    msoAnimDirectionFontStrikethrough(38),    
    /**@ Underlined style is used */
    msoAnimDirectionFontUnderline(37),    
    /**@ Gradual */
    msoAnimDirectionGradual(42),    
    /**@ Horizontal */
    msoAnimDirectionHorizontal(16),    
    /**@ Horizontal In */
    msoAnimDirectionHorizontalIn(23),    
    /**@ Horizontal Out */
    msoAnimDirectionHorizontalOut(24),    
    /**@ In */
    msoAnimDirectionIn(19),    
    /**@ In Bottom */
    msoAnimDirectionInBottom(31),    
    /**@ In Center */
    msoAnimDirectionInCenter(30),    
    /**@ In Slightly */
    msoAnimDirectionInSlightly(29),    
    /**@ Appears Instantly */
    msoAnimDirectionInstant(41),    
    /**@ Appears from Left */
    msoAnimDirectionLeft(4),    
    /**@ None */
    msoAnimDirectionNone(0),    
    /**@ Ordinal Mask */
    msoAnimDirectionOrdinalMask(5),    
    /**@ Out */
    msoAnimDirectionOut(20),    
    /**@ Moves out from the Bottom */
    msoAnimDirectionOutBottom(34),    
    /**@ Moves out from the Center */
    msoAnimDirectionOutCenter(33),    
    /**@ Slightly Out */
    msoAnimDirectionOutSlightly(32),    
    /**@ Moves to the Right */
    msoAnimDirectionRight(2),    
    /**@ Slightly */
    msoAnimDirectionSlightly(27),    
    /**@ Moves to the Top */
    msoAnimDirectionTop(10),    
    /**@ Moves to the Top Left */
    msoAnimDirectionTopLeft(12),    
    /**@ Moves to the Top Right */
    msoAnimDirectionTopRight(13),    
    /**@ Moves Up */
    msoAnimDirectionUp(1),    
    /**@ Moves up to the Left */
    msoAnimDirectionUpLeft(6),    
    /**@ Moves up to the Right */
    msoAnimDirectionUpRight(7),    
    /**@ Moves Vertically */
    msoAnimDirectionVertical(17),    
    /**@ Moves Vertically In */
    msoAnimDirectionVerticalIn(25),    
    /**@ Moves Vertically Out */
    msoAnimDirectionVerticalOut(26);

    private final long value;

    MsoAnimDirection(long value) {
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
