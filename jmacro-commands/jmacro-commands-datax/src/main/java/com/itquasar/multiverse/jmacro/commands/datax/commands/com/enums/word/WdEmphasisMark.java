package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdemphasismark">https://docs.microsoft.com/en-us/office/vba/api/word.wdemphasismark</a>}
*/
public enum WdEmphasisMark implements COMEnum {
    
    /**@ No emphasis mark. */
    wdEmphasisMarkNone(0),    
    /**@ A comma. */
    wdEmphasisMarkOverComma(2),    
    /**@ A solid black circle. */
    wdEmphasisMarkOverSolidCircle(1),    
    /**@ An empty white circle. */
    wdEmphasisMarkOverWhiteCircle(3),    
    /**@ A solid black circle. */
    wdEmphasisMarkUnderSolidCircle(4);

    private final long value;

    WdEmphasisMark(long value) {
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
