package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjresourcegraphpattern">https://docs.microsoft.com/en-us/office/vba/api/project.pjresourcegraphpattern</a>}
*/
public enum PjResourceGraphPattern implements COMEnum {
    
    /**@ Dark fill. */
    pjDarkFill(4),    
    /**@ Dash dot. */
    pjDashDot(4),    
    /**@ Dash dot dot. */
    pjDashDotDot(5),    
    /**@ Diagonal cross. */
    pjDiagonalCross(7),    
    /**@ Diagonal left. */
    pjDiagonalLeft(5),    
    /**@ Diagonal right. */
    pjDiagonalRight(6),    
    /**@ Continuous. */
    pjGraphContinuous(1),    
    /**@ Dash. */
    pjGraphDash(2),    
    /**@ Dot */
    pjGraphDot(3),    
    /**@ Hollow. */
    pjHollow(0),    
    /**@ Light fill. */
    pjLightFill(2),    
    /**@ Line cross. */
    pjLineCross(10),    
    /**@ Line horizontal. */
    pjLineHorizontal(9),    
    /**@ Line vertical. */
    pjLineVertical(8),    
    /**@ Medium fill. */
    pjMediumFill(3),    
    /**@ No graph line. */
    pjNoGraphLine(0),    
    /**@ Solid fill. */
    pjSolidFill(1);

    private final long value;

    PjResourceGraphPattern(long value) {
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
