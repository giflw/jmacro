package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrelocate">https://docs.microsoft.com/en-us/office/vba/api/word.wdrelocate</a>}
*/
public enum WdRelocate implements COMEnum {
    
    /**@ Below the next visible paragraph. */
    wdRelocateDown(1),    
    /**@ Above the previous visible paragraph. */
    wdRelocateUp(0);

    private final long value;

    WdRelocate(long value) {
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
