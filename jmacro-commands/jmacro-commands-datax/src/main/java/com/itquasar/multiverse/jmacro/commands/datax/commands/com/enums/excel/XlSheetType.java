package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsheettype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsheettype</a>}
*/
public enum XlSheetType implements COMEnum {
    
    /**@ Chart */
    xlChart(-4109),    
    /**@ Dialog sheet */
    xlDialogSheet(-4116),    
    /**@ Excel version 4 international macro sheet */
    xlExcel4IntlMacroSheet(4),    
    /**@ Excel version 4 macro sheet */
    xlExcel4MacroSheet(3),    
    /**@ Worksheet */
    xlWorksheet(-4167);

    private final long value;

    XlSheetType(long value) {
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
