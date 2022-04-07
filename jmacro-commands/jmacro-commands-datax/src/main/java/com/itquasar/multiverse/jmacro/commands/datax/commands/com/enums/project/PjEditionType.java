package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjeditiontype">https://docs.microsoft.com/en-us/office/vba/api/project.pjeditiontype</a>}
*/
public enum PjEditionType implements COMEnum {
    
    /**@ Professional edition. */
    pjEditionProfessional(1),    
    /**@ Standard edition. */
    pjEditionStandard(0);

    private final long value;

    PjEditionType(long value) {
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
