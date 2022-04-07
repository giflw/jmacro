package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcharacterwidth">https://docs.microsoft.com/en-us/office/vba/api/word.wdcharacterwidth</a>}
*/
public enum WdCharacterWidth implements COMEnum {
    
    /**@ Characters are displayed in full character width. */
    wdWidthFullWidth(7),    
    /**@ Characters are displayed in half the character width. */
    wdWidthHalfWidth(6);

    private final long value;

    WdCharacterWidth(long value) {
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
