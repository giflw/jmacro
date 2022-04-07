package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportrotation">https://docs.microsoft.com/en-us/office/vba/api/visio.visrasterexportrotation</a>}
*/
public enum VisRasterExportRotation implements COMEnum {
    
    /**@ No rotation; the default. */
    visRasterNoRotation(0),    
    /**@ Rotate left. */
    visRasterRotateLeft(1),    
    /**@ Rotate right. */
    visRasterRotateRight(2);

    private final long value;

    VisRasterExportRotation(long value) {
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
