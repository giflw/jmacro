package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjiscommandenabled">https://docs.microsoft.com/en-us/office/vba/api/project.pjiscommandenabled</a>}
*/
public enum PjIsCommandEnabled implements COMEnum {
    
    /**@ The command is disabled. */
    pjCommandDisabled(1),    
    /**@ The command is enabled. */
    pjCommandEnabled(0),    
    /**@ The command is undefined. */
    pjCommandUndefined(2);

    private final long value;

    PjIsCommandEnabled(long value) {
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
