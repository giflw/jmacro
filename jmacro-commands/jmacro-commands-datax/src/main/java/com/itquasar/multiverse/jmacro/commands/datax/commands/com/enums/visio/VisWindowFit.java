package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viswindowfit">https://docs.microsoft.com/en-us/office/vba/api/visio.viswindowfit</a>}
*/
public enum VisWindowFit implements COMEnum {
    
    /**@ No auto-fit. */
    visFitNone(0),    
    /**@ Fit whole page. */
    visFitPage(1),    
    /**@ Fit to page width. */
    visFitWidth(2);

    private final long value;

    VisWindowFit(long value) {
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
