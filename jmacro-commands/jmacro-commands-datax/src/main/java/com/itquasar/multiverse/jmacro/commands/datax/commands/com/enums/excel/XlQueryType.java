package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlquerytype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlquerytype</a>}
*/
public enum XlQueryType implements COMEnum {
    
    /**@ Based on an ADO recordset query */
    xlADORecordset(7),    
    /**@ Based on a DAO recordset query, for query tables only */
    xlDAORecordset(2),    
    /**@ Based on an ODBC data source */
    xlODBCQuery(1),    
    /**@ Based on an OLE DB query, including OLAP data sources */
    xlOLEDBQuery(5),    
    /**@ Based on a text file, for query tables only */
    xlTextImport(6),    
    /**@ Based on a webpage, for query tables only */
    xlWebQuery(4);

    private final long value;

    XlQueryType(long value) {
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
