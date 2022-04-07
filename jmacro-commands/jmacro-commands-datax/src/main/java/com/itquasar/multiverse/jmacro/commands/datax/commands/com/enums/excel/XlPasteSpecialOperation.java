package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpastespecialoperation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpastespecialoperation</a>}
*/
public enum XlPasteSpecialOperation implements COMEnum {
    
    /**@ Copied data will be added to the value in the destination cell. */
    xlPasteSpecialOperationAdd(2),    
    /**@ Copied data will divide the value in the destination cell. */
    xlPasteSpecialOperationDivide(5),    
    /**@ Copied data will multiply the value in the destination cell. */
    xlPasteSpecialOperationMultiply(4),    
    /**@ No calculation will be done in the paste operation. */
    xlPasteSpecialOperationNone(-4142),    
    /**@ Copied data will be subtracted from the value in the destination cell. */
    xlPasteSpecialOperationSubtract(3);

    private final long value;

    XlPasteSpecialOperation(long value) {
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
