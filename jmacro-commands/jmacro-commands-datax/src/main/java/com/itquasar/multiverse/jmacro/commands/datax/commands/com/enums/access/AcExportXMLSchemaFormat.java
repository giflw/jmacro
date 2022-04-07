package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acexportxmlschemaformat">https://docs.microsoft.com/en-us/office/vba/api/access.acexportxmlschemaformat</a>}
*/
public enum AcExportXMLSchemaFormat implements COMEnum {
    
    /**@ No description provided */
    acSchemaNone(0),    
    /**@ No description provided */
    acSchemaXSD(1);

    private final long value;

    AcExportXMLSchemaFormat(long value) {
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
