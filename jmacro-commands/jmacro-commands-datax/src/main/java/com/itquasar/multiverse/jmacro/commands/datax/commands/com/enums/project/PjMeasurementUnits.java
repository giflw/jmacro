package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjmeasurementunits">https://docs.microsoft.com/en-us/office/vba/api/project.pjmeasurementunits</a>}
*/
public enum PjMeasurementUnits implements COMEnum {
    
    /**@ The MaxImageWidth and MaxImageHeight values are in centimeters. */
    pjCentimeters(1),    
    /**@ The MaxImageWidth and MaxImageHeight values are in the default system measurement units. The default Measurement System is selected in the Regional and Language Options of the Windows Control Panel. */
    pjDefault(2),    
    /**@ The MaxImageWidth and MaxImageHeight values are in inches. */
    pjInches(0);

    private final long value;

    PjMeasurementUnits(long value) {
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
