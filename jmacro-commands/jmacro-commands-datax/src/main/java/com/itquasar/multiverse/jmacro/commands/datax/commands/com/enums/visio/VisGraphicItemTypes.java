package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visgraphicitemtypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visgraphicitemtypes</a>}
*/
public enum VisGraphicItemTypes implements COMEnum {
    
    /**@ Represents an Icon Set graphic item. */
    visTypeIconSet(2),    
    /**@ Represents a Text graphic item. */
    visTypeTextCallout(3),    
    /**@ Represents a Data Bar graphic item. */
    visTypeDataBar(4),    
    /**@ Represents a Clor by Value graphic item. */
    visTypeColorByValue(5),    
    /**@ Represents a Text graphic item that has a Callout type of Heading x. */
    visTypeHeading(6);

    private final long value;

    VisGraphicItemTypes(long value) {
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
