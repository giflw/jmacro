package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotfieldrepeatlabels">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotfieldrepeatlabels</a>}
*/
public enum XlPivotFieldRepeatLabels implements COMEnum {
    
    /**@ Do not repeat item labels. */
    xlDoNotRepeatLabels(1),    
    /**@ Repeat all item labels. */
    xlRepeatLabels(2);

    private final long value;

    XlPivotFieldRepeatLabels(long value) {
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
