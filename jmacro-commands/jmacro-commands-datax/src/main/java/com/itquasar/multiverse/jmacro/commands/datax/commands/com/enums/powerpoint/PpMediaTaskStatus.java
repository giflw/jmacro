package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppmediataskstatus">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppmediataskstatus</a>}
*/
public enum PpMediaTaskStatus implements COMEnum {
    
    /**@ No status */
    ppMediaTaskStatusNone(0),    
    /**@ In progress */
    ppMediaTaskStatusInProgress(1),    
    /**@ Queued */
    ppMediaTaskStatusQueued(2),    
    /**@ Done */
    ppMediaTaskStatusDone(3),    
    /**@ Failed */
    ppMediaTaskStatusFailed(4);

    private final long value;

    PpMediaTaskStatus(long value) {
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
