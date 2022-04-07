package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acwebusergroupsdisplay">https://docs.microsoft.com/en-us/office/vba/api/access.acwebusergroupsdisplay</a>}
*/
public enum AcWebUserGroupsDisplay implements COMEnum {
    
    /**@ The identifiers of the groups. */
    acWebUserGroupID(0),    
    /**@ The names of the groups. */
    acWebUserGroupName(1);

    private final long value;

    AcWebUserGroupsDisplay(long value) {
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
