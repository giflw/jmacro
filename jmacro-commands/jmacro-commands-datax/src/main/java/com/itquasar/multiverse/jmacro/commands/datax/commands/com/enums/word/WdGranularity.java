package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdgranularity">https://docs.microsoft.com/en-us/office/vba/api/word.wdgranularity</a>}
*/
public enum WdGranularity implements COMEnum {
    
    /**@ Tracks character-level changes. */
    wdGranularityCharLevel(0),    
    /**@ Tracks word-level changes. */
    wdGranularityWordLevel(1);

    private final long value;

    WdGranularity(long value) {
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
