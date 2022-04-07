package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjautofiltertype">https://docs.microsoft.com/en-us/office/vba/api/project.pjautofiltertype</a>}
*/
public enum PjAutoFilterType implements COMEnum {
    
    /**@ Filter for items that are one day or shorter. */
    pjAutoFilter1DayOrLess(22),    
    /**@ Filter for items that are one week or longer. */
    pjAutoFilter1WeekOrLonger(24),    
    /**@ Filter for 40 hours or more. */
    pjAutoFilter40HoursOrMore(28),    
    /**@ Filter for items that are eight hours or less. */
    pjAutoFilter8HoursOrLess(26),    
    /**@ Filter for items that occur after the project status date. */
    pjAutoFilterAfterStatusDate(20),    
    /**@ Filter for items that occur before the project status date. */
    pjAutoFilterBeforeStatusDate(19),    
    /**@ Filter for items that begin with a specified value. */
    pjAutoFilterBeginsWith(45),    
    /**@ Filter for items that are between specified values. */
    pjAutoFilterBetween(44),    
    /**@ Filter for items between one day and one week. */
    pjAutoFilterBetween1DayAnd1Week(23),    
    /**@ Filter for items between eight hours and 40 hours. */
    pjAutoFilterBetween8And40Hours(27),    
    /**@ Clear the autofilter. */
    pjAutoFilterClear(0),    
    /**@ The autofilter is complete. */
    pjAutoFilterComplete(32),    
    /**@ Filter for values that contain a specified value. */
    pjAutoFilterContains(47),    
    /**@ Use a custom autofilter. */
    pjAutoFilterCustom(1),    
    /**@ Filter for items that end with a specified value. */
    pjAutoFilterEndsWith(46),    
    /**@ Filter for items that equal a specified value. */
    pjAutoFilterEquals(40),    
    /**@ Filter for items with a flag value of No. */
    pjAutoFilterFlagNo(39),    
    /**@ Filter for items with a flag value of Yes. */
    pjAutoFilterFlagYes(38),    
    /**@ Filter for items greater than a specified value. */
    pjAutoFilterGreaterThan(42),    
    /**@ Filter for items greater than zero cost. */
    pjAutoFilterGreaterThan0Cost(37),    
    /**@ Filter for items within a specified value. */
    pjAutoFilterIn(2),    
    /**@ Filter for items that are in progress. */
    pjAutoFilterInProgress(31),    
    /**@ Filter for items within the last month. */
    pjAutoFilterLastMonth(11),    
    /**@ Filter for items within the last quarter. */
    pjAutoFilterLastQuarter(14),    
    /**@ Filter for items within the last week. */
    pjAutoFilterLastWeek(8),    
    /**@ Filter for items within the last year. */
    pjAutoFilterLastYear(17),    
    /**@ Filter for items less than a specified value. */
    pjAutoFilterLessThan(43),    
    /**@ Filter for items within the next month. */
    pjAutoFilterNextMonth(9),    
    /**@ Filter for items within the next quarter. */
    pjAutoFilterNextQuarter(12),    
    /**@ Filter for items within the next week. */
    pjAutoFilterNextWeek(6),    
    /**@ Filter for items within the next year. */
    pjAutoFilterNextYear(15),    
    /**@ Filter for items that have no date. */
    pjAutoFilterNoDate(21),    
    /**@ Filter for items that have no duration. */
    pjAutoFilterNoDuration(25),    
    /**@ Filter for items that don't contain the specified value. */
    pjAutoFilterNotContains(48),    
    /**@ Filter for items that don't equal the specified value. */
    pjAutoFilterNotEquals(41),    
    /**@ Filter for items that are not started. */
    pjAutoFilterNotStarted(30),    
    /**@ Filter for items that contain no work. */
    pjAutoFilterNoWork(29),    
    /**@ Filter for items that have the base phonetic value. */
    pjAutoFilterPhonetic0(49),    
    /**@ Filter for items that have the first phonetic value. */
    pjAutoFilterPhonetic1(50),    
    /**@ Filter for items that have the tenth phonetic value. */
    pjAutoFilterPhonetic10(59),    
    /**@ Filter for items that have the second phonetic value. */
    pjAutoFilterPhonetic2(51),    
    /**@ Filter for items that have the third phonetic value. */
    pjAutoFilterPhonetic3(52),    
    /**@ Filter for items that have the fourth phonetic value. */
    pjAutoFilterPhonetic4(53),    
    /**@ Filter for items that have the fifth phonetic value. */
    pjAutoFilterPhonetic5(54),    
    /**@ Filter for items that have the sixth phonetic value. */
    pjAutoFilterPhonetic6(55),    
    /**@ Filter for items that have the seventh phonetic value. */
    pjAutoFilterPhonetic7(56),    
    /**@ Filter for items that have the eighth phonetic value. */
    pjAutoFilterPhonetic8(57),    
    /**@ Filter for items that have the ninth phonetic value. */
    pjAutoFilterPhonetic9(58),    
    /**@ Filter for items that occur this month. */
    pjAutoFilterThisMonth(10),    
    /**@ Filter for items that occur this quarter. */
    pjAutoFilterThisQuarter(13),    
    /**@ Filter for items that occur this week. */
    pjAutoFilterThisWeek(7),    
    /**@ Filter for items that occur this year. */
    pjAutoFilterThisYear(16),    
    /**@ Filter for items that occur today. */
    pjAutoFilterToday(3),    
    /**@ Filter for items that occur tomorrow. */
    pjAutoFilterTomorrow(4),    
    /**@ Filter for items that are within one percent and 25 percent. */
    pjAutoFilterWithin1And25Percent(33),    
    /**@ Filter for items that are within 26 percent and 50 percent. */
    pjAutoFilterWithin26And50Percent(34),    
    /**@ Filter for items that are within 51 percent and 75 percent. */
    pjAutoFilterWithin51And75Percent(35),    
    /**@ Filter for items that are within 76 percent and 100 percent. */
    pjAutoFilterWithin76And100Percent(36),    
    /**@ Filter for items that occur within the year to date. */
    pjAutoFilterYearToDate(18),    
    /**@ Filter for items that occur yesterday. */
    pjAutoFilterYesterday(5);

    private final long value;

    PjAutoFilterType(long value) {
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
