package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xltickmark">https://docs.microsoft.com/en-us/office/vba/api/word.xltickmark</a>}
*/
public enum XlTickMark implements COMEnum {
    
    /**@ Crosses the axis. */
    xlTickMarkCross(4),    
    /**@ Inside the axis. */
    xlTickMarkInside(2),    
    /**@ No mark. */
    xlTickMarkNone(-4142),    
    /**@ Outside the axis. */
    xlTickMarkOutside(3);

    private final long value;

    XlTickMark(long value) {
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
