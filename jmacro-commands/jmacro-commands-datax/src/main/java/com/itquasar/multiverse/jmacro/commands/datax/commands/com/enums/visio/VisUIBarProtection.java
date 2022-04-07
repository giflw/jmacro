package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visuibarprotection">https://docs.microsoft.com/en-us/office/vba/api/visio.visuibarprotection</a>}
*/
public enum VisUIBarProtection implements COMEnum {
    
    /**@ Can't be docked or floating. */
    visBarNoChangeDock(16),    
    /**@ Can't be customized. */
    visBarNoCustomize(1),    
    /**@ Can't be docked horizontally. */
    visBarNoHorizontalDock(64),    
    /**@ Can't be moved. */
    visBarNoMove(4),    
    /**@ No protection. */
    visBarNoProtection(0),    
    /**@ Can't be resized. */
    visBarNoResize(2),    
    /**@ Can't be docked vertically. */
    visBarNoVerticalDock(32);

    private final long value;

    VisUIBarProtection(long value) {
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
