package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olbusystatus">https://docs.microsoft.com/en-us/office/vba/api/outlook.olbusystatus</a>}
*/
public enum OlBusyStatus implements COMEnum {
    
    /**@ The user is busy. */
    olBusy(2),    
    /**@ The user is available. */
    olFree(0),    
    /**@ The user is out of office. */
    olOutOfOffice(3),    
    /**@ The user has a tentative appointment scheduled. */
    olTentative(1),    
    /**@ The user is working in a location away from the office. */
    olWorkingElsewhere(4);

    private final long value;

    OlBusyStatus(long value) {
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
