package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjmailsystem">https://docs.microsoft.com/en-us/office/vba/api/project.pjmailsystem</a>}
*/
public enum PjMailSystem implements COMEnum {
    
    /**@ Microsoft Mail. */
    pjMAPI(1),    
    /**@ Email system that is compatible with MAPI . */
    pjMAPICompatible(2),    
    /**@ Unrecognized or missing email system. */
    pjNoMailSystem(0);

    private final long value;

    PjMailSystem(long value) {
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
