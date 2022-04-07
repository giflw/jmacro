package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visstatcodes">https://docs.microsoft.com/en-us/office/vba/api/visio.visstatcodes</a>}
*/
public enum VisStatCodes implements COMEnum {
    
    /**@ The application has stopped. */
    visStatAppHasShutdown(1),    
    /**@ Object is closed. */
    visStatClosed(8),    
    /**@ Object is deleted. */
    visStatDeleted(2),    
    /**@ Object status is normal. */
    visStatNormal(0),    
    /**@ Object status is suspended. */
    visStatSuspended(16);

    private final long value;

    VisStatCodes(long value) {
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
