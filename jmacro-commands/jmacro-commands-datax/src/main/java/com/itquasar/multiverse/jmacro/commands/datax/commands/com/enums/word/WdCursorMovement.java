package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcursormovement">https://docs.microsoft.com/en-us/office/vba/api/word.wdcursormovement</a>}
*/
public enum WdCursorMovement implements COMEnum {
    
    /**@ Insertion point progresses according to the direction of the language Microsoft Word detects. */
    wdCursorMovementLogical(0),    
    /**@ Insertion point progresses to the next visually adjacent character. */
    wdCursorMovementVisual(1);

    private final long value;

    WdCursorMovement(long value) {
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
