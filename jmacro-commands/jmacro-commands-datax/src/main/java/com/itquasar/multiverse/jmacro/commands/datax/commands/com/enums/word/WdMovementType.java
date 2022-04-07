package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmovementtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdmovementtype</a>}
*/
public enum WdMovementType implements COMEnum {
    
    /**@ The end of the selection is extended to the end of the specified unit. */
    wdExtend(1),    
    /**@ The selection is collapsed to an insertion point and moved to the end of the specified unit. Default. */
    wdMove(0);

    private final long value;

    WdMovementType(long value) {
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
