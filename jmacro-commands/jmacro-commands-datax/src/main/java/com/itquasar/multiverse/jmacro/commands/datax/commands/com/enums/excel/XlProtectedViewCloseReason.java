package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlprotectedviewclosereason">https://docs.microsoft.com/en-us/office/vba/api/excel.xlprotectedviewclosereason</a>}
*/
public enum XlProtectedViewCloseReason implements COMEnum {
    
    /**@ The window was closed when the user clicked the Enable Editing button. */
    xlProtectedViewCloseEdit(1),    
    /**@ The window was closed because the application shut it down forcefully or stopped responding. */
    xlProtectedViewCloseForced(2),    
    /**@ The window was closed normally. */
    xlProtectedViewCloseNormal(0);

    private final long value;

    XlProtectedViewCloseReason(long value) {
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
