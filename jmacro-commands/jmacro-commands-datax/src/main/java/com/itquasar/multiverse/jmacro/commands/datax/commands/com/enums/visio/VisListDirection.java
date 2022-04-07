package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vislistdirection">https://docs.microsoft.com/en-us/office/vba/api/visio.vislistdirection</a>}
*/
public enum VisListDirection implements COMEnum {
    
    /**@ Shapes are arranged horizontally, from left to right. */
    visListDirLeftToRight(0),    
    /**@ Shapes are arranged horizontally, from right to left. */
    visListDirRightToLeft(1),    
    /**@ Shapes are arranged vertically, from top to bottom. */
    visListDirTopToBottom(2),    
    /**@ Shapes are arranged vertically, from bottom to top. */
    visListDirBottomToTop(3);

    private final long value;

    VisListDirection(long value) {
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
