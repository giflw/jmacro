package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olpermissionservice">https://docs.microsoft.com/en-us/office/vba/api/outlook.olpermissionservice</a>}
*/
public enum OlPermissionService implements COMEnum {
    
    /**@ Microsoft Passport Network permissions will be used. */
    olPassport(2),    
    /**@ Permission service is unknown. */
    olUnknown(0),    
    /**@ Microsoft Windows permissions will be used. */
    olWindows(1);

    private final long value;

    OlPermissionService(long value) {
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
