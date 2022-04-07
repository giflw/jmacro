package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldynamicfiltercriteria">https://docs.microsoft.com/en-us/office/vba/api/excel.xldynamicfiltercriteria</a>}
*/
public enum XlDynamicFilterCriteria implements COMEnum {
    
    /**@ Filter all above-average values. */
    xlFilterAboveAverage(33),    
    /**@ Filter all dates in April. */
    xlFilterAllDatesInPeriodApril(24),    
    /**@ Filter all dates in August. */
    xlFilterAllDatesInPeriodAugust(28),    
    /**@ Filter all dates in December. */
    xlFilterAllDatesInPeriodDecember(32),    
    /**@ Filter all dates in February. */
    xlFilterAllDatesInPeriodFebruary(22),    
    /**@ Filter all dates in January. */
    xlFilterAllDatesInPeriodJanuary(21),    
    /**@ Filter all dates in July. */
    xlFilterAllDatesInPeriodJuly(27),    
    /**@ Filter all dates in June. */
    xlFilterAllDatesInPeriodJune(26),    
    /**@ Filter all dates in March. */
    xlFilterAllDatesInPeriodMarch(23),    
    /**@ Filter all dates in May. */
    xlFilterAllDatesInPeriodMay(25),    
    /**@ Filter all dates in November. */
    xlFilterAllDatesInPeriodNovember(31),    
    /**@ Filter all dates in October. */
    xlFilterAllDatesInPeriodOctober(30),    
    /**@ Filter all dates in Quarter1. */
    xlFilterAllDatesInPeriodQuarter1(17),    
    /**@ Filter all dates in Quarter2. */
    xlFilterAllDatesInPeriodQuarter2(18),    
    /**@ Filter all dates in Quarter3. */
    xlFilterAllDatesInPeriodQuarter3(19),    
    /**@ Filter all dates in Quarter4. */
    xlFilterAllDatesInPeriodQuarter4(20),    
    /**@ Filter all dates in September. */
    xlFilterAllDatesInPeriodSeptember(29),    
    /**@ Filter all below-average values. */
    xlFilterBelowAverage(34),    
    /**@ Filter all values related to last month. */
    xlFilterLastMonth(8),    
    /**@ Filter all values related to last quarter. */
    xlFilterLastQuarter(11),    
    /**@ Filter all values related to last week. */
    xlFilterLastWeek(5),    
    /**@ Filter all values related to last year. */
    xlFilterLastYear(14),    
    /**@ Filter all values related to next month. */
    xlFilterNextMonth(9),    
    /**@ Filter all values related to next quarter. */
    xlFilterNextQuarter(12),    
    /**@ Filter all values related to next week. */
    xlFilterNextWeek(6),    
    /**@ Filter all values related to next year. */
    xlFilterNextYear(15),    
    /**@ Filter all values related to the current month. */
    xlFilterThisMonth(7),    
    /**@ Filter all values related to the current quarter. */
    xlFilterThisQuarter(10),    
    /**@ Filter all values related to the current week. */
    xlFilterThisWeek(4),    
    /**@ Filter all values related to the current year. */
    xlFilterThisYear(13),    
    /**@ Filter all values related to the current date. */
    xlFilterToday(1),    
    /**@ Filter all values related to tomorrow. */
    xlFilterTomorrow(3),    
    /**@ Filter all values from today until a year ago. */
    xlFilterYearToDate(16),    
    /**@ Filter all values related to yesterday. */
    xlFilterYesterday(2);

    private final long value;

    XlDynamicFilterCriteria(long value) {
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
