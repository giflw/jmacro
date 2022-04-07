package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vismeasurementsystem">https://docs.microsoft.com/en-us/office/vba/api/visio.vismeasurementsystem</a>}
*/
public enum VisMeasurementSystem implements COMEnum {
    
    /**@ Choose metric or U.S., depending on regional options set in Control Panel. */
    visMSDefault(0),    
    /**@ Metric measurement system. */
    visMSMetric(1),    
    /**@ U.S. (English) units measurement system. */
    visMSUS(2);

    private final long value;

    VisMeasurementSystem(long value) {
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
