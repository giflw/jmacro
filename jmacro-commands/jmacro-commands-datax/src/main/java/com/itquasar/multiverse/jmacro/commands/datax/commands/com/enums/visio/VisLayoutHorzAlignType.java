package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vislayouthorzaligntype">https://docs.microsoft.com/en-us/office/vba/api/visio.vislayouthorzaligntype</a>}
*/
public enum VisLayoutHorzAlignType implements COMEnum {
    
    /**@ Do not align horizontally. */
    visLayoutHorzAlignNone(0),    
    /**@ Let Visio choose how to align horizontally. */
    visLayoutHorzAlignDefault(1),    
    /**@ Align the left edges of the shapes. */
    visLayoutHorzAlignLeft(2),    
    /**@ Align the centers of the shapes. */
    visLayoutHorzAlignCenter(3),    
    /**@ Align the right edges of the shapes. */
    visLayoutHorzAlignRight(4);

    private final long value;

    VisLayoutHorzAlignType(long value) {
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
