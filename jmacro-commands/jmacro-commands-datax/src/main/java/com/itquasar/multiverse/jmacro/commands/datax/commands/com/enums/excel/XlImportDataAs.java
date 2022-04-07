package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlimportdataas">https://docs.microsoft.com/en-us/office/vba/api/excel.xlimportdataas</a>}
*/
public enum XlImportDataAs implements COMEnum {
    
    /**@ Returns the data as a PivotTable. */
    xlPivotTableReport(1),    
    /**@ Returns the data as a QueryTable. */
    xlQueryTable(0);

    private final long value;

    XlImportDataAs(long value) {
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
