package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdspellingerrortype">https://docs.microsoft.com/en-us/office/vba/api/word.wdspellingerrortype</a>}
*/
public enum WdSpellingErrorType implements COMEnum {
    
    /**@ Capitalization error. */
    wdSpellingCapitalization(2),    
    /**@ Spelling is correct. */
    wdSpellingCorrect(0),    
    /**@ The word is not in the specified dictionary. */
    wdSpellingNotInDictionary(1);

    private final long value;

    WdSpellingErrorType(long value) {
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
