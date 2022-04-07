package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportsize">https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportsize</a>}
*/
public enum VisRasterExportSize implements COMEnum {
    
    /**@ Use screen size. */
    visRasterFitToScreenSize(0),    
    /**@ Use printer size. */
    visRasterFitToPrinterSize(1),    
    /**@ Use source size. */
    visRasterFitToSourceSize(2),    
    /**@ Use custom size. */
    visRasterFitToCustomSize(3);

    private final long value;

    VisRasterExportSize(long value) {
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
