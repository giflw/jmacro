package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlistapplyto">https://docs.microsoft.com/en-us/office/vba/api/word.wdlistapplyto</a>}
*/
public enum WdListApplyTo implements COMEnum {
    
    /**@ Selection. */
    wdListApplyToSelection(2),    
    /**@ From cursor insertion point to end of list. */
    wdListApplyToThisPointForward(1),    
    /**@ Entire list. */
    wdListApplyToWholeList(0);

    private final long value;

    WdListApplyTo(long value) {
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
