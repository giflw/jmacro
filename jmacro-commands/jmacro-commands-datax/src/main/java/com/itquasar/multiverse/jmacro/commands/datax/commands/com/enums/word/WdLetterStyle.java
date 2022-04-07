package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdletterstyle">https://docs.microsoft.com/en-us/office/vba/api/word.wdletterstyle</a>}
*/
public enum WdLetterStyle implements COMEnum {
    
    /**@ Full block. */
    wdFullBlock(0),    
    /**@ Modified block. */
    wdModifiedBlock(1),    
    /**@ Semi-block. */
    wdSemiBlock(2);

    private final long value;

    WdLetterStyle(long value) {
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
