package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acimportxmloption">https://docs.microsoft.com/en-us/office/vba/api/access.acimportxmloption</a>}
*/
public enum AcImportXMLOption implements COMEnum {
    
    /**@ Imports the data into an existing table. */
    acAppendData(2),    
    /**@ Imports the data into a new table based on the structure of the specified XML file. */
    acStructureAndData(1),    
    /**@ Creates a new table based on the structure of the specified XML file. */
    acStructureOnly(0);

    private final long value;

    AcImportXMLOption(long value) {
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
