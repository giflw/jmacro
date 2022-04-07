package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oltaskresponse">https://docs.microsoft.com/en-us/office/vba/api/outlook.oltaskresponse</a>}
*/
public enum OlTaskResponse implements COMEnum {
    
    /**@ Task accepted. */
    olTaskAccept(2),    
    /**@ Task reassigned. */
    olTaskAssign(1),    
    /**@ Task declined. */
    olTaskDecline(3),    
    /**@ Task is a simple task and cannot be accepted, declined, or assigned. This constant is not a valid parameter to the TaskItem.Respond method. */
    olTaskSimple(0);

    private final long value;

    OlTaskResponse(long value) {
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
