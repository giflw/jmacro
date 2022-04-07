package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjrowcolsize">https://docs.microsoft.com/en-us/office/vba/api/project.pjrowcolsize</a>}
*/
public enum PjRowColSize implements COMEnum {
    
    /**@ Best fit. */
    pjSizeBestFit(0),    
    /**@ Fixed. */
    pjSizeFixed(1);

    private final long value;

    PjRowColSize(long value) {
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
