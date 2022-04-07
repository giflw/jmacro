package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acprintorientation">https://docs.microsoft.com/en-us/office/vba/api/access.acprintorientation</a>}
*/
public enum AcPrintOrientation implements COMEnum {
    
    /**@ Landscape orientation */
    acPRORLandscape(2),    
    /**@ Portrait orientation */
    acPRORPortrait(1);

    private final long value;

    AcPrintOrientation(long value) {
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
