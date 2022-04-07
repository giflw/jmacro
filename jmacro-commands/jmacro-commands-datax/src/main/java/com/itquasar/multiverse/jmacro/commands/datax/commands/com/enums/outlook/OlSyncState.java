package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olsyncstate">https://docs.microsoft.com/en-us/office/vba/api/outlook.olsyncstate</a>}
*/
public enum OlSyncState implements COMEnum {
    
    /**@ Synchronization started */
    olSyncStarted(1),    
    /**@ Synchronization stopped */
    olSyncStopped(0);

    private final long value;

    OlSyncState(long value) {
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
