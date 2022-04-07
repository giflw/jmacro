package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oltaskownership">https://docs.microsoft.com/en-us/office/vba/api/outlook.oltaskownership</a>}
*/
public enum OlTaskOwnership implements COMEnum {
    
    /**@ Task has been delegated to another user. */
    olDelegatedTask(1),    
    /**@ Task has not yet been assigned to a user. */
    olNewTask(0),    
    /**@ Task is assigned to the current Outlook user. */
    olOwnTask(2);

    private final long value;

    OlTaskOwnership(long value) {
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
