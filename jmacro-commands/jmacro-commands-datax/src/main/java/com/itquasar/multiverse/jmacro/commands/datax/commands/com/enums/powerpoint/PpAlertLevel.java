package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppalertlevel">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppalertlevel</a>}
*/
public enum PpAlertLevel implements COMEnum {
    
    /**@ All alerts displayed. */
    ppAlertsAll(2),    
    /**@ No alerts displayed. */
    ppAlertsNone(1);

    private final long value;

    PpAlertLevel(long value) {
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
