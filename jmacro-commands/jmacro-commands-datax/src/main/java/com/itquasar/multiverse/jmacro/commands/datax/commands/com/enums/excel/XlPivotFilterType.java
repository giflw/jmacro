package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotfiltertype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotfiltertype</a>}
*/
public enum XlPivotFilterType implements COMEnum {
    
    /**@ Filters for all dates before a specified date */
    xlBefore(31),    
    /**@ Filters for all dates on or before a specified date */
    xlBeforeOrEqualTo(32),    
    /**@ Filters for all dates after a specified date */
    xlAfter(33),    
    /**@ Filters for all dates on or after a specified date */
    xlAfterOrEqualTo(34),    
    /**@ Filters for all dates in January */
    xlAllDatesInPeriodJanuary(57),    
    /**@ Filters for all dates in February */
    xlAllDatesInPeriodFebruary(58),    
    /**@ Filters for all dates in March */
    xlAllDatesInPeriodMarch(59),    
    /**@ Filters for all dates in April */
    xlAllDatesInPeriodApril(60),    
    /**@ Filters for all dates in May */
    xlAllDatesInPeriodMay(61),    
    /**@ Filters for all dates in June */
    xlAllDatesInPeriodJune(62),    
    /**@ Filters for all dates in July */
    xlAllDatesInPeriodJuly(63),    
    /**@ Filters for all dates in August */
    xlAllDatesInPeriodAugust(64),    
    /**@ Filters for all dates in September */
    xlAllDatesInPeriodSeptember(65),    
    /**@ Filters for all dates in October */
    xlAllDatesInPeriodOctober(66),    
    /**@ Filters for all dates in November */
    xlAllDatesInPeriodNovember(67),    
    /**@ Filters for all dates in December */
    xlAllDatesInPeriodDecember(68),    
    /**@ Filters for all dates in Quarter1 */
    xlAllDatesInPeriodQuarter1(53),    
    /**@ Filters for all dates in Quarter2 */
    xlAllDatesInPeriodQuarter2(54),    
    /**@ Filters for all dates in Quarter3 */
    xlAllDatesInPeriodQuarter3(55),    
    /**@ Filters for all dates in Quarter 4 */
    xlAllDatesInPeriodQuarter4(56),    
    /**@ Filters for the specified number of values from the bottom of a list */
    xlBottomCount(2),    
    /**@ Filters for the specified percentage of values from the bottom of a list */
    xlBottomPercent(4),    
    /**@ Sum of the values from the bottom of the list */
    xlBottomSum(6),    
    /**@ Filters for all captions beginning with the specified string */
    xlCaptionBeginsWith(17),    
    /**@ Filters for all captions that contain the specified string */
    xlCaptionContains(21),    
    /**@ Filters for all captions that don't begin with the specified string */
    xlCaptionDoesNotBeginWith(18),    
    /**@ Filters for all captions that don't contain the specified string */
    xlCaptionDoesNotContain(22),    
    /**@ Filters for all captions that don't end with the specified string */
    xlCaptionDoesNotEndWith(20),    
    /**@ Filters for all captions that don't match the specified string */
    xlCaptionDoesNotEqual(16),    
    /**@ Filters for all captions that end with the specified string */
    xlCaptionEndsWith(19),    
    /**@ Filters for all captions that match the specified string */
    xlCaptionEquals(15),    
    /**@ Filters for all captions that are between a specified range of values */
    xlCaptionIsBetween(27),    
    /**@ Filters for all captions that are greater than the specified value */
    xlCaptionIsGreaterThan(23),    
    /**@ Filters for all captions that are greater than or match the specified value */
    xlCaptionIsGreaterThanOrEqualTo(24),    
    /**@ Filters for all captions that are less than the specified value */
    xlCaptionIsLessThan(25),    
    /**@ Filters for all captions that are less than or match the specified value */
    xlCaptionIsLessThanOrEqualTo(26),    
    /**@ Filters for all captions that are not between a specified range of values */
    xlCaptionIsNotBetween(28),    
    /**@ Filters for all dates that are between a specified range of dates */
    xlDateBetween(35),    
    /**@ Filters for all dates that apply to the previous month */
    xlDateLastMonth(45),    
    /**@ Filters for all dates that apply to the previous quarter */
    xlDateLastQuarter(48),    
    /**@ Filters for all dates that apply to the previous week */
    xlDateLastWeek(42),    
    /**@ Filters for all dates that apply to the previous year */
    xlDateLastYear(51),    
    /**@ Filters for all dates that apply to the next month */
    xlDateNextMonth(43),    
    /**@ Filters for all dates that apply to the next quarter */
    xlDateNextQuarter(46),    
    /**@ Filters for all dates that apply to the next week */
    xlDateNextWeek(40),    
    /**@ Filters for all dates that apply to the next year */
    xlDateNextYear(49),    
    /**@ Filters for all dates that apply to the current month */
    xlDateThisMonth(44),    
    /**@ Filters for all dates that apply to the current quarter */
    xlDateThisQuarter(47),    
    /**@ Filters for all dates that apply to the current week */
    xlDateThisWeek(41),    
    /**@ Filters for all dates that apply to the current year */
    xlDateThisYear(50),    
    /**@ Filters for all dates that apply to the current date */
    xlDateToday(38),    
    /**@ Filters for all dates that apply to the next day */
    xlDateTomorrow(37),    
    /**@ Filters for all dates that apply to the previous day */
    xlDateYesterday(39),    
    /**@ Filters for all dates that don't match a specified date */
    xlNotSpecificDate(30),    
    /**@ Filters for all dates that match a specified date */
    xlSpecificDate(29),    
    /**@ Filters for the specified number of values from the top of a list */
    xlTopCount(1),    
    /**@ Filters for the specified percentage of values from a list */
    xlTopPercent(3),    
    /**@ Sum of the values from the top of the list */
    xlTopSum(5),    
    /**@ Filters for all values that don't match the specified value */
    xlValueDoesNotEqual(8),    
    /**@ Filters for all values that match the specified value */
    xlValueEquals(7),    
    /**@ Filters for all values that are between a specified range of values */
    xlValueIsBetween(13),    
    /**@ Filters for all values that are greater than the specified value */
    xlValueIsGreaterThan(9),    
    /**@ Filters for all values that are greater than or match the specified value */
    xlValueIsGreaterThanOrEqualTo(10),    
    /**@ Filters for all values that are less than the specified value */
    xlValueIsLessThan(11),    
    /**@ Filters for all values that are less than or match the specified value */
    xlValueIsLessThanOrEqualTo(12),    
    /**@ Filters for all values that are not between a specified range of values */
    xlValueIsNotBetween(14),    
    /**@ Filters for all values that are within one year of a specified date */
    xlYearToDate(52);

    private final long value;

    XlPivotFilterType(long value) {
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
