package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visselectargs">https://docs.microsoft.com/en-us/office/vba/api/visio.visselectargs</a>}
*/
public enum VisSelectArgs implements COMEnum {
    
    /**@ Deselects a shape but leaves the rest of the selection unchanged. */
    visDeselect(1),    
    /**@ Selects a shape but leaves the rest of the selection unchanged. */
    visSelect(2),    
    /**@ Selects a shape whose parent is already selected. */
    visSubSelect(3),    
    /**@ Selects a shape and all its peers. */
    visSelectAll(4),    
    /**@ Deselects a shape and all its peers. */
    visDeselectAll(256);

    private final long value;

    VisSelectArgs(long value) {
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
