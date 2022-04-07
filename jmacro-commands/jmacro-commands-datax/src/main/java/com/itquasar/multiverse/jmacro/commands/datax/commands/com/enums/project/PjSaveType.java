package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjsavetype">https://docs.microsoft.com/en-us/office/vba/api/project.pjsavetype</a>}
*/
public enum PjSaveType implements COMEnum {
    
    /**@ Do not save. */
    pjDoNotSave(0),    
    /**@ Prompt the user before saving. */
    pjPromptSave(2),    
    /**@ Save. */
    pjSave(1);

    private final long value;

    PjSaveType(long value) {
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
