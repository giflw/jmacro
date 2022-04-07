package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acexportxmlotherflags">https://docs.microsoft.com/en-us/office/vba/api/access.acexportxmlotherflags</a>}
*/
public enum AcExportXMLOtherFlags implements COMEnum {
    
    /**@ Writes schema information into the document specified by the DataTarget argument; this value takes precedence over the SchemaTarget argument. */
    acEmbedSchema(1),    
    /**@ Does not export primary key and index schema properties. */
    acExcludePrimaryKeyAndIndexes(2),    
    /**@ The exported schema contains properties of the table and its fields. */
    acExportAllTableAndFieldProperties(32),    
    /**@ Creates a live link to a remote Microsoft SQL Server 2000 database. Valid only when you are exporting reports that are bound to a Microsoft SQL Server 2000 database. */
    acLiveReportSource(8),    
    /**@ Persists the exported object's ReportML information. */
    acPersistReportML(16),    
    /**@ Creates an Active Server Pages (ASP) wrapper; otherwise, default is an HTML wrapper. Applies only when you are exporting reports. */
    acRunFromServer(4);

    private final long value;

    AcExportXMLOtherFlags(long value) {
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
