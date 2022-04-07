package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdsaveoptions">https://docs.microsoft.com/en-us/office/vba/api/word.wdsaveoptions</a>}
*/
public enum WdSaveOptions implements COMEnum {
    
    /**@ Do not save pending changes. */
    wdDoNotSaveChanges(0),    
    /**@ Prompt the user to save pending changes. */
    wdPromptToSaveChanges(-2),    
    /**@ Save pending changes automatically without prompting the user. */
    wdSaveChanges(-1);

    private final long value;

    WdSaveOptions(long value) {
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
