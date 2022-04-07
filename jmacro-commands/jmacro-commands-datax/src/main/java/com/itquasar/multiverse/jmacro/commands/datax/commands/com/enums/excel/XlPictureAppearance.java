package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpictureappearance">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpictureappearance</a>}
*/
public enum XlPictureAppearance implements COMEnum {
    
    /**@ The picture is copied as it will look when it is printed. */
    xlPrinter(2),    
    /**@ The picture is copied to resemble its display on the screen as closely as possible. */
    xlScreen(1);

    private final long value;

    XlPictureAppearance(long value) {
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
