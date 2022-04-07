package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportflip">https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportflip</a>}
*/
public enum VisRasterExportFlip implements COMEnum {
    
    /**@ No flip, the default. */
    visRasterNoFlip(0),    
    /**@ Flip horizontally. */
    visRasterFlipHorizontal(1),    
    /**@ Flip vertically. */
    visRasterFlipVertical(2);

    private final long value;

    VisRasterExportFlip(long value) {
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
