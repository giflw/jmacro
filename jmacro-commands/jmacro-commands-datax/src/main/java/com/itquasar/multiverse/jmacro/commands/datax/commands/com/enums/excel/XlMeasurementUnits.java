package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlmeasurementunits">https://docs.microsoft.com/en-us/office/vba/api/excel.xlmeasurementunits</a>}
*/
public enum XlMeasurementUnits implements COMEnum {
    
    /**@ Centimeters */
    xlCentimeters(1),    
    /**@ Inches */
    xlInches(0),    
    /**@ Millimeters */
    xlMillimeters(2);

    private final long value;

    XlMeasurementUnits(long value) {
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
