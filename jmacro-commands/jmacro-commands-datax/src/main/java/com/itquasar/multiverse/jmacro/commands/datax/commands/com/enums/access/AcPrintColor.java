package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acprintcolor">https://docs.microsoft.com/en-us/office/vba/api/access.acprintcolor</a>}
*/
public enum AcPrintColor implements COMEnum {
    
    /**@ The printer should print in color. */
    acPRCMColor(2),    
    /**@ The printer should print in monochrome. */
    acPRCMMonochrome(1);

    private final long value;

    AcPrintColor(long value) {
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
