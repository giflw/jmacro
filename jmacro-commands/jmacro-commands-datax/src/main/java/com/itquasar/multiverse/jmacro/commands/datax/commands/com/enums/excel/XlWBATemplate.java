package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlwbatemplate">https://docs.microsoft.com/en-us/office/vba/api/excel.xlwbatemplate</a>}
*/
public enum XlWBATemplate implements COMEnum {
    
    /**@ Chart */
    xlWBATChart(-4109),    
    /**@ Excel version 4 macro */
    xlWBATExcel4IntlMacroSheet(4),    
    /**@ Excel version 4 international macro */
    xlWBATExcel4MacroSheet(3),    
    /**@ Worksheet */
    xlWBATWorksheet(-4167);

    private final long value;

    XlWBATemplate(long value) {
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
