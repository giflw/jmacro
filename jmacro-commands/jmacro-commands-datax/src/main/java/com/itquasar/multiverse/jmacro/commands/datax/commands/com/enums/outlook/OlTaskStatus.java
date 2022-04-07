package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oltaskstatus">https://docs.microsoft.com/en-us/office/vba/api/outlook.oltaskstatus</a>}
*/
public enum OlTaskStatus implements COMEnum {
    
    /**@ The task is complete. */
    olTaskComplete(2),    
    /**@ The task is deferred. */
    olTaskDeferred(4),    
    /**@ The task is in progress. */
    olTaskInProgress(1),    
    /**@ The task has not yet started. */
    olTaskNotStarted(0),    
    /**@ The task is waiting on someone else. */
    olTaskWaiting(3);

    private final long value;

    OlTaskStatus(long value) {
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
