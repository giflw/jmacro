package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visboundingboxargs">https://docs.microsoft.com/en-us/office/vba/api/visio.visboundingboxargs</a>}
*/
public enum VisBoundingBoxArgs implements COMEnum {
    
    /**@ Return numbers in the drawing coordinate system of the page or master whose shapes are being considered. By default, the returned numbers are drawing units in the local coordinate system of the parent of the considered shapes. */
    visBBoxDrawingCoords(8192),    
    /**@ Return a rectangle that is the smallest rectangle parallel to the local coordinate system of the shape's parent that encloses the paths stroked by the shape's geometry.This rectangle may be larger or smaller than the shape's upright width-height box. The extents box determined for a shape of type visTypeForeignObject equals that shape's upright width-height box. */
    visBBoxExtents(4),    
    /**@ Ignore visible geometry. */
    visBBoxIgnoreVisible(32),    
    /**@ Include data-graphic callout shapes (and their sub-shapes) that are applied to the shape, or the shapes in a master, page, or selection. Off by default. */
    visBBoxIncludeDataGraphics(65536),    
    /**@ Include extents for shapes of type visTypeguide. By default, the extents of shapes of type visTypeGuide are ignored.If you request guide extents, only the positions of vertical guides and the positions of horizontal guides contribute to the rectangle that is returned. If any vertical guides are reported on, an infinite extent is returned. If any horizontal guides are reported on, an infinite extent is returned. If any rotated guides are reported on, infinite and extents are returned. */
    visBBoxIncludeGuides(4096),    
    /**@ Include hidden geometry. */
    visBBoxIncludeHidden(16),    
    /**@ Ignore the extents of shapes that are non-printing. A shape is non-printing if the value of its NonPrinting cell is non-zero or it belongs only to non-printing layers. */
    visBBoxNoNonPrint(16384),    
    /**@ Return a rectangle that is the smallest rectangle parallel to the local coordinate system of the shape's parent that encloses the shape's text. */
    visBBoxUprightText(2),    
    /**@ Return a rectangle that is the smallest rectangle parallel to the local coordinate system of the shape's parent that encloses the shape's width-height box.If the shape is not rotated, its upright width-height box and its width-height box are the same. Paths in the shape's geometry need not and often don't lie entirely within the shape's width-height box. */
    visBBoxUprightWH(1);

    private final long value;

    VisBoundingBoxArgs(long value) {
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
