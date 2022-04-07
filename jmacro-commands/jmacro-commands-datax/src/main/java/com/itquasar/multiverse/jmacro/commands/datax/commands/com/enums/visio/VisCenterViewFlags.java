package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viscenterviewflags">https://docs.microsoft.com/en-us/office/vba/api/visio.viscenterviewflags</a>}
*/
public enum VisCenterViewFlags implements COMEnum {
    
    /**@ Display the page that contains the specified shape, and center the view on the shape. */
    visCenterViewDefault(0),    
    /**@ Center the view only if the shape is currently off screen. */
    visCenterViewIfOffScreen(1),    
    /**@ Display the page that contains the specified shape, center the view on the shape, and select the shape. */
    visCenterViewSelectShape(2);

    private final long value;

    VisCenterViewFlags(long value) {
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
