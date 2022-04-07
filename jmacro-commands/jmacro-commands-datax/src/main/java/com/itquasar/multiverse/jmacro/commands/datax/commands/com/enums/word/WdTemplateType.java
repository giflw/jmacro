package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtemplatetype">https://docs.microsoft.com/en-us/office/vba/api/word.wdtemplatetype</a>}
*/
public enum WdTemplateType implements COMEnum {
    
    /**@ An attached template. */
    wdAttachedTemplate(2),    
    /**@ A global template. */
    wdGlobalTemplate(1),    
    /**@ The normal default template. */
    wdNormalTemplate(0);

    private final long value;

    WdTemplateType(long value) {
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
