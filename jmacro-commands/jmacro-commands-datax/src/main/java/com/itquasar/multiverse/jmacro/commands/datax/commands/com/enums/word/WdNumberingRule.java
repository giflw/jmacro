package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdnumberingrule">https://docs.microsoft.com/en-us/office/vba/api/word.wdnumberingrule</a>}
*/
public enum WdNumberingRule implements COMEnum {
    
    /**@ Numbers are assigned continuously. */
    wdRestartContinuous(0),    
    /**@ Numbers are reset for each page. */
    wdRestartPage(2),    
    /**@ Numbers are reset for each section. */
    wdRestartSection(1);

    private final long value;

    WdNumberingRule(long value) {
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
