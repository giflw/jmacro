package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xltimeperiods">https://docs.microsoft.com/en-us/office/vba/api/excel.xltimeperiods</a>}
*/
public enum XlTimePeriods implements COMEnum {
    
    /**@ Last 7 days */
    xlLast7Days(2),    
    /**@ Last month */
    xlLastMonth(5),    
    /**@ Last week */
    xlLastWeek(4),    
    /**@ Next month */
    xlNextMonth(8),    
    /**@ Next week */
    xlNextWeek(7),    
    /**@ This month */
    xlThisMonth(9),    
    /**@ This week */
    xlThisWeek(3),    
    /**@ Today */
    xlToday(0),    
    /**@ Tomorrow */
    xlTomorrow(6),    
    /**@ Yesterday */
    xlYesterday(1);

    private final long value;

    XlTimePeriods(long value) {
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
