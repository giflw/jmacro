package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viswindowarrange">https://docs.microsoft.com/en-us/office/vba/api/visio.viswindowarrange</a>}
*/
public enum VisWindowArrange implements COMEnum {
    
    /**@ Cascade the windows. */
    visArrangeCascade(3),    
    /**@ Tile the windows horizontally. */
    visArrangeTileHorizontal(2),    
    /**@ Tile the windows vertically. */
    visArrangeTileVertical(1);

    private final long value;

    VisWindowArrange(long value) {
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
