package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acdatatransfertype">https://docs.microsoft.com/en-us/office/vba/api/access.acdatatransfertype</a>}
*/
public enum AcDataTransferType implements COMEnum {
    
    /**@ The data is exported. */
    acExport(1),    
    /**@ (Default) The data is imported. */
    acImport(0),    
    /**@ The database is linked to the specified data source. */
    acLink(2);

    private final long value;

    AcDataTransferType(long value) {
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
