package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlfilteralldatesinperiod">https://docs.microsoft.com/en-us/office/vba/api/excel.xlfilteralldatesinperiod</a>}
*/
public enum XlFilterAllDatesInPeriod implements COMEnum {
    
    /**@ Filter all dates for the specified date. */
    xlFilterAllDatesInPeriodDay(2),    
    /**@ Filter all dates for the specified hour. */
    xlFilterAllDatesInPeriodHour(3),    
    /**@ Filter all dates until the specified minute. */
    xlFilterAllDatesInPeriodMinute(4),    
    /**@ Filter all dates for the specified month. */
    xlFilterAllDatesInPeriodMonth(1),    
    /**@ Filter all dates until the specified second. */
    xlFilterAllDatesInPeriodSecond(5),    
    /**@ Filter all dates for the specified year. */
    xlFilterAllDatesInPeriodYear(0);

    private final long value;

    XlFilterAllDatesInPeriod(long value) {
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
