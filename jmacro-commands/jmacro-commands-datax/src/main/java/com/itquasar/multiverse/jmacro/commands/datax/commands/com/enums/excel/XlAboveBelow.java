package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlabovebelow">https://docs.microsoft.com/en-us/office/vba/api/excel.xlabovebelow</a>}
*/
public enum XlAboveBelow implements COMEnum {
    
    /**@ Above average */
    xlAboveAverage(0),    
    /**@ Above standard deviation */
    xlAboveStdDev(4),    
    /**@ Below average */
    xlBelowAverage(1),    
    /**@ Below standard deviation */
    xlBelowStdDev(5),    
    /**@ Equal above average */
    xlEqualAboveAverage(2),    
    /**@ Equal below average */
    xlEqualBelowAverage(3);

    private final long value;

    XlAboveBelow(long value) {
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
