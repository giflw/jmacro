package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjbartype">https://docs.microsoft.com/en-us/office/vba/api/project.pjbartype</a>}
*/
public enum PjBarType implements COMEnum {
    
    /**@ Dashed. */
    pjDashed(2),    
    /**@ Framed. */
    pjFramed(1),    
    /**@ Solid. */
    pjSolid(0);

    private final long value;

    PjBarType(long value) {
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
