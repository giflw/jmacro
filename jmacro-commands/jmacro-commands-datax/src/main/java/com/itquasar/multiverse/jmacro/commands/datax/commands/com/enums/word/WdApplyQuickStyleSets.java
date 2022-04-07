package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdapplyquickstylesets">https://docs.microsoft.com/en-us/office/vba/api/word.wdapplyquickstylesets</a>}
*/
public enum WdApplyQuickStyleSets implements COMEnum {
    
    /**@ Resets the Quick Style to the style set in use when the document was opened. */
    wdSessionStartSet(1),    
    /**@ Resets the Quick Style to the style set from the template, if any. */
    wdTemplateSet(2);

    private final long value;

    WdApplyQuickStyleSets(long value) {
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
