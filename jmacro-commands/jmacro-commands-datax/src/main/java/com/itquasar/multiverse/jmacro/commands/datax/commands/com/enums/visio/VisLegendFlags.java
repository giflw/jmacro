package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vislegendflags">https://docs.microsoft.com/en-us/office/vba/api/visio.vislegendflags</a>}
*/
public enum VisLegendFlags implements COMEnum {
    
    /**@ Drop the legend and populate it. */
    visLegendPopulate(0),    
    /**@ Drop the legend and don't populate it. */
    visLegendNoContents(1);

    private final long value;

    VisLegendFlags(long value) {
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
