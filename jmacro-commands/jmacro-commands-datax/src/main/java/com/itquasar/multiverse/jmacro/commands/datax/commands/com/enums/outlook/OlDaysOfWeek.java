package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oldaysofweek">https://docs.microsoft.com/en-us/office/vba/api/outlook.oldaysofweek</a>}
*/
public enum OlDaysOfWeek implements COMEnum {
    
    /**@ Friday */
    olFriday(32),    
    /**@ Monday */
    olMonday(2),    
    /**@ Saturday */
    olSaturday(64),    
    /**@ Sunday */
    olSunday(1),    
    /**@ Thursday */
    olThursday(16),    
    /**@ Tuesday */
    olTuesday(4),    
    /**@ Wednesday */
    olWednesday(8);

    private final long value;

    OlDaysOfWeek(long value) {
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
