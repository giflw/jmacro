package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcommandunderlines">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcommandunderlines</a>}
*/
public enum XlCommandUnderlines implements COMEnum {
    
    /**@ Excel controls the display of command underlines. */
    xlCommandUnderlinesAutomatic(-4105),    
    /**@ Command underlines are not displayed. */
    xlCommandUnderlinesOff(-4146),    
    /**@ Command underlines are displayed. */
    xlCommandUnderlinesOn(1);

    private final long value;

    XlCommandUnderlines(long value) {
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
