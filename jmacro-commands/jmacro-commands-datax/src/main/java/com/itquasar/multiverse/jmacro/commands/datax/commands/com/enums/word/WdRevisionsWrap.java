package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisionswrap">https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisionswrap</a>}
*/
public enum WdRevisionsWrap implements COMEnum {
    
    /**@ Revisions are wrapped. */
    wdWrapAlways(1),    
    /**@ Ask the user if revisions should be wrapped. */
    wdWrapAsk(2),    
    /**@ Never wrap revisions. */
    wdWrapNever(0);

    private final long value;

    WdRevisionsWrap(long value) {
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
