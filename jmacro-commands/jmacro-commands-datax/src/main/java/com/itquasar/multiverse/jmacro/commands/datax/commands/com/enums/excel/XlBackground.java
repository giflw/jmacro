package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlbackground">https://docs.microsoft.com/en-us/office/vba/api/excel.xlbackground</a>}
*/
public enum XlBackground implements COMEnum {
    
    /**@ Excel controls the background. */
    xlBackgroundAutomatic(-4105),    
    /**@ Opaque background. */
    xlBackgroundOpaque(3),    
    /**@ Transparent background. */
    xlBackgroundTransparent(2);

    private final long value;

    XlBackground(long value) {
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
