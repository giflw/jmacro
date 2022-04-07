package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visexistsflags">https://docs.microsoft.com/en-us/office/vba/api/visio.visexistsflags</a>}
*/
public enum VisExistsFlags implements COMEnum {
    
    /**@ The ShapeSheet section either exists locally in the shape or is inherited. */
    visExistsAnywhere(0),    
    /**@ The ShapeSheet section exists locally in the shape. */
    visExistsLocally(1);

    private final long value;

    VisExistsFlags(long value) {
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
