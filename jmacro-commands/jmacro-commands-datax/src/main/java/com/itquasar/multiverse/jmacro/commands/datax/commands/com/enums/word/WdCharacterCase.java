package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcharactercase">https://docs.microsoft.com/en-us/office/vba/api/word.wdcharactercase</a>}
*/
public enum WdCharacterCase implements COMEnum {
    
    /**@ Full-width. Used for Japanese characters. */
    wdFullWidth(7),    
    /**@ Half-width. Used for Japanese characters. */
    wdHalfWidth(6),    
    /**@ Hiragana characters. Used with Japanese text. */
    wdHiragana(9),    
    /**@ Katakana characters. Used with Japanese text. */
    wdKatakana(8),    
    /**@ Lowercase. */
    wdLowerCase(0),    
    /**@ Toggles between uppercase, lowercase, and sentence case. */
    wdNextCase(-1),    
    /**@ Sentence case. */
    wdTitleSentence(4),    
    /**@ Title word case. */
    wdTitleWord(2),    
    /**@ Switches uppercase characters to lowercase, and lowercase characters to uppercase. */
    wdToggleCase(5),    
    /**@ Uppercase. */
    wdUpperCase(1);

    private final long value;

    WdCharacterCase(long value) {
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
