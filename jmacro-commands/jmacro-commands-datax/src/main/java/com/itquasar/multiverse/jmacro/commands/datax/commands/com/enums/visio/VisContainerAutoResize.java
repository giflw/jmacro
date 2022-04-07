package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viscontainerautoresize">https://docs.microsoft.com/en-us/office/vba/api/visio.viscontainerautoresize</a>}
*/
public enum VisContainerAutoResize implements COMEnum {
    
    /**@ Do not automatically resize container. */
    visContainerAutoResizeNone(0),    
    /**@ Automatically expand the container size, but don't contract. */
    visContainerAutoResizeExpand(1),    
    /**@ Automatically expand and contract the container size. */
    visContainerAutoResizeExpandContract(2);

    private final long value;

    VisContainerAutoResize(long value) {
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
