package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjbarendshape">https://docs.microsoft.com/en-us/office/vba/api/project.pjbarendshape</a>}
*/
public enum PjBarEndShape implements COMEnum {
    
    /**@ Arrow pointing down. */
    pjArrowDown(14),    
    /**@ Arrow pointing up. */
    pjArrowUp(8),    
    /**@ Caret pointing down on the top half of the bar. */
    pjCaretDownTop(9),    
    /**@ Caret pointing up on the bottom half of the bar. */
    pjCaretUpBottom(10),    
    /**@ Circle. */
    pjCircle(19),    
    /**@ Circled arrow pointing down. */
    pjCircleArrowDown(18),    
    /**@ Circled arrow pointing up. */
    pjCircleArrowUp(17),    
    /**@ Circled diamond. */
    pjCircleDiamond(13),    
    /**@ Circled triangle pointing down. */
    pjCircleTriangleDown(16),    
    /**@ Circled triangle pointing up. */
    pjCircleTriangleUp(15),    
    /**@ Diamond. */
    pjDiamond(3),    
    /**@ Upside-down house. */
    pjHouseDown(2),    
    /**@ House. */
    pjHouseUp(1),    
    /**@ Left bracket. */
    pjLeftBracket(21),    
    /**@ Left fade. */
    pjLeftFade(23),    
    /**@ Line. */
    pjLineShape(11),    
    /**@ None. */
    pjNoBarEndShape(0),    
    /**@ Right bracket. */
    pjRightBracket(22),    
    /**@ Right fade. */
    pjRightFade(24),    
    /**@ Square. */
    pjSquare(12),    
    /**@ Star. */
    pjStar(20),    
    /**@ Triangle pointing down. */
    pjTriangleDown(5),    
    /**@ Triangle pointing left. */
    pjTriangleLeft(7),    
    /**@ Triangle pointing right. */
    pjTriangleRight(6),    
    /**@ Circled triangle pointing up. */
    pjTriangleUp(4);

    private final long value;

    PjBarEndShape(long value) {
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
