package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olpagetype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olpagetype</a>}
*/
public enum OlPageType implements COMEnum {
    
    /**@ The free/busy scheduling grid from a meeting request form. */
    olPageTypePlanner(0),    
    /**@ The tracking grid from a meeting request that has been sent. */
    olPageTypeTracker(1);

    private final long value;

    OlPageType(long value) {
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
