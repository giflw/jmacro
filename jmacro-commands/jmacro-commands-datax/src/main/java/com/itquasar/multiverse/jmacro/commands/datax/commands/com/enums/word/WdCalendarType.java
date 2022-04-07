package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcalendartype">https://docs.microsoft.com/en-us/office/vba/api/word.wdcalendartype</a>}
*/
public enum WdCalendarType implements COMEnum {
    
    /**@ Arabic Hijri calendar. */
    wdCalendarArabic(1),    
    /**@ Hebrew Lunar calendar. */
    wdCalendarHebrew(2),    
    /**@ Japanese Emperor Era calendar. */
    wdCalendarJapan(4),    
    /**@ Korean Danki calendar. */
    wdCalendarKorean(6),    
    /**@ Saka Era calendar. */
    wdCalendarSakaEra(7),    
    /**@ Taiwan calendar. */
    wdCalendarTaiwan(3),    
    /**@ Thai calendar. */
    wdCalendarThai(5),    
    /**@ English transliterated. Gregorian calendar with English month and day names transliterated to the Arabic script. Unsupported. */
    wdCalendarTranslitEnglish(8),    
    /**@ French transliterated. Gregorian calendar with French month and day names transliterated to the Arabic script. Unsupported. */
    wdCalendarTranslitFrench(9),    
    /**@ Um-al-Qura calendar. */
    wdCalendarUmalqura(13),    
    /**@ Western. Corresponds to the Gregorian calendar. */
    wdCalendarWestern(0);

    private final long value;

    WdCalendarType(long value) {
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
