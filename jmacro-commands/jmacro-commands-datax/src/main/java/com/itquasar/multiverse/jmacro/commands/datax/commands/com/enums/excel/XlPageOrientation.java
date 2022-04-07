package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpageorientation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpageorientation</a>}
*/
public enum XlPageOrientation implements COMEnum {
    
    /**@ Landscape mode. */
    xlLandscape(2),    
    /**@ Portrait mode. */
    xlPortrait(1);

    private final long value;

    XlPageOrientation(long value) {
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
