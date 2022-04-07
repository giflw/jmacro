package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visshapeids">https://docs.microsoft.com/en-us/office/vba/api/visio.visshapeids</a>}
*/
public enum VisShapeIDs implements COMEnum {
    
    /**@ An ID no shape will ever have; used for comparison against valid ID values that are returned by the Shape.ID and Shapes.ItemFromID properties. */
    visInvalShapeID(-1),    
    /**@ The ID of a page's or master's page sheet; the value of the Shape.ID property when the shape is a page sheet. */
    visPageSheetID(0);

    private final long value;

    VisShapeIDs(long value) {
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
