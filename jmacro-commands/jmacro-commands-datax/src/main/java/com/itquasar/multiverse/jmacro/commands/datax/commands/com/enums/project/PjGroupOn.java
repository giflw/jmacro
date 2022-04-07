package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjgroupon">https://docs.microsoft.com/en-us/office/vba/api/project.pjgroupon</a>}
*/
public enum PjGroupOn implements COMEnum {
    
    /**@ Group on date by day. */
    pjGroupOnDateDay(13),    
    /**@ Group on date for each value. */
    pjDateEachValue(10),    
    /**@ Group on date by hour. */
    pjGroupOnDateHour(12),    
    /**@ Group on date by minute. */
    pjGroupOnDateMinute(11),    
    /**@ Group on date by month. */
    pjGroupOnDateMonth(16),    
    /**@ Group on date by quarter. */
    pjGroupOnDateQtr(17),    
    /**@ Group on date by each third of a month. */
    pjGroupOnDateThirdOfMonth(15),    
    /**@ Group on date by week. */
    pjGroupOnDateWeek(14),    
    /**@ Group on date by year. */
    pjGroupOnDateYear(18),    
    /**@ Group on duration by days. */
    pjGroupOnDurationDays(23),    
    /**@ Group on duration for each value. */
    pjGroupOnDurationEachValue(20),    
    /**@ Group on duration by hours. */
    pjGroupOnDurationHours(22),    
    /**@ Group on duration by minutes */
    pjGroupOnDurationMinutes(21),    
    /**@ Group on duration by months. */
    pjGroupOnDurationMonths(25),    
    /**@ Group on duration by weeks. */
    pjGroupOnDurationWeeks(24),    
    /**@ Group by each value. */
    pjGroupOnEachValue(0),    
    /**@ Group by the interval. */
    pjGroupOnInterval(1),    
    /**@ Group on each outline value. */
    pjGroupOnOutlineEachValue(30),    
    /**@ Group on the outline level. */
    pjGroupOnOutlineLevel(31),    
    /**@ Group by 10 percent completion increments. */
    pjGroupOnPct1_10(45),    
    /**@ Group by 25 percent completionincrements. */
    pjGroupOnPct1_25(44),    
    /**@ Group by 50 percent completion increments. */
    pjGroupOnPct1_50(43),    
    /**@ Group by 99 percent completion. */
    pjGroupOnPct1_99(42),    
    /**@ Group on percent of each value. */
    pjGroupOnPctEachValue(40),    
    /**@ Group on the interval percent. */
    pjGroupOnPctInterval(41),    
    /**@ Group on each text value. */
    pjGroupOnTextEachValue(50),    
    /**@ Group on the text prefix. */
    pjGroupOnTextPrefix(51);

    private final long value;

    PjGroupOn(long value) {
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
