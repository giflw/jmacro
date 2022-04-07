package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viszoombehavior">https://docs.microsoft.com/en-us/office/vba/api/visio.viszoombehavior</a>}
*/
public enum VisZoomBehavior implements COMEnum {
    
    /**@ The container performs the zoom (default). */
    visZoomInPlaceContainer(1),    
    /**@ Undefined zoom behavior; use the zoom behavior of the document or application. */
    visZoomNone(0),    
    /**@ Microsoft Visio performs the zoom. */
    visZoomVisio(2),    
    /**@ Visio zooms when open in place; Visio does not adjust the zoom level. */
    visZoomVisioExact(4);

    private final long value;

    VisZoomBehavior(long value) {
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
