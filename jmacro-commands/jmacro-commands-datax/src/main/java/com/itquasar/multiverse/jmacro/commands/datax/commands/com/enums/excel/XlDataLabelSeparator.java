package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldatalabelseparator">https://docs.microsoft.com/en-us/office/vba/api/excel.xldatalabelseparator</a>}
*/
public enum XlDataLabelSeparator implements COMEnum {
    
    /**@ Excel selects the separator. */
    xlDataLabelSeparatorDefault(1);

    private final long value;

    XlDataLabelSeparator(long value) {
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
