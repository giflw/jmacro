package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjaccounttype">https://docs.microsoft.com/en-us/office/vba/api/project.pjaccounttype</a>}
*/
public enum PjAccountType implements COMEnum {
    
    /**@ Manager account. */
    pjManagerAccount(1),    
    /**@ Resource account. */
    pjResourceAccount(0);

    private final long value;

    PjAccountType(long value) {
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
