package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vislayoutdirection">https://docs.microsoft.com/en-us/office/vba/api/visio.vislayoutdirection</a>}
*/
public enum VisLayoutDirection implements COMEnum {
    
    /**@ Rotates the diagram or selection 90 degrees clockwise. */
    visLayoutDirRotateRight(0),    
    /**@ Rotates the diagram or selection 90 degrees counter-clockwise. */
    visLayoutDirRotateLeft(1),    
    /**@ Flips the diagram or selection vertically. */
    visLayoutDirFlipVert(2),    
    /**@ Flips the diagram or selection horizontally. */
    visLayoutDirFlipHorz(3);

    private final long value;

    VisLayoutDirection(long value) {
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
