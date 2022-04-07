package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpagenumberstyle">https://docs.microsoft.com/en-us/office/vba/api/word.wdpagenumberstyle</a>}
*/
public enum WdPageNumberStyle implements COMEnum {
    
    /**@ Arabic style. */
    wdPageNumberStyleArabic(0),    
    /**@ Arabic full width style. */
    wdPageNumberStyleArabicFullWidth(14),    
    /**@ Arabic letter 1 style. */
    wdPageNumberStyleArabicLetter1(46),    
    /**@ Arabic letter 2 style. */
    wdPageNumberStyleArabicLetter2(48),    
    /**@ Hanja Read style. */
    wdPageNumberStyleHanjaRead(41),    
    /**@ Hanja Read Digit style. */
    wdPageNumberStyleHanjaReadDigit(42),    
    /**@ Hebrew letter 1 style. */
    wdPageNumberStyleHebrewLetter1(45),    
    /**@ Hebrew letter 2 style. */
    wdPageNumberStyleHebrewLetter2(47),    
    /**@ Hindi Arabic style. */
    wdPageNumberStyleHindiArabic(51),    
    /**@ Hindi Cardinal text style. */
    wdPageNumberStyleHindiCardinalText(52),    
    /**@ Hindi letter 1 style. */
    wdPageNumberStyleHindiLetter1(49),    
    /**@ Hindi letter 2 style. */
    wdPageNumberStyleHindiLetter2(50),    
    /**@ Kanji style. */
    wdPageNumberStyleKanji(10),    
    /**@ Kanji Digit style. */
    wdPageNumberStyleKanjiDigit(11),    
    /**@ Kanji traditional style. */
    wdPageNumberStyleKanjiTraditional(16),    
    /**@ Lowercase letter style. */
    wdPageNumberStyleLowercaseLetter(4),    
    /**@ Lowercase Roman style. */
    wdPageNumberStyleLowercaseRoman(2),    
    /**@ Number in circle style. */
    wdPageNumberStyleNumberInCircle(18),    
    /**@ Number in dash style. */
    wdPageNumberStyleNumberInDash(57),    
    /**@ Simplified Chinese number 1 style. */
    wdPageNumberStyleSimpChinNum1(37),    
    /**@ Simplified Chinese number 2 style. */
    wdPageNumberStyleSimpChinNum2(38),    
    /**@ Thai Arabic style. */
    wdPageNumberStyleThaiArabic(54),    
    /**@ Thai Cardinal Text style. */
    wdPageNumberStyleThaiCardinalText(55),    
    /**@ Thai letter style. */
    wdPageNumberStyleThaiLetter(53),    
    /**@ Traditional Chinese number 1 style. */
    wdPageNumberStyleTradChinNum1(33),    
    /**@ Traditional Chinese number 2 style. */
    wdPageNumberStyleTradChinNum2(34),    
    /**@ Uppercase letter style. */
    wdPageNumberStyleUppercaseLetter(3),    
    /**@ Uppercase Roman style. */
    wdPageNumberStyleUppercaseRoman(1),    
    /**@ Vietnamese Cardinal text style. */
    wdPageNumberStyleVietCardinalText(56);

    private final long value;

    WdPageNumberStyle(long value) {
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
