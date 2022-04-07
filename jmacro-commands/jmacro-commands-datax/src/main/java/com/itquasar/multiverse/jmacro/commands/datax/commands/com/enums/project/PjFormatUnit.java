package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjformatunit">https://docs.microsoft.com/en-us/office/vba/api/project.pjformatunit</a>}
*/
public enum PjFormatUnit implements COMEnum {
    
    /**@ Days. */
    pjDays(7),    
    /**@ Estimated days. */
    pjDaysEstimated(39),    
    /**@ Elapsed days. */
    pjElapsedDays(8),    
    /**@ Elapsed days estimated. */
    pjElapsedDaysEstimated(40),    
    /**@ Elapsed hours. */
    pjElapsedHours(6),    
    /**@ Elapsed hours estimated. */
    pjElapsedHoursEstimated(38),    
    /**@ Elapsed minutes. */
    pjElapsedMinutes(4),    
    /**@ Elapsed minutes estimated. */
    pjElapsedMinutesEstimated(36),    
    /**@ Elapsed months. */
    pjElapsedMonths(12),    
    /**@ Elapsed months estimated. */
    pjElapsedMonthsEstimated(44),    
    /**@ Elapsed weeks. */
    pjElapsedWeeks(10),    
    /**@ Elapsed weeks estimated. */
    pjElapsedWeeksEstimated(42),    
    /**@ Hours. */
    pjHours(5),    
    /**@ Estimated hours. */
    pjHoursEstimated(37),    
    /**@ Minutes. */
    pjMinutes(3),    
    /**@ Estimated minutes. */
    pjMinutesEstimated(35),    
    /**@ Months. */
    pjMonths(11),    
    /**@ Estimated months. */
    pjMonthsEstimated(43),    
    /**@ Weeks. */
    pjWeeks(9),    
    /**@ Estimated weeks. */
    pjWeeksEstimated(41);

    private final long value;

    PjFormatUnit(long value) {
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
