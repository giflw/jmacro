package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdreadingorder">https://docs.microsoft.com/en-us/office/vba/api/word.wdreadingorder</a>}
*/
public enum WdReadingOrder implements COMEnum {
    
    /**@ Left-to-right reading order. */
    wdReadingOrderLtr(1),    
    /**@ Right-to-left reading order. */
    wdReadingOrderRtl(0);

    private final long value;

    WdReadingOrder(long value) {
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
