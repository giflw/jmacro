package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vissnapsettings">https://docs.microsoft.com/en-us/office/vba/api/visio.vissnapsettings</a>}
*/
public enum VisSnapSettings implements COMEnum {
    
    /**@ Snap to the alignment box. */
    visSnapToAlignmentBox(512),    
    /**@ Snap to connection points. */
    visSnapToConnectionPoints(32),    
    /**@ Disable snap. */
    visSnapToDisabled(32768),    
    /**@ Snap to shape extensions options. */
    visSnapToExtensions(1024),    
    /**@ Snap to the visible edges of shapes. */
    visSnapToGeometry(256),    
    /**@ Snap to the grid. */
    visSnapToGrid(2),    
    /**@ Snap to guides. */
    visSnapToGuides(4),    
    /**@ Snap to selection handles. */
    visSnapToHandles(8),    
    /**@ Snap to intersections. */
    visSnapToIntersections(65536),    
    /**@ Snap to nothing. */
    visSnapToNone(0),    
    /**@ Snap to tick marks on the ruler. */
    visSnapToRulerSubdivisions(1),    
    /**@ Snap to vertices. */
    visSnapToVertices(16);

    private final long value;

    VisSnapSettings(long value) {
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
