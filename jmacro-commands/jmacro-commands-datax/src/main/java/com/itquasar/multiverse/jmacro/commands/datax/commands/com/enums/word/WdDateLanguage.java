package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddatelanguage">https://docs.microsoft.com/en-us/office/vba/api/word.wddatelanguage</a>}
*/
public enum WdDateLanguage implements COMEnum {
    
    /**@ Bidirectional date/time format. */
    wdDateLanguageBidi(10),    
    /**@ Latin date/time format. */
    wdDateLanguageLatin(1033);

    private final long value;

    WdDateLanguage(long value) {
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
