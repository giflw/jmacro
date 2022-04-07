package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vissnapextensions">https://docs.microsoft.com/en-us/office/vba/api/visio.vissnapextensions</a>}
*/
public enum VisSnapExtensions implements COMEnum {
    
    /**@ Show alignment box extensions. */
    visSnapExtAlignmentBoxExtension(1),    
    /**@ Show center alignment axes. */
    visSnapExtCenterAxes(2),    
    /**@ Show curved extensions */
    visSnapExtCurveExtension(64),    
    /**@ Show curve interior tangents. */
    visSnapExtCurveTangent(4),    
    /**@ Show ellipse center points. */
    visSnapExtEllipseCenter(2048),    
    /**@ Show horizontal lines at endpoint. */
    visSnapExtEndpointHorizontal(512),    
    /**@ Show endpoint perpendicular lines. */
    visSnapExtEndpointPerpendicular(128),    
    /**@ Show vertical lines at endpoint. */
    visSnapExtEndpointVertical(1024),    
    /**@ Show segment endpoints. */
    visSnapExtEndpoint(8),    
    /**@ Show isometric angle lines. */
    visSnapExtIsometricAngles(4096),    
    /**@ Show linear extensions. */
    visSnapExtLinearExtension(32),    
    /**@ Show midpoint perpendicular lines. */
    visSnapExtMidpointPerpendicular(256),    
    /**@ Show segment midpoints. */
    visSnapExtMidpoint(16),    
    /**@ Show no extentions. */
    visSnapExtNone(0);

    private final long value;

    VisSnapExtensions(long value) {
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
