package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlformatconditiontype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlformatconditiontype</a>}
*/
public enum XlFormatConditionType implements COMEnum {
    
    /**@ Above average condition */
    xlAboveAverageCondition(12),    
    /**@ Blanks condition */
    xlBlanksCondition(10),    
    /**@ Cell value */
    xlCellValue(1),    
    /**@ Color scale */
    xlColorScale(3),    
    /**@ DataBar */
    xlDataBar(4),    
    /**@ Errors condition */
    xlErrorsCondition(16),    
    /**@ Expression */
    xlExpression(2),    
    /**@ Icon set */
    xlIconSet(6),    
    /**@ No blanks condition */
    xlNoBlanksCondition(13),    
    /**@ No errors condition */
    xlNoErrorsCondition(17),    
    /**@ Text string */
    xlTextString(9),    
    /**@ Time period */
    xlTimePeriod(11),    
    /**@ Top 10 values */
    xlTop10(5),    
    /**@ Unique values */
    xlUniqueValues(8);

    private final long value;

    XlFormatConditionType(long value) {
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
