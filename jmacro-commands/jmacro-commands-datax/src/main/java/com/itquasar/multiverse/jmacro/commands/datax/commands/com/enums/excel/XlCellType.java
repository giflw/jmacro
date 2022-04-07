package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcelltype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcelltype</a>}
*/
public enum XlCellType implements COMEnum {
    
    /**@ Cells of any format. */
    xlCellTypeAllFormatConditions(-4172),    
    /**@ Cells having validation criteria. */
    xlCellTypeAllValidation(-4174),    
    /**@ Empty cells. */
    xlCellTypeBlanks(4),    
    /**@ Cells containing notes. */
    xlCellTypeComments(-4144),    
    /**@ Cells containing constants. */
    xlCellTypeConstants(2),    
    /**@ Cells containing formulas. */
    xlCellTypeFormulas(-4123),    
    /**@ The last cell in the used range. */
    xlCellTypeLastCell(11),    
    /**@ Cells having the same format. */
    xlCellTypeSameFormatConditions(-4173),    
    /**@ Cells having the same validation criteria. */
    xlCellTypeSameValidation(-4175),    
    /**@ All visible cells. */
    xlCellTypeVisible(12);

    private final long value;

    XlCellType(long value) {
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
