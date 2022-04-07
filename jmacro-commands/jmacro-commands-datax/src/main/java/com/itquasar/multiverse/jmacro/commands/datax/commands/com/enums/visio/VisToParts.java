package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vistoparts">https://docs.microsoft.com/en-us/office/vba/api/visio.vistoparts</a>}
*/
public enum VisToParts implements COMEnum {
    
    /**@ Connect to specified connection point on target shape. */
    visConnectionPoint(100),    
    /**@ Error connecting to shape. */
    visConnectToError(-1),    
    /**@ Connect to intersection of guides on target shape. */
    visGuideIntersect(4),    
    /**@ Connect to vertical guide on target shape. */
    visGuideX(1),    
    /**@ Connect to horizontal guide on target shape. */
    visGuideY(2),    
    /**@ Connect to angle on target shape. */
    visToAngle(7),    
    /**@ Do not connect. */
    visToNone(0),    
    /**@ Connect to entire target shape, using dynamic glue. */
    visWholeShape(3);

    private final long value;

    VisToParts(long value) {
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
