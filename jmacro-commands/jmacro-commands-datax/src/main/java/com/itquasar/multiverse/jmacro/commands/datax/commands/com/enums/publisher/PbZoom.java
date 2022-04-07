package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbzoom">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbzoom</a>}
*/
public enum PbZoom implements COMEnum {
    
    /**@ Resizes the page view to the size of the current selection. */
    pbZoomFitSelection(-3),    
    /**@ Resizes the page view to the width of the publication. */
    pbZoomPageWidth(-1),    
    /**@ Resizes the page view to the size of a whole page. */
    pbZoomWholePage(-2);

    private final long value;

    PbZoom(long value) {
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
