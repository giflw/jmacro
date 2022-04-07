package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjmessagetype">https://docs.microsoft.com/en-us/office/vba/api/project.pjmessagetype</a>}
*/
public enum PjMessageType implements COMEnum {
    
    /**@ Display OK and Cancel buttons. */
    pjOKCancel(1),    
    /**@ Display OK button. */
    pjOKOnly(0),    
    /**@ Display Yes and No buttons. */
    pjYesNo(2),    
    /**@ Display Yes, No, and Cancel buttons. */
    pjYesNoCancel(3);

    private final long value;

    PjMessageType(long value) {
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
