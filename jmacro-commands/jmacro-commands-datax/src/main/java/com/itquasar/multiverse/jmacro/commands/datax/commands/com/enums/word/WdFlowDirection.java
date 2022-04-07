package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdflowdirection">https://docs.microsoft.com/en-us/office/vba/api/word.wdflowdirection</a>}
*/
public enum WdFlowDirection implements COMEnum {
    
    /**@ Text in columns flows from left to right. */
    wdFlowLtr(0),    
    /**@ Text in columns flows from right to left. */
    wdFlowRtl(1);

    private final long value;

    WdFlowDirection(long value) {
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
