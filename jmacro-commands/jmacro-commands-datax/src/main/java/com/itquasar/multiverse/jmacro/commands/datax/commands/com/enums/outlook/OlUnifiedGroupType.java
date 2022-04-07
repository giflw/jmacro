package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olunifiedgrouptype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olunifiedgrouptype</a>}
*/
public enum OlUnifiedGroupType implements COMEnum {
    
    /**@ Assigns a private group. */
    PrivateGroup(1),    
    /**@ Assigns a public group. */
    PublicGroup(2);

    private final long value;

    OlUnifiedGroupType(long value) {
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
