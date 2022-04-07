package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdletterheadlocation">https://docs.microsoft.com/en-us/office/vba/api/word.wdletterheadlocation</a>}
*/
public enum WdLetterheadLocation implements COMEnum {
    
    /**@ At the bottom of the letter. */
    wdLetterBottom(1),    
    /**@ To the left of the letter. */
    wdLetterLeft(2),    
    /**@ To the right of the letter. */
    wdLetterRight(3),    
    /**@ At the top of the letter. */
    wdLetterTop(0);

    private final long value;

    WdLetterheadLocation(long value) {
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
