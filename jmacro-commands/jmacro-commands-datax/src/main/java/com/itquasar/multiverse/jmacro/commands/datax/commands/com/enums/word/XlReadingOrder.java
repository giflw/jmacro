package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlreadingorder">https://docs.microsoft.com/en-us/office/vba/api/word.xlreadingorder</a>}
*/
public enum XlReadingOrder implements COMEnum {
    
    /**@ According to context. */
    xlContext(-5002),    
    /**@ Left-to-right. */
    xlLTR(-5003),    
    /**@ Right-to-left. */
    xlRTL(-5004);

    private final long value;

    XlReadingOrder(long value) {
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
