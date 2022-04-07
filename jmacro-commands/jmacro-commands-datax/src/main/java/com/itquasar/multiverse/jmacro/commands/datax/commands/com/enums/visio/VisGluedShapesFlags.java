package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visgluedshapesflags">https://docs.microsoft.com/en-us/office/vba/api/visio.visgluedshapesflags</a>}
*/
public enum VisGluedShapesFlags implements COMEnum {
    
    /**@ Return all 1D shapes that are glued to this shape. */
    visGluedShapesAll1D(0),    
    /**@ Return the 1D shapes whose end points are glued to this shape. */
    visGluedShapesIncoming1D(1),    
    /**@ Return the 1D shapes whose begin points are glued to this shape. */
    visGluedShapesOutgoing1D(2),    
    /**@ Return the 2D shapes that are glued to this shape and the 2D shapes to which this shape is glued. */
    visGluedShapesAll2D(3),    
    /**@ If the source object is a 1D shape, return the 2D shape to which the begin point is glued. If the source object is a 2D shape, return the 2D shapes that are glued to this shape. */
    visGluedShapesIncoming2D(4),    
    /**@ If the source object is a 1D shape, return the 2D shape to which the end point is glued. If the source object is a 2D shape, return the 2D shapes to which this shape is glued. */
    visGluedShapesOutgoing2D(5);

    private final long value;

    VisGluedShapesFlags(long value) {
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
