package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjalignment">https://docs.microsoft.com/en-us/office/vba/api/project.pjalignment</a>}
*/
public enum PjAlignment implements COMEnum {
    
    /**@ Align data in the center. */
    pjCenter(1),    
    /**@ Align data at the left. */
    pjLeft(0),    
    /**@ Align data at the right. */
    pjRight(2);

    private final long value;

    PjAlignment(long value) {
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
