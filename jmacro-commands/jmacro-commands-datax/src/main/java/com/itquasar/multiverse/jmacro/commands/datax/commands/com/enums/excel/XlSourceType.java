package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsourcetype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsourcetype</a>}
*/
public enum XlSourceType implements COMEnum {
    
    /**@ An AutoFilter range */
    xlSourceAutoFilter(3),    
    /**@ A chart */
    xlSourceChart(5),    
    /**@ A PivotTable report */
    xlSourcePivotTable(6),    
    /**@ A range of cells selected for printing */
    xlSourcePrintArea(2),    
    /**@ A query table (external data range) */
    xlSourceQuery(7),    
    /**@ A range of cells */
    xlSourceRange(4),    
    /**@ An entire worksheet */
    xlSourceSheet(1),    
    /**@ A workbook */
    xlSourceWorkbook(0);

    private final long value;

    XlSourceType(long value) {
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
