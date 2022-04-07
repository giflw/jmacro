package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlerrorchecks">https://docs.microsoft.com/en-us/office/vba/api/excel.xlerrorchecks</a>}
*/
public enum XlErrorChecks implements COMEnum {
    
    /**@ The cell contains a formula referring to empty cells. */
    xlEmptyCellReferences(7),    
    /**@ The cell evaluates to an error value. */
    xlEvaluateToError(1),    
    /**@ The cell contains an inconsistent formula for a region. */
    xlInconsistentFormula(4),    
    /**@ The cell contains an inconsistent formula for a list. */
    xlInconsistentListFormula(9),    
    /**@ Data in the list contains a validation error. */
    xlListDataValidation(8),    
    /**@ Number entered as text. */
    xlNumberAsText(3),    
    /**@ Cells omitted. */
    xlOmittedCells(5),    
    /**@ Date entered as text. */
    xlTextDate(2),    
    /**@ Formula cells are unlocked. */
    xlUnlockedFormulaCells(6);

    private final long value;

    XlErrorChecks(long value) {
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
