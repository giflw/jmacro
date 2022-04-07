package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visgraphicpositionvertical">https://docs.microsoft.com/en-us/office/vba/api/visio.visgraphicpositionvertical</a>}
*/
public enum VisGraphicPositionVertical implements COMEnum {
    
    /**@ The top edge of the graphic item's alignment box is aligned with the bottom edge of the shape or container's alignment box. */
    visGraphicBelow(0),    
    /**@ The horizontal centerline of the graphic item's alignment box is aligned with the bottom edge of the shape or container's alignment box. */
    visGraphicBottomEdge(1),    
    /**@ The bottom edge of the graphic item's alignment box is aligned with the bottom edge of the shape or container's alignment box. */
    visGraphicBottom(2),    
    /**@ The horizontal centerline of the graphic item's alignment box is aligned with the horizontal centerline of the shape or container's alignment box. */
    visGraphicMiddle(3),    
    /**@ The top edge of the graphic item's alignment box is aligned with the top edge of the shape or container's alignment box. */
    visGraphicTop(4),    
    /**@ The horizontal centerline of the graphic item's alignment box is aligned with the top edge of the shape or container's alignment box. */
    visGraphicTopEdge(5),    
    /**@ The bottom edge of the graphic item's alignment box is aligned with the top edge of the shape or container's alignment box. */
    visGraphicAbove(6);

    private final long value;

    VisGraphicPositionVertical(long value) {
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
