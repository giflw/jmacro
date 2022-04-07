package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visspatialrelationflags">https://docs.microsoft.com/en-us/office/vba/api/visio.visspatialrelationflags</a>}
*/
public enum VisSpatialRelationFlags implements COMEnum {
    
    /**@ Order items back to front. */
    visSpatialBackToFront(8),    
    /**@ Order items front to back. */
    visSpatialFrontToBack(4),    
    /**@ Do not consider visible Geometry sections. By default, visible Geometry sections influence the result. */
    visSpatialIgnoreVisible(32),    
    /**@ Include containers. By default, containers are not included. */
    visSpatialIncludeContainerShapes(128),    
    /**@ Include data graphic callout shapes and their sub-shapes. By default, data graphic callout shapes and their subshapes are not included. If the parent shape is itself a data graphic callout, searches are made between the parent shape's geometry and non-callout shapes, unless this flag is set. */
    visSpatialIncludeDataGraphics(64),    
    /**@ Consider a guide's Geometry section. By default, guides don't influence the result. */
    visSpatialIncludeGuides(2),    
    /**@ Consider hidden Geometry sections. By default, hidden Geometry sections don't influence the result. */
    visSpatialIncludeHidden(16);

    private final long value;

    VisSpatialRelationFlags(long value) {
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
