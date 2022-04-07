package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportdataformat">https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportdataformat</a>}
*/
public enum VisRasterExportDataFormat implements COMEnum {
    
    /**@ Interlace format; the default. */
    visRasterInterlace(0),    
    /**@ Non-interlace format. */
    visRasterNonInterlace(1);

    private final long value;

    VisRasterExportDataFormat(long value) {
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
