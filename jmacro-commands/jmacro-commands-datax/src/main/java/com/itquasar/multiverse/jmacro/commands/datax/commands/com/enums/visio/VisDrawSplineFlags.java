package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdrawsplineflags">https://docs.microsoft.com/en-us/office/vba/api/visio.visdrawsplineflags</a>}
*/
public enum VisDrawSplineFlags implements COMEnum {
    
    /**@ Draw a sequence of arcs rather than a sequence of line segments. */
    visPolyarcs(256),    
    /**@ Draw a shape that has one-dimensional (1D) behavior. */
    visPolyline1D(8),    
    /**@ Draw a shape that has 1D behavior. */
    visSpline1D(8),    
    /**@ Break the spline whenever an abrupt change of direction or curvature in the point's trail is detected. */
    visSplineAbrupt(4),    
    /**@ Recognize circular segments in the given array of points and generate circular arcs for those segments. */
    visSplineDoCircles(2),    
    /**@ Draw a periodic spline. */
    visSplinePeriodic(1);

    private final long value;

    VisDrawSplineFlags(long value) {
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
