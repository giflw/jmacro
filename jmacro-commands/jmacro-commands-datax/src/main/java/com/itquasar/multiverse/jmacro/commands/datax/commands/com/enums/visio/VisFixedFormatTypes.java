package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visfixedformattypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visfixedformattypes</a>}
*/
public enum VisFixedFormatTypes implements COMEnum {
    
    /**@ PDF format. */
    visFixedFormatPDF(1),    
    /**@ XPS format. */
    visFixedFormatXPS(2);

    private final long value;

    VisFixedFormatTypes(long value) {
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
