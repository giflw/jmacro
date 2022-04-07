package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acexportquality">https://docs.microsoft.com/en-us/office/vba/api/access.acexportquality</a>}
*/
public enum AcExportQuality implements COMEnum {
    
    /**@ The output is optimized for printing. */
    acExportQualityPrint(0),    
    /**@ The output is optimized for onscreen display. */
    acExportQualityScreen(1);

    private final long value;

    AcExportQuality(long value) {
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
