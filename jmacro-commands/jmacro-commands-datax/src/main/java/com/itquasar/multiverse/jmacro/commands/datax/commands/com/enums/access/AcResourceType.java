package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acresourcetype">https://docs.microsoft.com/en-us/office/vba/api/access.acresourcetype</a>}
*/
public enum AcResourceType implements COMEnum {
    
    /**@ Image. */
    acResourceImage(1),    
    /**@ Office theme. */
    acResourceTheme(0);

    private final long value;

    AcResourceType(long value) {
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
