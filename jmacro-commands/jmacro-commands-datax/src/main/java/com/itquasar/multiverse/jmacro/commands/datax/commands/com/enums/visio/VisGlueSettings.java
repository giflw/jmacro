package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visgluesettings">https://docs.microsoft.com/en-us/office/vba/api/visio.visgluesettings</a>}
*/
public enum VisGlueSettings implements COMEnum {
    
    /**@ Glue to connection points. */
    visGlueToConnectionPoints(8),    
    /**@ Disable glue. */
    visGlueToDisabled(32768),    
    /**@ Glue to shape geometry. */
    visGlueToGeometry(32),    
    /**@ Glue to guides. */
    visGlueToGuides(1),    
    /**@ Glue to shape handles. */
    visGlueToHandles(2),    
    /**@ Glue is enabled but no other glue settings are on. */
    visGlueToNone(0),    
    /**@ Glue to shape vertices. */
    visGlueToVertices(4);

    private final long value;

    VisGlueSettings(long value) {
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
