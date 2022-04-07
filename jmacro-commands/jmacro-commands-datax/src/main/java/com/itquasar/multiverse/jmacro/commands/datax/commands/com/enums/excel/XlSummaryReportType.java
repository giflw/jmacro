package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsummaryreporttype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsummaryreporttype</a>}
*/
public enum XlSummaryReportType implements COMEnum {
    
    /**@ List scenarios side by side. */
    xlStandardSummary(1),    
    /**@ Display scenarios in a PivotTable report. */
    xlSummaryPivotTable(-4148);

    private final long value;

    XlSummaryReportType(long value) {
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
