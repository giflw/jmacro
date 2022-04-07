package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlsizerepresents">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlsizerepresents</a>}
*/
public enum XlSizeRepresents implements COMEnum {
    
    /**@ The area of the bubble. */
    xlSizeIsArea(1),    
    /**@ The width of the bubble. */
    xlSizeIsWidth(2);

    private final long value;

    XlSizeRepresents(long value) {
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
