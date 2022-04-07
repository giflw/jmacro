package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visspatialrelationcodes">https://docs.microsoft.com/en-us/office/vba/api/visio.visspatialrelationcodes</a>}
*/
public enum VisSpatialRelationCodes implements COMEnum {
    
    /**@ A shape can be contained within another shape. Shape B is contained within shape A if shape A encloses every region and path of shape B. */
    visSpatialContainedIn(4),    
    /**@ A shape can contain another shape. Shape A contains shape B if shape A encloses every region and path of shape B. */
    visSpatialContain(2),    
    /**@ Two shapes can overlap. Shapes overlap if their interior regions have at least one point in common. You will also get this result if you compare a shape to itself or if either shape is a sub-shape of the other. */
    visSpatialOverlap(1),    
    /**@ A shape can be touching another shape. Shape A touches shape B if neither one contains or overlaps the other and they have one or more common points whose distance is within the specified tolerance. */
    visSpatialTouching(8);

    private final long value;

    VisSpatialRelationCodes(long value) {
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
