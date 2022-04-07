package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcomparedestination">https://docs.microsoft.com/en-us/office/vba/api/word.wdcomparedestination</a>}
*/
public enum WdCompareDestination implements COMEnum {
    
    /**@ Creates a new file and tracks the differences between the original document and the revised document using tracked changes. */
    wdCompareDestinationNew(2),    
    /**@ Tracks the differences between the two files using tracked changes in the original document. */
    wdCompareDestinationOriginal(0),    
    /**@ Tracks the differences between the two files using tracked changes in the revised document. */
    wdCompareDestinationRevised(1);

    private final long value;

    WdCompareDestination(long value) {
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
