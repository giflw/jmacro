package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdinternationalindex">https://docs.microsoft.com/en-us/office/vba/api/word.wdinternationalindex</a>}
*/
public enum WdInternationalIndex implements COMEnum {
    
    /**@ Returns True if you are using 24-hour time; returns False if you are using 12-hour time. */
    wd24HourClock(21),    
    /**@ Returns the currency symbol ($ in U.S. English). */
    wdCurrencyCode(20),    
    /**@ Returns the date separator (/ in U.S. English). */
    wdDateSeparator(25),    
    /**@ Returns the decimal separator (. in U.S. English). */
    wdDecimalSeparator(18),    
    /**@ Returns the string used to indicate morning hours (for example, 10 A.M). */
    wdInternationalAM(22),    
    /**@ Returns the string used to indicate afternoon and evening hours (for example, 2 P.M). */
    wdInternationalPM(23),    
    /**@ Returns the list separator (, in U.S. English). */
    wdListSeparator(17),    
    /**@ Returns the language version of Word. */
    wdProductLanguageID(26),    
    /**@ Returns the thousands separator (, in U.S. English). */
    wdThousandsSeparator(19),    
    /**@ Returns the time separator (: in U.S. English). */
    wdTimeSeparator(24);

    private final long value;

    WdInternationalIndex(long value) {
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
