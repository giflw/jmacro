package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjverticalalignment">https://docs.microsoft.com/en-us/office/vba/api/project.pjverticalalignment</a>}
*/
public enum PjVerticalAlignment implements COMEnum {
    
    /**@ Bottom. */
    pjBottom(2),    
    /**@ Middle. */
    pjMiddle(1),    
    /**@ Top. */
    pjTop(0);

    private final long value;

    PjVerticalAlignment(long value) {
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
