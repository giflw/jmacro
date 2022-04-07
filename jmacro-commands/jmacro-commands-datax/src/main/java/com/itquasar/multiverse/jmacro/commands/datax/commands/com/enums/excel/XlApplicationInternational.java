package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlapplicationinternational">https://docs.microsoft.com/en-us/office/vba/api/excel.xlapplicationinternational</a>}
*/
public enum XlApplicationInternational implements COMEnum {
    
    /**@ True if you are using 24-hour time; False if you are using 12-hour time. */
    xl24HourClock(33),    
    /**@ True if you are using four-digit years; False if you are using two-digit years. */
    xl4DigitYears(43),    
    /**@ Alternate array item separator to be used if the current array separator is the same as the decimal separator. */
    xlAlternateArraySeparator(16),    
    /**@ Character used to separate columns in array literals. */
    xlColumnSeparator(14),    
    /**@ Country/Region version of Microsoft Excel. */
    xlCountryCode(1),    
    /**@ Current country/region setting in the Windows Control Panel. */
    xlCountrySetting(2),    
    /**@ True if the currency symbol precedes the currency values; False if it follows them. */
    xlCurrencyBefore(37),    
    /**@ Currency symbol. */
    xlCurrencyCode(25),    
    /**@ Number of decimal digits to be used in currency formats. */
    xlCurrencyDigits(27),    
    /**@ True if leading zeros are displayed for zero currency values. */
    xlCurrencyLeadingZeros(40),    
    /**@ True if you are using a minus sign for negative numbers; False if you are using parentheses. */
    xlCurrencyMinusSign(38),    
    /**@ Currency format for negative currency values: 0 = (symbolx) or (xsymbol), 1 = -symbolx or -xsymbol, 2 = symbol-x or x-symbol, or 3 = symbolx- or xsymbol-, where symbol is the currency symbol of the country or region. Note that the position of the currency symbol is determined by xlCurrencyBefore. */
    xlCurrencyNegative(28),    
    /**@ True if a space is added before the currency symbol. */
    xlCurrencySpaceBefore(36),    
    /**@ True if trailing zeros are displayed for zero currency values. */
    xlCurrencyTrailingZeros(39),    
    /**@ Order of date elements: 0 = month-day-year, 1 = day-month-year, 2 = year-month-day */
    xlDateOrder(32),    
    /**@ Date separator (/). */
    xlDateSeparator(17),    
    /**@ Day symbol (d). */
    xlDayCode(21),    
    /**@ True if a leading zero is displayed in days. */
    xlDayLeadingZero(42),    
    /**@ Decimal separator. */
    xlDecimalSeparator(3),    
    /**@ Name of the General number format. */
    xlGeneralFormatName(26),    
    /**@ Hour symbol (h). */
    xlHourCode(22),    
    /**@ Character used instead of the left brace ({) in array literals. */
    xlLeftBrace(12),    
    /**@ Character used instead of the left bracket ([) in R1C1-style relative references. */
    xlLeftBracket(10),    
    /**@ List separator. */
    xlListSeparator(5),    
    /**@ Lowercase column letter. */
    xlLowerCaseColumnLetter(9),    
    /**@ Lowercase row letter. */
    xlLowerCaseRowLetter(8),    
    /**@ True if the date order is month-day-year for dates displayed in the long form; False if the date order is day-month-year. */
    xlMDY(44),    
    /**@ True if you are using the metric system; False if you are using the English measurement system. */
    xlMetric(35),    
    /**@ Minute symbol (m). */
    xlMinuteCode(23),    
    /**@ Month symbol (m). */
    xlMonthCode(20),    
    /**@ True if a leading zero is displayed in months (when months are displayed as numbers). */
    xlMonthLeadingZero(41),    
    /**@ Always returns three characters for backward compatibility. Abbreviated month names are read from Microsoft Windows and can be any length. */
    xlMonthNameChars(30),    
    /**@ Number of decimal digits to be used in noncurrency formats. */
    xlNoncurrencyDigits(29),    
    /**@ True if you are not displaying functions in English. */
    xlNonEnglishFunctions(34),    
    /**@ Character used instead of the right brace (}) in array literals. */
    xlRightBrace(13),    
    /**@ Character used instead of the right bracket (]) in R1C1-style references. */
    xlRightBracket(11),    
    /**@ Character used to separate rows in array literals. */
    xlRowSeparator(15),    
    /**@ Second symbol (s). */
    xlSecondCode(24),    
    /**@ Zero or thousands separator. */
    xlThousandsSeparator(4),    
    /**@ True if a leading zero is displayed in times. */
    xlTimeLeadingZero(45),    
    /**@ Time separator (:). */
    xlTimeSeparator(18),    
    /**@ Uppercase column letter. */
    xlUpperCaseColumnLetter(7),    
    /**@ Uppercase row letter (for R1C1-style references). */
    xlUpperCaseRowLetter(6),    
    /**@ Always returns three characters for backward compatibility. Abbreviated weekday names are read from Microsoft Windows and can be any length. */
    xlWeekdayNameChars(31),    
    /**@ Year symbol in number formats (y). */
    xlYearCode(19);

    private final long value;

    XlApplicationInternational(long value) {
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
