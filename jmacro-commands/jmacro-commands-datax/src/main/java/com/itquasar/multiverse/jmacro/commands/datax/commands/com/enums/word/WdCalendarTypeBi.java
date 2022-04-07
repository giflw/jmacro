package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcalendartypebi">https://docs.microsoft.com/en-us/office/vba/api/word.wdcalendartypebi</a>}
*/
public enum WdCalendarTypeBi implements COMEnum {
    
    /**@ Bi-directional calendar. */
    wdCalendarTypeBidi(99),    
    /**@ Gregorian calendar. */
    wdCalendarTypeGregorian(100);

    private final long value;

    WdCalendarTypeBi(long value) {
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
