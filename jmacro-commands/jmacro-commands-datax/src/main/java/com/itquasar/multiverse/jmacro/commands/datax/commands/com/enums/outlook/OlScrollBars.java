package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olscrollbars">https://docs.microsoft.com/en-us/office/vba/api/outlook.olscrollbars</a>}
*/
public enum OlScrollBars implements COMEnum {
    
    /**@ Display both the horizontal and vertical scroll bars as necessary. */
    olScrollBarsBoth(3),    
    /**@ Display a horizontal scroll bar only. */
    olScrollBarsHorizontal(1),    
    /**@ Display no scroll bars. */
    olScrollBarsNone(0),    
    /**@ Display a vertical scroll bar only. */
    olScrollBarsVertical(2);

    private final long value;

    OlScrollBars(long value) {
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
