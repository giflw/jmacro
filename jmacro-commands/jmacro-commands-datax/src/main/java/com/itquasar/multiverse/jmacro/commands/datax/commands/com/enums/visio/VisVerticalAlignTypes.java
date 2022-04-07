package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visverticalaligntypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visverticalaligntypes</a>}
*/
public enum VisVerticalAlignTypes implements COMEnum {
    
    /**@ Align to bottom of primary selected shape. */
    visVertAlignBottom(3),    
    /**@ Align to middle of primary selected shape. */
    visVertAlignMiddle(2),    
    /**@ No vertical alignment. */
    visVertAlignNone(0),    
    /**@ Align to top of primary selected shape. */
    visVertAlignTop(1);

    private final long value;

    VisVerticalAlignTypes(long value) {
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
