package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oltaskdelegationstate">https://docs.microsoft.com/en-us/office/vba/api/outlook.oltaskdelegationstate</a>}
*/
public enum OlTaskDelegationState implements COMEnum {
    
    /**@ The delegate accepted the task. */
    olTaskDelegationAccepted(2),    
    /**@ The delegate declined the task. */
    olTaskDelegationDeclined(3),    
    /**@ The delegate response to the task is unknown. */
    olTaskDelegationUnknown(1),    
    /**@ The task has not been delegated. */
    olTaskNotDelegated(0);

    private final long value;

    OlTaskDelegationState(long value) {
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
