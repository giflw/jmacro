package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visgraphicpositionhorizontal">https://docs.microsoft.com/en-us/office/vba/api/visio.visgraphicpositionhorizontal</a>}
*/
public enum VisGraphicPositionHorizontal implements COMEnum {
    
    /**@ The right edge of the graphic item's alignment box is aligned with the left edge of the shape or container's alignment box. */
    visGraphicFarLeft(0),    
    /**@ The vertical centerline of the graphic item's alignment box is aligned with the left edge of the shape or container's alignment box. */
    visGraphicLeftEdge(1),    
    /**@ The left edge of the graphic item's alignment box is aligned with the left edge of the shape or container's alignment box. */
    visGraphicLeft(2),    
    /**@ The vertical centerline of the graphic item's alignment box is aligned with the vertical centerline of the shape or container's alignment box. */
    visGraphicCenter(3),    
    /**@ The right edge of the graphic item's alignment box is aligned with the right edge of the shape or container's alignment box. */
    visGraphicRight(4),    
    /**@ The vertical centerline of the graphic item's alignment box is aligned with the right edge of the shape or container's alignment box. */
    visGraphicRightEdge(5),    
    /**@ The left edge of the graphic item's alignment box is aligned with the right edge of the shape or container's alignment box. */
    visGraphicFarRight(6);

    private final long value;

    VisGraphicPositionHorizontal(long value) {
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
