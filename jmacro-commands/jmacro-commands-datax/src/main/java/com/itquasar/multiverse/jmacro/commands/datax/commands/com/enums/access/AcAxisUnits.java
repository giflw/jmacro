package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acaxisunits">https://docs.microsoft.com/en-us/office/vba/api/access.acaxisunits</a>}
*/
public enum AcAxisUnits implements COMEnum {
    
    /**@ Billions */
    acAxisUnitsBillions(9),    
    /**@ Hundred Billions */
    acAxisUnitsHundredBillions(11),    
    /**@ Hundred Millions */
    acAxisUnitsHundredMillions(8),    
    /**@ Hundreds */
    acAxisUnitsHundreds(2),    
    /**@ Hundred Thousands */
    acAxisUnitsHundredThousands(5),    
    /**@ Millions */
    acAxisUnitsMillions(6),    
    /**@ None (original values) */
    acAxisUnitsNone(0),    
    /**@ Percentage */
    acAxisUnitsPercentage(1),    
    /**@ Ten Billions */
    acAxisUnitsTenBillions(10),    
    /**@ Ten Millions */
    acAxisUnitsTenMillions(7),    
    /**@ Ten Thousands */
    acAxisUnitsTenThousands(4),    
    /**@ Thousands */
    acAxisUnitsThousands(3),    
    /**@ Trillions */
    acAxisUnitsTrillions(12);

    private final long value;

    AcAxisUnits(long value) {
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
