package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlactiontype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlactiontype</a>}
*/
public enum XlActionType implements COMEnum {
    
    /**@ Drill through */
    xlActionTypeDrillthrough(256),    
    /**@ Report */
    xlActionTypeReport(128),    
    /**@ Rowset */
    xlActionTypeRowset(16),    
    /**@ URL */
    xlActionTypeUrl(1);

    private final long value;

    XlActionType(long value) {
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
