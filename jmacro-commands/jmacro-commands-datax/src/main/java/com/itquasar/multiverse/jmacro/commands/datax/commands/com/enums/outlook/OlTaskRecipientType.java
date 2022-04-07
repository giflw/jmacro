package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oltaskrecipienttype">https://docs.microsoft.com/en-us/office/vba/api/outlook.oltaskrecipienttype</a>}
*/
public enum OlTaskRecipientType implements COMEnum {
    
    /**@ Indicates that the recipient will receive completion reports for the task. */
    olFinalStatus(3),    
    /**@ Indicates that the recipient will receive status updates for the task. */
    olUpdate(2);

    private final long value;

    OlTaskRecipientType(long value) {
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
