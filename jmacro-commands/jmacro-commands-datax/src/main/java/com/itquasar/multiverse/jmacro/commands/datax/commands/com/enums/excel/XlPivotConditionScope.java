package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotconditionscope">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotconditionscope</a>}
*/
public enum XlPivotConditionScope implements COMEnum {
    
    /**@ Based on the data in the specified fields. */
    xlDataFieldScope(2),    
    /**@ Based on the specified fields. */
    xlFieldsScope(1),    
    /**@ Based on the specified selection criteria. */
    xlSelectionScope(0);

    private final long value;

    XlPivotConditionScope(long value) {
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
