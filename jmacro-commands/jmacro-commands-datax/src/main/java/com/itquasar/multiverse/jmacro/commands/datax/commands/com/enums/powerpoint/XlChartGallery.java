package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlchartgallery">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlchartgallery</a>}
*/
public enum XlChartGallery implements COMEnum {
    
    /**@ Either of the galleries. */
    xlAnyGallery(23),    
    /**@ The built-in gallery. */
    xlBuiltIn(21),    
    /**@ The user-defined gallery. */
    xlUserDefined(22);

    private final long value;

    XlChartGallery(long value) {
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
