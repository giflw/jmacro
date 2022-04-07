package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotcelltype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotcelltype</a>}
*/
public enum XlPivotCellType implements COMEnum {
    
    /**@ A structural blank cell in the PivotTable. */
    xlPivotCellBlankCell(9),    
    /**@ A cell in the row or column area that is a custom subtotal. */
    xlPivotCellCustomSubtotal(7),    
    /**@ A data field label (not the Data button). */
    xlPivotCellDataField(4),    
    /**@ The Data button. */
    xlPivotCellDataPivotField(8),    
    /**@ A cell in a row or column area that is a grand total. */
    xlPivotCellGrandTotal(3),    
    /**@ The cell that shows the selected item of a Page field. */
    xlPivotCellPageFieldItem(6),    
    /**@ The button for a field (not the Data button). */
    xlPivotCellPivotField(5),    
    /**@ A cell in the row or column area that is not a subtotal, grand total, custom subtotal, or blank line. */
    xlPivotCellPivotItem(1),    
    /**@ A cell in the row or column area that is a subtotal. */
    xlPivotCellSubtotal(2),    
    /**@ Any cell in the data area (except a blank row). */
    xlPivotCellValue(0);

    private final long value;

    XlPivotCellType(long value) {
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
