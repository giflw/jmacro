package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visscrollbarstates">https://docs.microsoft.com/en-us/office/vba/api/visio.visscrollbarstates</a>}
*/
public enum VisScrollbarStates implements COMEnum {
    
    /**@ Show both scrollbars. */
    visScrollBarBoth(5),    
    /**@ Show the horizontal scrollbar. */
    visScrollBarHoriz(1),    
    /**@ Show neither scrollbar. */
    visScrollBarNeither(0),    
    /**@ Show the vertical scrollbar. */
    visScrollBarVert(4);

    private final long value;

    VisScrollbarStates(long value) {
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
