package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visgeomflags">https://docs.microsoft.com/en-us/office/vba/api/visio.visgeomflags</a>}
*/
public enum VisGeomFlags implements COMEnum {
    
    /**@ The last point (the X and Y cells in the row) is not included in the data. */
    visGeomExcludeLastPoint(1),    
    /**@ The X and Y values are percentages of width and height. */
    visGeomWHPct(16),    
    /**@ The X and Y values are local, internal units in the drawing. */
    visGeomXYLocal(32);

    private final long value;

    VisGeomFlags(long value) {
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
