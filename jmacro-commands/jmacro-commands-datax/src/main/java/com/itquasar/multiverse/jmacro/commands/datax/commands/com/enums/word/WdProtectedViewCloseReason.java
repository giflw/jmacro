package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdprotectedviewclosereason">https://docs.microsoft.com/en-us/office/vba/api/word.wdprotectedviewclosereason</a>}
*/
public enum WdProtectedViewCloseReason implements COMEnum {
    
    /**@ The window was closed when the user clicked the Enable Editing or Edit Anyway button while in Protected View. */
    wdProtectedViewCloseEdit(1),    
    /**@ The window was closed because the application shut it down forcefully or it stopped responding. */
    wdProtectedViewCloseForced(2),    
    /**@ The window was closed normally. */
    wdProtectedViewCloseNormal(0);

    private final long value;

    WdProtectedViewCloseReason(long value) {
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
