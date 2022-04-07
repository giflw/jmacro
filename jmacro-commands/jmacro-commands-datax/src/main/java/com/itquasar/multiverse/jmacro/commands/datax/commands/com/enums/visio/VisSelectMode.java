package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visselectmode">https://docs.microsoft.com/en-us/office/vba/api/visio.visselectmode</a>}
*/
public enum VisSelectMode implements COMEnum {
    
    /**@ Selection reports only subselected shapes. */
    visSelModeOnlySub(2048),    
    /**@ Selection reports only superselected shapes. */
    visSelModeOnlySuper(512),    
    /**@ Selection does not report subselected shapes. */
    visSelModeSkipSub(1024),    
    /**@ Selection does not report superselected shapes. */
    visSelModeSkipSuper(256);

    private final long value;

    VisSelectMode(long value) {
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
