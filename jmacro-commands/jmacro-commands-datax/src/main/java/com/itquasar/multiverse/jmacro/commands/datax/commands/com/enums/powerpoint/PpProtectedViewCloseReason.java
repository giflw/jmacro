package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppprotectedviewclosereason">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppprotectedviewclosereason</a>}
*/
public enum PpProtectedViewCloseReason implements COMEnum {
    
    /**@ Protected view is being closed normally. */
    ppProtectedViewCloseNormal(0),    
    /**@ Protected view is being closed so that the presentation can be edited. */
    ppProtectedViewCloseEdit(1),    
    /**@ Protected view is forced closed. */
    ppProtectedViewCloseForced(2);

    private final long value;

    PpProtectedViewCloseReason(long value) {
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
