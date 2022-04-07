package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcellinsertionmode">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcellinsertionmode</a>}
*/
public enum XlCellInsertionMode implements COMEnum {
    
    /**@ Partial rows are inserted or deleted to match the exact number of rows required for the new recordset. */
    xlInsertDeleteCells(1),    
    /**@ Entire rows are inserted, if necessary, to accommodate any overflow. No cells or rows are deleted from the worksheet. */
    xlInsertEntireRows(2),    
    /**@ No new cells or rows are added to the worksheet. Data in surrounding cells is overwritten to accommodate any overflow. */
    xlOverwriteCells(0);

    private final long value;

    XlCellInsertionMode(long value) {
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
