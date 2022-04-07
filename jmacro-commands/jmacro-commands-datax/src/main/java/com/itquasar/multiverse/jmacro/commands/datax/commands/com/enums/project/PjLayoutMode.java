package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjlayoutmode">https://docs.microsoft.com/en-us/office/vba/api/project.pjlayoutmode</a>}
*/
public enum PjLayoutMode implements COMEnum {
    
    /**@ Layout is done automatically. */
    pjLayoutAutomatic(1),    
    /**@ Layout is done manually. */
    pjLayoutManual(2);

    private final long value;

    PjLayoutMode(long value) {
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
