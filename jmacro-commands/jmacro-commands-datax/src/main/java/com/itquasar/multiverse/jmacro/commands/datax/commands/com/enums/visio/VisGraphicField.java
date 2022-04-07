package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visgraphicfield">https://docs.microsoft.com/en-us/office/vba/api/visio.visgraphicfield</a>}
*/
public enum VisGraphicField implements COMEnum {
    
    /**@ The ShapeSheet formula of a shape data item. */
    visGraphicExpression(2),    
    /**@ The label of a shape data item. */
    visGraphicPropertyLabel(1);

    private final long value;

    VisGraphicField(long value) {
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
