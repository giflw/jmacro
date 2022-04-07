package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acprintobjquality">https://docs.microsoft.com/en-us/office/vba/api/access.acprintobjquality</a>}
*/
public enum AcPrintObjQuality implements COMEnum {
    
    /**@ The printer prints in draft quality. */
    acPRPQDraft(-1),    
    /**@ The printer prints in high quality. */
    acPRPQHigh(-4),    
    /**@ The printer prints in low quality. */
    acPRPQLow(-2),    
    /**@ The printer prints in medium quality. */
    acPRPQMedium(-3);

    private final long value;

    AcPrintObjQuality(long value) {
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
