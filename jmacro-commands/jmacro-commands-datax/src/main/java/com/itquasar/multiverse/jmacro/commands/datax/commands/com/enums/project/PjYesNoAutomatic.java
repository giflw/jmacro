package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjyesnoautomatic">https://docs.microsoft.com/en-us/office/vba/api/project.pjyesnoautomatic</a>}
*/
public enum PjYesNoAutomatic implements COMEnum {
    
    /**@ Automatic. */
    pjAuto(2),    
    /**@ No. */
    pjNo(0),    
    /**@ Yes. */
    pjYes(1);

    private final long value;

    PjYesNoAutomatic(long value) {
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
