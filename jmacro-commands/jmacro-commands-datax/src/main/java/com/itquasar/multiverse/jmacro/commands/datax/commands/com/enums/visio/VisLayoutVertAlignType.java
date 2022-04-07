package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vislayoutvertaligntype">https://docs.microsoft.com/en-us/office/vba/api/visio.vislayoutvertaligntype</a>}
*/
public enum VisLayoutVertAlignType implements COMEnum {
    
    /**@ Do not align vertically. */
    visLayoutVertAlignNone(0),    
    /**@ Let Visio choose how to align vertically. */
    visLayoutVertAlignDefault(1),    
    /**@ Align the top edges of the shapes. */
    visLayoutVertAlignTop(2),    
    /**@ Align the middles of the shapes. */
    visLayoutVertAlignMiddle(3),    
    /**@ Align the bottom edges of the shapes. */
    visLayoutVertAlignBottom(4);

    private final long value;

    VisLayoutVertAlignType(long value) {
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
