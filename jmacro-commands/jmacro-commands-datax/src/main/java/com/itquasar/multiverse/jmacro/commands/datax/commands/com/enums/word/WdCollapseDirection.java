package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcollapsedirection">https://docs.microsoft.com/en-us/office/vba/api/word.wdcollapsedirection</a>}
*/
public enum WdCollapseDirection implements COMEnum {
    
    /**@ Collapse the range to the ending point. */
    wdCollapseEnd(0),    
    /**@ Collapse the range to the starting point. */
    wdCollapseStart(1);

    private final long value;

    WdCollapseDirection(long value) {
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
