package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acwebuserdisplay">https://docs.microsoft.com/en-us/office/vba/api/access.acwebuserdisplay</a>}
*/
public enum AcWebUserDisplay implements COMEnum {
    
    /**@ The current user's email address. */
    acWebUserEmail(3),    
    /**@ The current user's member ID. */
    acWebUserID(0),    
    /**@ The current user's login name. */
    acWebUserLoginName(2),    
    /**@ The current user's display name. */
    acWebUserName(1);

    private final long value;

    AcWebUserDisplay(long value) {
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
