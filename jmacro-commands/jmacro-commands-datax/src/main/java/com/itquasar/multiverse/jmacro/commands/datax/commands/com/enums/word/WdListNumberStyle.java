package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlistnumberstyle">https://docs.microsoft.com/en-us/office/vba/api/word.wdlistnumberstyle</a>}
*/
public enum WdListNumberStyle implements COMEnum {
    
    /**@ Aiueo numeric style. */
    wdListNumberStyleAiueo(20),    
    /**@ Aiueo half-width numeric style. */
    wdListNumberStyleAiueoHalfWidth(12),    
    /**@ Arabic numeric style. */
    wdListNumberStyleArabic(0),    
    /**@ Arabic 1 numeric style. */
    wdListNumberStyleArabic1(46),    
    /**@ Arabic 2 numeric style. */
    wdListNumberStyleArabic2(48),    
    /**@ Arabic full-width numeric style. */
    wdListNumberStyleArabicFullWidth(14),    
    /**@ Arabic LZ numeric style. */
    wdListNumberStyleArabicLZ(22),    
    /**@ Arabic LZ2 numeric style. */
    wdListNumberStyleArabicLZ2(62),    
    /**@ Arabic LZ3 numeric style. */
    wdListNumberStyleArabicLZ3(63),    
    /**@ Arabic LZ4 numeric style. */
    wdListNumberStyleArabicLZ4(64),    
    /**@ Bullet style. */
    wdListNumberStyleBullet(23),    
    /**@ Cardinal text style. */
    wdListNumberStyleCardinalText(6),    
    /**@ Chosung style. */
    wdListNumberStyleChosung(25),    
    /**@ Ganada style. */
    wdListNumberStyleGanada(24),    
    /**@ GB numeric 1 style. */
    wdListNumberStyleGBNum1(26),    
    /**@ GB numeric 2 style. */
    wdListNumberStyleGBNum2(27),    
    /**@ GB numeric 3 style. */
    wdListNumberStyleGBNum3(28),    
    /**@ GB numeric 4 style. */
    wdListNumberStyleGBNum4(29),    
    /**@ Hanqul style. */
    wdListNumberStyleHangul(43),    
    /**@ Hanja style. */
    wdListNumberStyleHanja(44),    
    /**@ Hanja Read style. */
    wdListNumberStyleHanjaRead(41),    
    /**@ Hanja Read Digit style. */
    wdListNumberStyleHanjaReadDigit(42),    
    /**@ Hebrew 1 style. */
    wdListNumberStyleHebrew1(45),    
    /**@ Hebrew 2 style. */
    wdListNumberStyleHebrew2(47),    
    /**@ Hindi Arabic style. */
    wdListNumberStyleHindiArabic(51),    
    /**@ Hindi Cardinal text style. */
    wdListNumberStyleHindiCardinalText(52),    
    /**@ Hindi letter 1 style. */
    wdListNumberStyleHindiLetter1(49),    
    /**@ Hindi letter 2 style. */
    wdListNumberStyleHindiLetter2(50),    
    /**@ Iroha style. */
    wdListNumberStyleIroha(21),    
    /**@ Iroha half width style. */
    wdListNumberStyleIrohaHalfWidth(13),    
    /**@ Kanji style. */
    wdListNumberStyleKanji(10),    
    /**@ Kanji Digit style. */
    wdListNumberStyleKanjiDigit(11),    
    /**@ Kanji traditional style. */
    wdListNumberStyleKanjiTraditional(16),    
    /**@ Kanji traditional 2 style. */
    wdListNumberStyleKanjiTraditional2(17),    
    /**@ Legal style. */
    wdListNumberStyleLegal(253),    
    /**@ Legal LZ style. */
    wdListNumberStyleLegalLZ(254),    
    /**@ Lowercase Bulgarian style. */
    wdListNumberStyleLowercaseBulgarian(67),    
    /**@ Lowercase Greek style. */
    wdListNumberStyleLowercaseGreek(60),    
    /**@ Lowercase letter style. */
    wdListNumberStyleLowercaseLetter(4),    
    /**@ Lowercase Roman style. */
    wdListNumberStyleLowercaseRoman(2),    
    /**@ Lowercase Russian style. */
    wdListNumberStyleLowercaseRussian(58),    
    /**@ Lowercase Turkish style. */
    wdListNumberStyleLowercaseTurkish(65),    
    /**@ No style applied. */
    wdListNumberStyleNone(255),    
    /**@ Number in circle style. */
    wdListNumberStyleNumberInCircle(18),    
    /**@ Ordinal style. */
    wdListNumberStyleOrdinal(5),    
    /**@ Ordinal text style. */
    wdListNumberStyleOrdinalText(7),    
    /**@ Picture bullet style. */
    wdListNumberStylePictureBullet(249),    
    /**@ Simplified Chinese numeric 1 style. */
    wdListNumberStyleSimpChinNum1(37),    
    /**@ Simplified Chinese numeric 2 style. */
    wdListNumberStyleSimpChinNum2(38),    
    /**@ Simplified Chinese numeric 3 style. */
    wdListNumberStyleSimpChinNum3(39),    
    /**@ Simplified Chinese numeric 4 style. */
    wdListNumberStyleSimpChinNum4(40),    
    /**@ Thai Arabic style. */
    wdListNumberStyleThaiArabic(54),    
    /**@ Thai Cardinal text style. */
    wdListNumberStyleThaiCardinalText(55),    
    /**@ Thai letter style. */
    wdListNumberStyleThaiLetter(53),    
    /**@ Traditional Chinese numeric 1 style. */
    wdListNumberStyleTradChinNum1(33),    
    /**@ Traditional Chinese numeric 2 style. */
    wdListNumberStyleTradChinNum2(34),    
    /**@ Traditional Chinese numeric 3 style. */
    wdListNumberStyleTradChinNum3(35),    
    /**@ Traditional Chinese numeric 4 style. */
    wdListNumberStyleTradChinNum4(36),    
    /**@ Uppercase Bulgarian style. */
    wdListNumberStyleUppercaseBulgarian(68),    
    /**@ Uppercase Greek style. */
    wdListNumberStyleUppercaseGreek(61),    
    /**@ Uppercase letter style. */
    wdListNumberStyleUppercaseLetter(3),    
    /**@ Uppercase Roman style. */
    wdListNumberStyleUppercaseRoman(1),    
    /**@ Uppercase Russian style. */
    wdListNumberStyleUppercaseRussian(59),    
    /**@ Uppercase Turkish style. */
    wdListNumberStyleUppercaseTurkish(66),    
    /**@ Vietnamese Cardinal text style. */
    wdListNumberStyleVietCardinalText(56),    
    /**@ Zodiac 1 style. */
    wdListNumberStyleZodiac1(30),    
    /**@ Zodiac 2 style. */
    wdListNumberStyleZodiac2(31),    
    /**@ Zodiac 3 style. */
    wdListNumberStyleZodiac3(32);

    private final long value;

    WdListNumberStyle(long value) {
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
