package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatdatetime">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatdatetime</a>}
*/
public enum OlFormatDateTime implements COMEnum {
    
    /**@ Displays the date/time value using the best fit for the data contained in the column. */
    olFormatDateTimeBestFit(17),    
    /**@ Displays a long date, without the day name, according to your locale's format. */
    olFormatDateTimeLongDate(6),    
    /**@ Displays a long date, reversing the day number and month name, according to your locale's format. */
    olFormatDateTimeLongDateReversed(7),    
    /**@ Displays a long date, with the day name, according to your locale's format. */
    OlFormatDateTimeLongDayDate(5),    
    /**@ Displays a long date and long time according to your locale's format. */
    olFormatDateTimeLongDayDateTime(1),    
    /**@ Displays a long time according to your locale's format. */
    olFormatDateTimeLongTime(15),    
    /**@ Displays a short date according to your locale's format. */
    olFormatDateTimeShortDate(8),    
    /**@ Displays a short date, using numeric representations of the day, month, and year, according to your locale's format. */
    olFormatDateTimeShortDateNumOnly(9),    
    /**@ Displays a short date and short time according to your locale's format. */
    olFormatDateTimeShortDateTime(2),    
    /**@ Displays a short date, with the day abbreviation, according to your locale's format. */
    olFormatDateTimeShortDayDate(13),    
    /**@ Displays a day abbreviation, short date, and short time according to your locale's format. */
    olFormatDateTimeShortDayDateTime(3),    
    /**@ Displays the month and the day of a date, with the day abbreviation, according to your locale's format. */
    olFormatDateTimeShortDayMonth(10),    
    /**@ Displays a day abbreviation, day number, month number, and short time according to your locale's format. */
    olFormatDateTimeShortDayMonthDateTime(4),    
    /**@ Displays the month and year of a date, according to your locale's format. */
    olFormatDateTimeShortMonthYear(11),    
    /**@ Displays the month and year of a date, using numeric representations of the month and year, according to your locale's format. */
    olFormatDateTimeShortMonthYearNumOnly(12),    
    /**@ Displays a short time according to your locale's format. */
    olFormatDateTimeShortTime(16);

    private final long value;

    OlFormatDateTime(long value) {
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
