package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acfileformat">https://docs.microsoft.com/en-us/office/vba/api/access.acfileformat</a>}
*/
public enum AcFileFormat implements COMEnum {
    
    /**@ Microsoft Access 2.0 format */
    acFileFormatAccess2(2),    
    /**@ Microsoft Access 95 format */
    acFileFormatAccess95(7),    
    /**@ Microsoft Access 97 format */
    acFileFormatAccess97(8),    
    /**@ Microsoft Access 2000 format */
    acFileFormatAccess2000(9),    
    /**@ Microsoft Access 2002 format */
    acFileFormatAccess2002(10),    
    /**@ Microsoft Access 2007 format */
    acFileFormatAccess2007(12);

    private final long value;

    AcFileFormat(long value) {
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
