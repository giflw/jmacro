package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vishorizontalaligntypes">https://docs.microsoft.com/en-us/office/vba/api/visio.vishorizontalaligntypes</a>}
*/
public enum VisHorizontalAlignTypes implements COMEnum {
    
    /**@ Align to the center of the primary selected shape. */
    visHorzAlignCenter(2),    
    /**@ Align to the left of the primary selected shape. */
    visHorzAlignLeft(1),    
    /**@ No horizontal alignment. */
    visHorzAlignNone(0),    
    /**@ Align to the right of the primary selected shape. */
    visHorzAlignRight(3);

    private final long value;

    VisHorizontalAlignTypes(long value) {
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
