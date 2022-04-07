package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xloarthorizontaloverflow">https://docs.microsoft.com/en-us/office/vba/api/excel.xloarthorizontaloverflow</a>}
*/
public enum XlOartHorizontalOverflow implements COMEnum {
    
    /**@ Hide text that does not fit horizontally in the text frame. */
    xlOartHorizontalOverflowClip(1),    
    /**@ Allow text to overflow the text frame horizontally. */
    xlOartHorizontalOverflowOverflow(0);

    private final long value;

    XlOartHorizontalOverflow(long value) {
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
