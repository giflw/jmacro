package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmeasurementunits">https://docs.microsoft.com/en-us/office/vba/api/word.wdmeasurementunits</a>}
*/
public enum WdMeasurementUnits implements COMEnum {
    
    /**@ Centimeters. */
    wdCentimeters(1),    
    /**@ Inches. */
    wdInches(0),    
    /**@ Millimeters. */
    wdMillimeters(2),    
    /**@ Picas (commonly used in traditional typewriter font spacing). */
    wdPicas(4),    
    /**@ Points. */
    wdPoints(3);

    private final long value;

    WdMeasurementUnits(long value) {
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
