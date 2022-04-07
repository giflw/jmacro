package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acexportxmlobjecttype">https://docs.microsoft.com/en-us/office/vba/api/access.acexportxmlobjecttype</a>}
*/
public enum AcExportXMLObjectType implements COMEnum {
    
    /**@ Form */
    acExportForm(2),    
    /**@ User-defined function (Microsoft Access project only) */
    acExportFunction(10),    
    /**@ Query */
    acExportQuery(1),    
    /**@ Report */
    acExportReport(3),    
    /**@ Server view (Microsoft Access project only) */
    acExportServerView(7),    
    /**@ Stored procedure (Microsoft Access project only) */
    acExportStoredProcedure(9),    
    /**@ Table */
    acExportTable(0);

    private final long value;

    AcExportXMLObjectType(long value) {
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
