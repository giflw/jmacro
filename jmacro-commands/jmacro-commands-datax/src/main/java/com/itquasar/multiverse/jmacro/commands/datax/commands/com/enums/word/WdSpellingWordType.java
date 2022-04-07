package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdspellingwordtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdspellingwordtype</a>}
*/
public enum WdSpellingWordType implements COMEnum {
    
    /**@ Anagram searching. */
    wdAnagram(2),    
    /**@ Spellword searching. */
    wdSpellword(0),    
    /**@ Wildcard searching. */
    wdWildcard(1);

    private final long value;

    WdSpellingWordType(long value) {
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
