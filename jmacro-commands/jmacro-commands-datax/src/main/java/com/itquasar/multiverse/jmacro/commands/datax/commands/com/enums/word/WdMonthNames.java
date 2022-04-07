package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmonthnames">https://docs.microsoft.com/en-us/office/vba/api/word.wdmonthnames</a>}
*/
public enum WdMonthNames implements COMEnum {
    
    /**@ Arabic format. */
    wdMonthNamesArabic(0),    
    /**@ English format. */
    wdMonthNamesEnglish(1),    
    /**@ French format. */
    wdMonthNamesFrench(2);

    private final long value;

    WdMonthNames(long value) {
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
