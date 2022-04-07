package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdheadingseparator">https://docs.microsoft.com/en-us/office/vba/api/word.wdheadingseparator</a>}
*/
public enum WdHeadingSeparator implements COMEnum {
    
    /**@ A blank line. */
    wdHeadingSeparatorBlankLine(1),    
    /**@ A designated letter. */
    wdHeadingSeparatorLetter(2),    
    /**@ A designated uppercase letter. */
    wdHeadingSeparatorLetterFull(4),    
    /**@ A designated lowercase letter. */
    wdHeadingSeparatorLetterLow(3),    
    /**@ No separator. */
    wdHeadingSeparatorNone(0);

    private final long value;

    WdHeadingSeparator(long value) {
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
