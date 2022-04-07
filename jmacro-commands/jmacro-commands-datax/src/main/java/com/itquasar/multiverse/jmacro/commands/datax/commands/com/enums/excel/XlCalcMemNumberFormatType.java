package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcalcmemnumberformattype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcalcmemnumberformattype</a>}
*/
public enum XlCalcMemNumberFormatType implements COMEnum {
    
    /**@ Use the default format type of the calculated member for the cell value. */
    xlNumberFormatTypeDefault(0),    
    /**@ Calculated member cell format is a number. */
    xlNumberFormatTypeNumber(1),    
    /**@ Calculated member cell format is a percentage. */
    xlNumberFormatTypePercent(2);

    private final long value;

    XlCalcMemNumberFormatType(long value) {
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
