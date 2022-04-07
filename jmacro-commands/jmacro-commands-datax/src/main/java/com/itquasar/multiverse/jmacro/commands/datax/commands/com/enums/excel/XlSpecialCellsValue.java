package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlspecialcellsvalue">https://docs.microsoft.com/en-us/office/vba/api/excel.xlspecialcellsvalue</a>}
*/
public enum XlSpecialCellsValue implements COMEnum {
    
    /**@ Cells with errors. */
    xlErrors(16),    
    /**@ Cells with logical values. */
    xlLogical(4),    
    /**@ Cells with numeric values. */
    xlNumbers(1),    
    /**@ Cells with text. */
    xlTextValues(2);

    private final long value;

    XlSpecialCellsValue(long value) {
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
