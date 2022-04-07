package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddictionarytype">https://docs.microsoft.com/en-us/office/vba/api/word.wddictionarytype</a>}
*/
public enum WdDictionaryType implements COMEnum {
    
    /**@ Grammar. */
    wdGrammar(1),    
    /**@ Dictionary for converting between Hangul and Hanja. Available only if you have enabled support for Korean through Microsoft Office Language Settings. */
    wdHangulHanjaConversion(8),    
    /**@ Custom dictionary for converting between Hangul and Hanja. */
    wdHangulHanjaConversionCustom(9),    
    /**@ Hyphenation. */
    wdHyphenation(3),    
    /**@ Spelling. */
    wdSpelling(0),    
    /**@ Not supported. */
    wdSpellingComplete(4),    
    /**@ Custom spelling dictionary. */
    wdSpellingCustom(5),    
    /**@ Legal dictionary. */
    wdSpellingLegal(6),    
    /**@ Medical dictionary. */
    wdSpellingMedical(7),    
    /**@ Thesaurus. */
    wdThesaurus(2);

    private final long value;

    WdDictionaryType(long value) {
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
