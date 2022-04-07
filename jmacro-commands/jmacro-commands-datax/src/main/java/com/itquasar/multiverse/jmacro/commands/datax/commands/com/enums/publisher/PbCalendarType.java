package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcalendartype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcalendartype</a>}
*/
public enum PbCalendarType implements COMEnum {
    
    /**@ Arabic Hijri calendar */
    pbCalendarTypeArabicHijri(1),    
    /**@ Chinese National calendar */
    pbCalendarTypeChineseNational(3),    
    /**@ Hebrew Lunar calendar */
    pbCalendarTypeHebrewLunar(2),    
    /**@ Japanese Emperor calendar */
    pbCalendarTypeJapaneseEmperor(4),    
    /**@ Korean Danki calendar */
    pbCalendarTypeKoreanDanki(6),    
    /**@ Saka Era calendar */
    pbCalendarTypeSakaEra(7),    
    /**@ Thai Buddhist calendar */
    pbCalendarTypeThaiBuddhist(5),    
    /**@ English calendar */
    pbCalendarTypeTranslitEnglish(8),    
    /**@ French calendar */
    pbCalendarTypeTranslitFrench(9),    
    /**@ Western calendar */
    pbCalendarTypeWestern(0);

    private final long value;

    PbCalendarType(long value) {
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
