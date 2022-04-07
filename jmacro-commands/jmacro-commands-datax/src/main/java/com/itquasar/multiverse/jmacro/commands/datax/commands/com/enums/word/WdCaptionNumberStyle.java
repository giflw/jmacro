package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcaptionnumberstyle">https://docs.microsoft.com/en-us/office/vba/api/word.wdcaptionnumberstyle</a>}
*/
public enum WdCaptionNumberStyle implements COMEnum {
    
    /**@ Arabic style. */
    wdCaptionNumberStyleArabic(0),    
    /**@ Full-width Arabic style. */
    wdCaptionNumberStyleArabicFullWidth(14),    
    /**@ Arabic letter style 1. */
    wdCaptionNumberStyleArabicLetter1(46),    
    /**@ Arabic letter style 2. */
    wdCaptionNumberStyleArabicLetter2(48),    
    /**@ Chosung style. */
    wdCaptionNumberStyleChosung(25),    
    /**@ Ganada style. */
    wdCaptionNumberStyleGanada(24),    
    /**@ Hanja read style. */
    wdCaptionNumberStyleHanjaRead(41),    
    /**@ Hanja read digit style. */
    wdCaptionNumberStyleHanjaReadDigit(42),    
    /**@ Hebrew letter style 1. */
    wdCaptionNumberStyleHebrewLetter1(45),    
    /**@ Hebrew letter style 2. */
    wdCaptionNumberStyleHebrewLetter2(47),    
    /**@ Hindi Arabic style. */
    wdCaptionNumberStyleHindiArabic(51),    
    /**@ Hindi cardinal style. */
    wdCaptionNumberStyleHindiCardinalText(52),    
    /**@ Hindi letter style 1. */
    wdCaptionNumberStyleHindiLetter1(49),    
    /**@ Hindi letter style 2. */
    wdCaptionNumberStyleHindiLetter2(50),    
    /**@ Kanji style. */
    wdCaptionNumberStyleKanji(10),    
    /**@ Kanji digit style. */
    wdCaptionNumberStyleKanjiDigit(11),    
    /**@ Kanji traditional style. */
    wdCaptionNumberStyleKanjiTraditional(16),    
    /**@ Lowercase letter style. */
    wdCaptionNumberStyleLowercaseLetter(4),    
    /**@ Lowercase roman style. */
    wdCaptionNumberStyleLowercaseRoman(2),    
    /**@ Number in circle style. */
    wdCaptionNumberStyleNumberInCircle(18),    
    /**@ Simplified Chinese number style 2. */
    wdCaptionNumberStyleSimpChinNum2(38),    
    /**@ Simplified Chinese number style 3. */
    wdCaptionNumberStyleSimpChinNum3(39),    
    /**@ Thai Arabic style. */
    wdCaptionNumberStyleThaiArabic(54),    
    /**@ Thai cardinal text style. */
    wdCaptionNumberStyleThaiCardinalText(55),    
    /**@ Thai letter style. */
    wdCaptionNumberStyleThaiLetter(53),    
    /**@ Traditional Chinese number style 2. */
    wdCaptionNumberStyleTradChinNum2(34),    
    /**@ Traditional Chinese number style 3. */
    wdCaptionNumberStyleTradChinNum3(35),    
    /**@ Uppercase letter style. */
    wdCaptionNumberStyleUppercaseLetter(3),    
    /**@ Uppercase roman style. */
    wdCaptionNumberStyleUppercaseRoman(1),    
    /**@ Vietnamese cardinal text style. */
    wdCaptionNumberStyleVietCardinalText(56),    
    /**@ Zodiac style 1. */
    wdCaptionNumberStyleZodiac1(30),    
    /**@ Zodiac style 2. */
    wdCaptionNumberStyleZodiac2(31);

    private final long value;

    WdCaptionNumberStyle(long value) {
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
