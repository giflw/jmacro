package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oltimestyle">https://docs.microsoft.com/en-us/office/vba/api/outlook.oltimestyle</a>}
*/
public enum OlTimeStyle implements COMEnum {
    
    /**@ The drop-down portion of the time control displays only duration values with the interval set by the OlkTimeControl.IntervalTime property. */
    olTimeStyleShortDuration(4),    
    /**@ The drop-down portion of the time control displays time values starting from the ReferenceTime and uses the OlkTimeControl.IntervalTime property as the increment. The edit box of the time control displays the duration from the ReferenceTime to the selected time. */
    olTimeStyleTimeDuration(1),    
    /**@ The drop-down portion of the time control displays only time values with the interval set by the OlkTimeControl.IntervalTime property. */
    olTimeStyleTimeOnly(0);

    private final long value;

    OlTimeStyle(long value) {
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
