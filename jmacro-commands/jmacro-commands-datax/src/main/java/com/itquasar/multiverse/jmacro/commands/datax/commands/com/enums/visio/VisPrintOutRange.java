package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visprintoutrange">https://docs.microsoft.com/en-us/office/vba/api/visio.visprintoutrange</a>}
*/
public enum VisPrintOutRange implements COMEnum {
    
    /**@ Print all foreground pages. */
    visPrintAll(0),    
    /**@ Print current page. */
    visPrintCurrentPage(2),    
    /**@ Print current view area. */
    visPrintCurrentView(4),    
    /**@ Print pages between from index and to index. */
    visPrintFromTo(1),    
    /**@ Print selection. */
    visPrintSelection(3);

    private final long value;

    VisPrintOutRange(long value) {
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
