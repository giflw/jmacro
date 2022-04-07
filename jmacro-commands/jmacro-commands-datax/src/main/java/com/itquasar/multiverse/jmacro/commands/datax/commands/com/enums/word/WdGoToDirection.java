package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdgotodirection">https://docs.microsoft.com/en-us/office/vba/api/word.wdgotodirection</a>}
*/
public enum WdGoToDirection implements COMEnum {
    
    /**@ An absolute position. */
    wdGoToAbsolute(1),    
    /**@ The first instance of the specified object. */
    wdGoToFirst(1),    
    /**@ The last instance of the specified object. */
    wdGoToLast(-1),    
    /**@ The next instance of the specified object. */
    wdGoToNext(2),    
    /**@ The previous instance of the specified object. */
    wdGoToPrevious(3),    
    /**@ A position relative to the current position. */
    wdGoToRelative(2);

    private final long value;

    WdGoToDirection(long value) {
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
