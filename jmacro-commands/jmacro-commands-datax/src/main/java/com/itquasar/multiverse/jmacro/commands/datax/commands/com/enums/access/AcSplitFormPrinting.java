package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acsplitformprinting">https://docs.microsoft.com/en-us/office/vba/api/access.acsplitformprinting</a>}
*/
public enum AcSplitFormPrinting implements COMEnum {
    
    /**@ The contents of the form are printed. */
    acFormOnly(0),    
    /**@ The contents of the datasheet are printed. */
    acGridOnly(1);

    private final long value;

    AcSplitFormPrinting(long value) {
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
