package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjfillpattern">https://docs.microsoft.com/en-us/office/vba/api/project.pjfillpattern</a>}
*/
public enum PjFillPattern implements COMEnum {
    
    /**@ Dark fill pattern. */
    pjDarkFillPattern(4),    
    /**@ Diagonal cross pattern. */
    pjDiagonalCrossPattern(7),    
    /**@ Diagonal left pattern. */
    pjDiagonalLeftPattern(5),    
    /**@ Diagonal right pattern. */
    pjDiagonalRightPattern(6),    
    /**@ Hollow pattern. */
    pjHollowPattern(0),    
    /**@ Light fill pattern. */
    pjLightFillPattern(2),    
    /**@ Line cross pattern. */
    pjLineCrossPattern(10),    
    /**@ Line horizontal pattern. */
    pjLineHorizontalPattern(9),    
    /**@ Line vertical pattern. */
    pjLineVerticalPattern(8),    
    /**@ Medium fill pattern. */
    pjMediumFillPattern(3),    
    /**@ Solid fill pattern. */
    pjSolidFillPattern(1);

    private final long value;

    PjFillPattern(long value) {
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
