package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbunittype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbunittype</a>}
*/
public enum PbUnitType implements COMEnum {
    
    /**@ Sets the unit of measurement to centimeters. */
    pbUnitCM(1),    
    /**@ Sets the unit of measurement to Emu. */
    pbUnitEmu(4),    
    /**@ Sets the unit of measurement to feet. */
    pbUnitFeet(6),    
    /**@ Sets the unit of measurement to Ha. */
    pbUnitHa(9),    
    /**@ Sets the unit of measurement to inches. */
    pbUnitInch(0),    
    /**@ Sets the unit of measurement to Kyu. */
    pbUnitKyu(8),    
    /**@ Sets the unit of measurement to meters. */
    pbUnitMeter(7),    
    /**@ Sets the unit of measurement to picas. */
    pbUnitPica(2),    
    /**@ Sets the unit of measurement to pixels. */
    pbUnitPixel(10),    
    /**@ Sets the unit of measurement to points. */
    pbUnitPoint(3),    
    /**@ Sets the unit of measurement to twip. */
    pbUnitTwip(5);

    private final long value;

    PbUnitType(long value) {
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
