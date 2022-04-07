package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acmarkertype">https://docs.microsoft.com/en-us/office/vba/api/access.acmarkertype</a>}
*/
public enum AcMarkerType implements COMEnum {
    
    /**@ Asterisk */
    acMarkerAsterisk(4),    
    /**@ Circle */
    acMarkerCircle(8),    
    /**@ Diamond */
    acMarkerDiamond(2),    
    /**@ Long Dash */
    acMarkerLongDash(7),    
    /**@ None */
    acMarkerNone(0),    
    /**@ Plus */
    acMarkerPlus(9),    
    /**@ Short Dash */
    acMarkerShortDash(6),    
    /**@ Square */
    acMarkerSquare(1),    
    /**@ Triangle */
    acMarkerTriangle(3),    
    /**@ X */
    acMarkerX(4);

    private final long value;

    AcMarkerType(long value) {
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
