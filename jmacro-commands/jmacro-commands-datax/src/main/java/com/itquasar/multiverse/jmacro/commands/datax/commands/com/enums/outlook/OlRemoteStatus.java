package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olremotestatus">https://docs.microsoft.com/en-us/office/vba/api/outlook.olremotestatus</a>}
*/
public enum OlRemoteStatus implements COMEnum {
    
    /**@ Item is marked to be copied. */
    olMarkedForCopy(3),    
    /**@ Item is marked for deletion. */
    olMarkedForDelete(4),    
    /**@ Item is marked for download. */
    olMarkedForDownload(2),    
    /**@ No remote status has been set. */
    olRemoteStatusNone(0),    
    /**@ Item is not marked. */
    olUnMarked(1);

    private final long value;

    OlRemoteStatus(long value) {
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
