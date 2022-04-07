package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdrawregionflags">https://docs.microsoft.com/en-us/office/vba/api/visio.visdrawregionflags</a>}
*/
public enum VisDrawRegionFlags implements COMEnum {
    
    /**@ Delete items in selection. */
    visDrawRegionDeleteInput(4),    
    /**@ Exclude visible geometry. */
    visDrawRegionIgnoreVisible(32),    
    /**@ Include data graphic callout shapes and their sub-shapes. */
    visDrawRegionIncludeDataGraphics(64),    
    /**@ Include hidden geometry. */
    visDrawRegionIncludeHidden(16);

    private final long value;

    VisDrawRegionFlags(long value) {
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
