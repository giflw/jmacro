package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdproofreadingerrortype">https://docs.microsoft.com/en-us/office/vba/api/word.wdproofreadingerrortype</a>}
*/
public enum WdProofreadingErrorType implements COMEnum {
    
    /**@ Grammatical error. */
    wdGrammaticalError(1),    
    /**@ Spelling error. */
    wdSpellingError(0);

    private final long value;

    WdProofreadingErrorType(long value) {
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
