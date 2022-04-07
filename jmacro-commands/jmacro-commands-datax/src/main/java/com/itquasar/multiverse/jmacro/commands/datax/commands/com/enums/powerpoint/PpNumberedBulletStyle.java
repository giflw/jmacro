package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppnumberedbulletstyle">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppnumberedbulletstyle</a>}
*/
public enum PpNumberedBulletStyle implements COMEnum {
    
    /**@ Lowercase alphabetical characters with both parentheses. */
    ppBulletAlphaLCParenBoth(8),    
    /**@ Lowercase alphabetical characters with closing parenthesis. */
    ppBulletAlphaLCParenRight(9),    
    /**@ Lowercase alphabetical characters with a period. */
    ppBulletAlphaLCPeriod(0),    
    /**@ Uppercase alphabetical characters with both parentheses. */
    ppBulletAlphaUCParenBoth(10),    
    /**@ Uppercase alphabetical characters with closing parenthesis. */
    ppBulletAlphaUCParenRight(11),    
    /**@ Uppercase alphabetical characters with a period. */
    ppBulletAlphaUCPeriod(1),    
    /**@ Arabic Abjad alphabets with a dash. */
    ppBulletArabicAbjadDash(24),    
    /**@ Arabic language alphabetical characters with a dash. */
    ppBulletArabicAlphaDash(23),    
    /**@ Double-byte Arabic numbering scheme with double-byte period. */
    ppBulletArabicDBPeriod(29),    
    /**@ Double-byte Arabic numbering scheme (no punctuation). */
    ppBulletArabicDBPlain(28),    
    /**@ Arabic numerals with both parentheses. */
    ppBulletArabicParenBoth(12),    
    /**@ Arabic numerals with closing parenthesis. */
    ppBulletArabicParenRight(2),    
    /**@ Arabic numerals with a period. */
    ppBulletArabicPeriod(3),    
    /**@ Arabic numerals. */
    ppBulletArabicPlain(13),    
    /**@ Double-byte circled number for values up to 10. */
    ppBulletCircleNumDBPlain(18),    
    /**@ Shadow color number with circular background of normal text color. */
    ppBulletCircleNumWDBlackPlain(20),    
    /**@ Text colored number with same color circle drawn around it. */
    ppBulletCircleNumWDWhitePlain(19),    
    /**@ Hebrew language alphabetical characters with a dash. */
    ppBulletHebrewAlphaDash(25),    
    /**@ Hindi Alpha1 period. */
    ppBulletHindiAlpha1Period(40),    
    /**@ Hindi Alpha period. */
    ppBulletHindiAlphaPeriod(36),    
    /**@ Hindi Num Paren right. */
    ppBulletHindiNumParenRight(39),    
    /**@ Hindi Num period. */
    ppBulletHindiNumPeriod(37),    
    /**@ Japanese/Korean numbers with a period. */
    ppBulletKanjiKoreanPeriod(27),    
    /**@ Japanese/Korean numbers without a period. */
    ppBulletKanjiKoreanPlain(26),    
    /**@ Kanji Simple Chinese DBPeriod */
    ppBulletKanjiSimpChinDBPeriod(38),    
    /**@ Lowercase Roman numerals with both parentheses. */
    ppBulletRomanLCParenBoth(4),    
    /**@ Lowercase Roman numerals with closing parenthesis. */
    ppBulletRomanLCParenRight(5),    
    /**@ Lowercase Roman numerals with period. */
    ppBulletRomanLCPeriod(6),    
    /**@ Uppercase Roman numerals with both parentheses. */
    ppBulletRomanUCParenBoth(14),    
    /**@ Uppercase Roman numerals with closing parenthesis. */
    ppBulletRomanUCParenRight(15),    
    /**@ Uppercase Roman numerals with period. */
    ppBulletRomanUCPeriod(7),    
    /**@ Simplified Chinese with a period. */
    ppBulletSimpChinPeriod(17),    
    /**@ Simplified Chinese without a period. */
    ppBulletSimpChinPlain(16),    
    /**@ Any undefined style. */
    ppBulletStyleMixed(-2),    
    /**@ Thai Alpha Paren both. */
    ppBulletThaiAlphaParenBoth(32),    
    /**@ Thai Alpha Paren right. */
    ppBulletThaiAlphaParenRight(31),    
    /**@ Thai Alpha period. */
    ppBulletThaiAlphaPeriod(30),    
    /**@ Thai Num Paren both. */
    ppBulletThaiNumParenBoth(35),    
    /**@ Thai Num Paren right. */
    ppBulletThaiNumParenRight(34),    
    /**@ Thai Num period. */
    ppBulletThaiNumPeriod(33),    
    /**@ Traditional Chinese with a period. */
    ppBulletTradChinPeriod(22),    
    /**@ Traditional Chinese without a period. */
    ppBulletTradChinPlain(21);

    private final long value;

    PpNumberedBulletStyle(long value) {
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
