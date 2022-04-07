package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportsizeunits">https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportsizeunits</a>}
*/
public enum VisRasterExportSizeUnits implements COMEnum {
    
    /**@ Pixels */
    visRasterPixel(0),    
    /**@ Centimeters */
    visRasterCm(1),    
    /**@ Inches */
    visRasterInch(2);

    private final long value;

    VisRasterExportSizeUnits(long value) {
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
