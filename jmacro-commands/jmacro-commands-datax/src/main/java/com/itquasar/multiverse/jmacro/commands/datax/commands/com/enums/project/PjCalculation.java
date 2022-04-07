package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcalculation">https://docs.microsoft.com/en-us/office/vba/api/project.pjcalculation</a>}
*/
public enum PjCalculation implements COMEnum {
    
    /**@ Automatic. */
    pjAutomatic(-1),    
    /**@ Manual. */
    pjManual(0);

    private final long value;

    PjCalculation(long value) {
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
