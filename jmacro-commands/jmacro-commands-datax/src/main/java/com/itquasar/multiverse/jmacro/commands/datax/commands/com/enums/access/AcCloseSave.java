package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acclosesave">https://docs.microsoft.com/en-us/office/vba/api/access.acclosesave</a>}
*/
public enum AcCloseSave implements COMEnum {
    
    /**@ The specified object is not saved. */
    acSaveNo(2),    
    /**@ The user is asked whether or not they want to save the object. This value is ignored if you are closing a Visual Basic module. The module will be closed, but changes to the module will not be saved. */
    acSavePrompt(0),    
    /**@ The specified object is saved. */
    acSaveYes(1);

    private final long value;

    AcCloseSave(long value) {
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
