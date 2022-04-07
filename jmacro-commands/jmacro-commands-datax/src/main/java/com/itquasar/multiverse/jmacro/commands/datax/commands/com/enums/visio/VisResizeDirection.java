package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visresizedirection">https://docs.microsoft.com/en-us/office/vba/api/visio.visresizedirection</a>}
*/
public enum VisResizeDirection implements COMEnum {
    
    /**@ Middle right. */
    visResizeDirE(0),    
    /**@ Top right. */
    visResizeDirNE(1),    
    /**@ Top center. */
    visResizeDirN(2),    
    /**@ Top left. */
    visResizeDirNW(3),    
    /**@ Middle left. */
    visResizeDirW(4),    
    /**@ Bottom left. */
    visResizeDirSW(5),    
    /**@ Bottom center. */
    visResizeDirS(6),    
    /**@ Bottom right. */
    visResizeDirSE(7);

    private final long value;

    VisResizeDirection(long value) {
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
