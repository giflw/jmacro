package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjbackgroundpattern">https://docs.microsoft.com/en-us/office/vba/api/project.pjbackgroundpattern</a>}
*/
public enum PjBackgroundPattern implements COMEnum {
    
    /**@ Dark diagonal left. */
    pjBackgroundDarkDiagonalLeft(7),    
    /**@ Dark diagonal right. */
    pjBackgroundDarkDiagonalRight(8),    
    /**@ Dark dither. */
    pjBackgroundDarkDither(13),    
    /**@ Dark fill. */
    pjBackgroundDarkFill(4),    
    /**@ Diagonal left. */
    pjBackgroundDiagonalLeft(5),    
    /**@ Diagonal right. */
    pjBackgroundDiagonalRight(6),    
    /**@ Hollow. */
    pjBackgroundHollow(0),    
    /**@ Light dither. */
    pjBackgroundLightDither(11),    
    /**@ Light fill. */
    pjBackgroundLightFill(2),    
    /**@ Medium dither. */
    pjBackgroundMediumDither(12),    
    /**@ Medium fill. */
    pjBackgroundMediumFill(3),    
    /**@ Medium vertical stripe */
    pjBackgroundMediumVerticalStripe(10),    
    /**@ Solid fill. */
    pjBackgroundSolidFill(1),    
    /**@ Thin vertical stripe. */
    pjBackgroundThinVerticalStripe(9);

    private final long value;

    PjBackgroundPattern(long value) {
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
