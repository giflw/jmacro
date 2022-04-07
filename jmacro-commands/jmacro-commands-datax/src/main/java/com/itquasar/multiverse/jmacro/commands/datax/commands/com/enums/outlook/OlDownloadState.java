package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oldownloadstate">https://docs.microsoft.com/en-us/office/vba/api/outlook.oldownloadstate</a>}
*/
public enum OlDownloadState implements COMEnum {
    
    /**@ Full item has been downloaded. */
    olFullItem(1),    
    /**@ Only the header has been downloaded. */
    olHeaderOnly(0);

    private final long value;

    OlDownloadState(long value) {
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
