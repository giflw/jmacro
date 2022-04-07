package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlplatform">https://docs.microsoft.com/en-us/office/vba/api/excel.xlplatform</a>}
*/
public enum XlPlatform implements COMEnum {
    
    /**@ Macintosh */
    xlMacintosh(1),    
    /**@ MS-DOS */
    xlMSDOS(3),    
    /**@ Microsoft Windows */
    xlWindows(2);

    private final long value;

    XlPlatform(long value) {
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
