package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbfontscripttype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbfontscripttype</a>}
*/
public enum PbFontScriptType implements COMEnum {
    
    /**@ Arabic */
    pbFontScriptArabic(7),    
    /**@ Armenian */
    pbFontScriptArmenian(5),    
    /**@ Ascii Latin */
    pbFontScriptAsciiLatin(1),    
    /**@ Ascii Sym */
    pbFontScriptAsciiSym(43),    
    /**@ Bengali */
    pbFontScriptBengali(9),    
    /**@ Bopomofo */
    pbFontScriptBopomofo(23),    
    /**@ Braille */
    pbFontScriptBraille(41),    
    /**@ Canadian Abor */
    pbFontScriptCanadianAbor(36),    
    /**@ Cherokee */
    pbFontScriptCherokee(35),    
    /**@ Currency */
    pbFontScriptCurrency(42),    
    /**@ Cyrillic */
    pbFontScriptCyrillic(4),    
    /**@ Default */
    pbFontScriptDefault(0),    
    /**@ Devanagari */
    pbFontScriptDevanagari(8),    
    /**@ Ethiopic */
    pbFontScriptEthiopic(34),    
    /**@ EUDC */
    pbFontScriptEUDC(26),    
    /**@ Georgian */
    pbFontScriptGeorgian(20),    
    /**@ Greek */
    pbFontScriptGreek(3),    
    /**@ Gujarati */
    pbFontScriptGujarati(11),    
    /**@ Gurmukhi */
    pbFontScriptGurmukhi(10),    
    /**@ Half WidthKana */
    pbFontScriptHalfWidthKana(25),    
    /**@ Han */
    pbFontScriptHan(24),    
    /**@ Hangul */
    pbFontScriptHangul(21),    
    /**@ Han Surrogate */
    pbFontScriptHanSurrogate(28),    
    /**@ Hebrew */
    pbFontScriptHebrew(6),    
    /**@ Kana */
    pbFontScriptKana(22),    
    /**@ Kannada */
    pbFontScriptKannada(15),    
    /**@ Khmer */
    pbFontScriptKhmer(39),    
    /**@ Lao */
    pbFontScriptLao(18),    
    /**@ Latin */
    pbFontScriptLatin(2),    
    /**@ Malayalam */
    pbFontScriptMalayalam(16),    
    /**@ Mixed */
    pbFontScriptMixed(-2),    
    /**@ Mongolian */
    pbFontScriptMongolian(40),    
    /**@ Myanmar */
    pbFontScriptMyanmar(32),    
    /**@ Non-Han Surrogate */
    pbFontScriptNonHanSurrogate(29),    
    /**@ Ogham */
    pbFontScriptOgham(37),    
    /**@ Oriya */
    pbFontScriptOriya(12),    
    /**@ Runic */
    pbFontScriptRunic(38),    
    /**@ Sinhala */
    pbFontScriptSinhala(33),    
    /**@ Syriac */
    pbFontScriptSyriac(30),    
    /**@ Tamil */
    pbFontScriptTamil(13),    
    /**@ Telugu */
    pbFontScriptTelugu(14),    
    /**@ Thaana */
    pbFontScriptThaana(31),    
    /**@ Thai */
    pbFontScriptThai(17),    
    /**@ Tibetan */
    pbFontScriptTibetan(19),    
    /**@ Yi */
    pbFontScriptYi(27);

    private final long value;

    PbFontScriptType(long value) {
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
