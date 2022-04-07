package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportresolutionunits">https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportresolutionunits</a>}
*/
public enum VisRasterExportResolutionUnits implements COMEnum {
    
    /**@ Pixels per inch. */
    visRasterPixelsPerInch(0),    
    /**@ Pixels per centimeter. */
    visRasterPixelsPerCm(1);

    private final long value;

    VisRasterExportResolutionUnits(long value) {
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
