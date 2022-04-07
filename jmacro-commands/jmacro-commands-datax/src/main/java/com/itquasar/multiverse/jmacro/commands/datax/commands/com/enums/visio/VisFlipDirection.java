package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visflipdirection">https://docs.microsoft.com/en-us/office/vba/api/visio.visflipdirection</a>}
*/
public enum VisFlipDirection implements COMEnum {
    
    /**@ Flip the selection horizontally. */
    visFlipHorizontal(1),    
    /**@ Flip the selection vertically. */
    visFlipVertical(2);

    private final long value;

    VisFlipDirection(long value) {
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
