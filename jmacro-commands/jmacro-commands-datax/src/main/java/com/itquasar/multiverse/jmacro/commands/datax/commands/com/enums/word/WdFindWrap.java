package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdfindwrap">https://docs.microsoft.com/en-us/office/vba/api/word.wdfindwrap</a>}
*/
public enum WdFindWrap implements COMEnum {
    
    /**@ After searching the selection or range, Microsoft Word displays a message asking whether to search the remainder of the document. */
    wdFindAsk(2),    
    /**@ The find operation continues if the beginning or end of the search range is reached. */
    wdFindContinue(1),    
    /**@ The find operation ends if the beginning or end of the search range is reached. */
    wdFindStop(0);

    private final long value;

    WdFindWrap(long value) {
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
