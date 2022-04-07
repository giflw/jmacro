package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpagemovementtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdpagemovementtype</a>}
*/
public enum WdPageMovementType implements COMEnum {
    
    /**@ Document page movement type vertical. */
    wdVertical(1),    
    /**@ Document page movement type side-to-side. */
    wdSideToSide(2);

    private final long value;

    WdPageMovementType(long value) {
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
