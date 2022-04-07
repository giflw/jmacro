package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcursortype">https://docs.microsoft.com/en-us/office/vba/api/word.wdcursortype</a>}
*/
public enum WdCursorType implements COMEnum {
    
    /**@ I-beam cursor shape. */
    wdCursorIBeam(1),    
    /**@ Normal cursor shape. Default; cursor takes shape designated by Windows or the application. */
    wdCursorNormal(2),    
    /**@ Diagonal cursor shape starting at upper-left corner. */
    wdCursorNorthwestArrow(3),    
    /**@ Hourglass cursor shape. */
    wdCursorWait(0);

    private final long value;

    WdCursorType(long value) {
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
