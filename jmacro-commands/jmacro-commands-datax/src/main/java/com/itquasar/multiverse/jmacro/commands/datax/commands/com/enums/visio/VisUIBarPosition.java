package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visuibarposition">https://docs.microsoft.com/en-us/office/vba/api/visio.visuibarposition</a>}
*/
public enum VisUIBarPosition implements COMEnum {
    
    /**@ Display docked at bottom of drawing window. */
    visBarBottom(3),    
    /**@ Float in drawing window. */
    visBarFloating(4),    
    /**@ Display docked at left of drawing window. */
    visBarLeft(0),    
    /**@ Display in the menu bar. */
    visBarMenu(6),    
    /**@ Float in drawing window. */
    visBarPopup(5),    
    /**@ Display docked at right of drawing window. */
    visBarRight(2),    
    /**@ Display docked at top of drawing window. */
    visBarTop(1);

    private final long value;

    VisUIBarPosition(long value) {
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
