package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visfromparts">https://docs.microsoft.com/en-us/office/vba/api/visio.visfromparts</a>}
*/
public enum VisFromParts implements COMEnum {
    
    /**@ Connection is from the begin point x of a 1D shape. */
    visBeginX(7),    
    /**@ Connection is from the begin point y of a 1D shape. */
    visBeginY(8),    
    /**@ Connection is from the begin point of a 1D shape. */
    visBegin(9),    
    /**@ Connection is from bottom edge of shape. */
    visBottomEdge(4),    
    /**@ Connection is from the center (x) of a 1D shape. */
    visCenterEdge(2),    
    /**@ Connection from an unknown part. */
    visConnectFromError(-1),    
    /**@ Connection is from the control point plus the row index (see Note). */
    visControlPoint(100),    
    /**@ Connection is from the endpoint (x) of a 1D shape. */
    visEndX(10),    
    /**@ Connection is from the endpoint (y) of a 1D shape. */
    visEndY(11),    
    /**@ Connection is from the end of a 1D shape. */
    visEnd(12),    
    /**@ Connection is from the direction of a connection point. */
    visFromAngle(13),    
    /**@ Connection is from nothing. */
    visFromNone(0),    
    /**@ Connection is from the pin of a shape. */
    visFromPin(14),    
    /**@ Connection is from the left edge of a shape. */
    visLeftEdge(1),    
    /**@ Connection is from the middle (y) of a shape. */
    visMiddleEdge(5),    
    /**@ Connection is from the right edge of a shape. */
    visRightEdge(3),    
    /**@ Connection is from the top edge of a shape. */
    visTopEdge(6);

    private final long value;

    VisFromParts(long value) {
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
