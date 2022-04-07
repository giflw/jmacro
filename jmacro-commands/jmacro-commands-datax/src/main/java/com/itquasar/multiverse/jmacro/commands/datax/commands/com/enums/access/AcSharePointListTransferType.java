package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acsharepointlisttransfertype">https://docs.microsoft.com/en-us/office/vba/api/access.acsharepointlisttransfertype</a>}
*/
public enum AcSharePointListTransferType implements COMEnum {
    
    /**@ Import the SharePoint list. */
    acImportSharePointList(0),    
    /**@ Link to the SharePoint list. */
    acLinkSharePointList(1);

    private final long value;

    AcSharePointListTransferType(long value) {
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
