package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acprintquality">https://docs.microsoft.com/en-us/office/vba/api/access.acprintquality</a>}
*/
public enum AcPrintQuality implements COMEnum {
    
    /**@ Draft quality */
    acDraft(3),    
    /**@ (Default) High quality */
    acHigh(0),    
    /**@ Low quality */
    acLow(2),    
    /**@ Medium quality */
    acMedium(1);

    private final long value;

    AcPrintQuality(long value) {
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
