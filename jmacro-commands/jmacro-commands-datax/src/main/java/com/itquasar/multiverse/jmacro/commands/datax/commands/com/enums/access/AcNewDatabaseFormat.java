package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acnewdatabaseformat">https://docs.microsoft.com/en-us/office/vba/api/access.acnewdatabaseformat</a>}
*/
public enum AcNewDatabaseFormat implements COMEnum {
    
    /**@ Create a database in the Access (.accdb) file format. */
    acNewDatabaseFormatAccess12(12),    
    /**@ Create a database in the Microsoft Access 2000 (.mdb) file format. */
    acNewDatabaseFormatAccess2000(9),    
    /**@ Create a database in the Microsoft Access 2002-2003 (.mdb) file format. */
    acNewDatabaseFormatAccess2002(10),    
    /**@ Create a database in the default file format. */
    acNewDatabaseFormatUserDefault(0);

    private final long value;

    AcNewDatabaseFormat(long value) {
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
