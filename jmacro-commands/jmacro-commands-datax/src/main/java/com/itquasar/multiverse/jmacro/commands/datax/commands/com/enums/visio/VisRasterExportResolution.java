package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportresolution">https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportresolution</a>}
*/
public enum VisRasterExportResolution implements COMEnum {
    
    /**@ Use screen resolution. */
    visRasterUseScreenResolution(0),    
    /**@ Use printer resolution. */
    visRasterUsePrinterResolution(1),    
    /**@ Use source resolution. */
    visRasterUseSourceResolution(2),    
    /**@ Use custom resolution. */
    visRasterUseCustomResolution(3);

    private final long value;

    VisRasterExportResolution(long value) {
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
