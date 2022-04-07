package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlthemefont">https://docs.microsoft.com/en-us/office/vba/api/excel.xlthemefont</a>}
*/
public enum XlThemeFont implements COMEnum {
    
    /**@ Major. */
    xlThemeFontMajor(2),    
    /**@ Minor. */
    xlThemeFontMinor(1),    
    /**@ Do not use any theme font. */
    xlThemeFontNone(0);

    private final long value;

    XlThemeFont(long value) {
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
