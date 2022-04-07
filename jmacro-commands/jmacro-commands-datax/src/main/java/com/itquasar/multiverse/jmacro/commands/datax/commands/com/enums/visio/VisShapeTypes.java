package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visshapetypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visshapetypes</a>}
*/
public enum VisShapeTypes implements COMEnum {
    
    /**@ Returned by Shape.ForeignType if the shape is a bitmap. */
    visTypeBitmap(32),    
    /**@ The document's DocumentSheet. */
    visTypeDoc(6),    
    /**@ An imported shape. */
    visTypeForeignObject(4),    
    /**@ A shape that contains other shapes. */
    visTypeGroup(2),    
    /**@ A shape that is a guide. */
    visTypeGuide(5),    
    /**@ Returned by Shape.ForeignType if the shape is ink. */
    visTypeInk(64),    
    /**@ The type of no shape. Means all types when used as filter code. */
    visTypeInval(0),    
    /**@ Returned by Shape.ForeignType if the shape is a control. */
    visTypeIsControl(1024),    
    /**@ Returned by Shape.ForeignType if the shape is embedded. */
    visTypeIsEmbedded(512),    
    /**@ Returned by Shape.ForeignType if the shape is linked. */
    visTypeIsLinked(256),    
    /**@ Returned by Shape.ForeignType if the shape is linked, embedded, or a control. */
    visTypeIsOLE2(32768),    
    /**@ Returned by Shape.ForeignType if the shape is a metafile. */
    visTypeMetafile(16),    
    /**@ Page's or master's PageSheet property. */
    visTypePage(1),    
    /**@ Native Microsoft Visio shape. */
    visTypeShape(3);

    private final long value;

    VisShapeTypes(long value) {
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
