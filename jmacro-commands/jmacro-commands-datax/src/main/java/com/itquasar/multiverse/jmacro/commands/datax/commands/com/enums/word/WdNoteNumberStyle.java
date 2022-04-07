package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdnotenumberstyle">https://docs.microsoft.com/en-us/office/vba/api/word.wdnotenumberstyle</a>}
*/
public enum WdNoteNumberStyle implements COMEnum {
    
    /**@ Arabic number style. */
    wdNoteNumberStyleArabic(0),    
    /**@ Arabic full-width number style. */
    wdNoteNumberStyleArabicFullWidth(14),    
    /**@ Arabic letter style 1. */
    wdNoteNumberStyleArabicLetter1(46),    
    /**@ Arabic letter style 2. */
    wdNoteNumberStyleArabicLetter2(48),    
    /**@ Hanja read number style. */
    wdNoteNumberStyleHanjaRead(41),    
    /**@ Hanja read digit number style. */
    wdNoteNumberStyleHanjaReadDigit(42),    
    /**@ Hebrew letter style 1. */
    wdNoteNumberStyleHebrewLetter1(45),    
    /**@ Hebrew letter style 2. */
    wdNoteNumberStyleHebrewLetter2(47),    
    /**@ Hindi Arabic number style. */
    wdNoteNumberStyleHindiArabic(51),    
    /**@ Hindi Cardinal text style. */
    wdNoteNumberStyleHindiCardinalText(52),    
    /**@ Hindi letter style 1. */
    wdNoteNumberStyleHindiLetter1(49),    
    /**@ Hindi letter style 2. */
    wdNoteNumberStyleHindiLetter2(50),    
    /**@ Kanji number style. */
    wdNoteNumberStyleKanji(10),    
    /**@ Kanji digit number style. */
    wdNoteNumberStyleKanjiDigit(11),    
    /**@ Kanji traditional number style. */
    wdNoteNumberStyleKanjiTraditional(16),    
    /**@ Lowercase letter style. */
    wdNoteNumberStyleLowercaseLetter(4),    
    /**@ Lowercase Roman number style. */
    wdNoteNumberStyleLowercaseRoman(2),    
    /**@ Number in circle number style. */
    wdNoteNumberStyleNumberInCircle(18),    
    /**@ Simplified Chinese number style 1. */
    wdNoteNumberStyleSimpChinNum1(37),    
    /**@ Simplified Chinese number style 2. */
    wdNoteNumberStyleSimpChinNum2(38),    
    /**@ Symbol number style. */
    wdNoteNumberStyleSymbol(9),    
    /**@ Thai Arabic number style. */
    wdNoteNumberStyleThaiArabic(54),    
    /**@ Thai Cardinal text style. */
    wdNoteNumberStyleThaiCardinalText(55),    
    /**@ Thai letter style. */
    wdNoteNumberStyleThaiLetter(53),    
    /**@ Traditional Chinese number style 1. */
    wdNoteNumberStyleTradChinNum1(33),    
    /**@ Traditional Chinese number style 2. */
    wdNoteNumberStyleTradChinNum2(34),    
    /**@ Uppercase letter style. */
    wdNoteNumberStyleUppercaseLetter(3),    
    /**@ Uppercase Roman number style. */
    wdNoteNumberStyleUppercaseRoman(1),    
    /**@ Vietnamese Cardinal text style. */
    wdNoteNumberStyleVietCardinalText(56);

    private final long value;

    WdNoteNumberStyle(long value) {
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
