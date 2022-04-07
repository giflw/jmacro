package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wduseformattingfrom">https://docs.microsoft.com/en-us/office/vba/api/word.wduseformattingfrom</a>}
*/
public enum WdUseFormattingFrom implements COMEnum {
    
    /**@ Copy source formatting from the current item. */
    wdFormattingFromCurrent(0),    
    /**@ Prompt the user for formatting to use. */
    wdFormattingFromPrompt(2),    
    /**@ Copy source formatting from the current selection. */
    wdFormattingFromSelected(1);

    private final long value;

    WdUseFormattingFrom(long value) {
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
