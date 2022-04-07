package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtrailingcharacter">https://docs.microsoft.com/en-us/office/vba/api/word.wdtrailingcharacter</a>}
*/
public enum WdTrailingCharacter implements COMEnum {
    
    /**@ No character is inserted. */
    wdTrailingNone(2),    
    /**@ A space is inserted. Default. */
    wdTrailingSpace(1),    
    /**@ A tab is inserted. */
    wdTrailingTab(0);

    private final long value;

    WdTrailingCharacter(long value) {
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
