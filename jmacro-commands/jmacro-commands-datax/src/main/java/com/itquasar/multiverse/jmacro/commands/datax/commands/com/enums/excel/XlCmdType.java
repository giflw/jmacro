package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcmdtype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcmdtype</a>}
*/
public enum XlCmdType implements COMEnum {
    
    /**@ Contains a cube name for an OLAP data source. */
    xlCmdCube(1),    
    /**@ Contains a Data Analysis Expressions (DAX) formula. */
    xlCmdDAX(8),    
    /**@ Contains command text that the OLE DB provider understands. */
    xlCmdDefault(4),    
    /**@ Contains an Excel formula. */
    xlCmdExcel(7),    
    /**@ Contains a pointer to list data. */
    xlCmdList(5),    
    /**@ Contains an SQL statement. */
    xlCmdSql(2),    
    /**@ Contains a table name for accessing OLE DB data sources. */
    xlCmdTable(3),    
    /**@ Contains the name of a table collection. */
    xlCmdTableCollection(6);

    private final long value;

    XlCmdType(long value) {
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
