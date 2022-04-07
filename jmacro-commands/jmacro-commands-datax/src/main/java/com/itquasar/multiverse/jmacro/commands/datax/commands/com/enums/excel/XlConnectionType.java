package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlconnectiontype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlconnectiontype</a>}
*/
public enum XlConnectionType implements COMEnum {
    
    /**@ Data Feed */
    xlConnectionTypeDATAFEED(6),    
    /**@ PowerPivot Model */
    xlConnectionTypeMODEL(7),    
    /**@ No source */
    xlConnectionTypeNOSOURCE(9),    
    /**@ ODBC */
    xlConnectionTypeODBC(2),    
    /**@ OLEDB */
    xlConnectionTypeOLEDB(1),    
    /**@ Text */
    xlConnectionTypeTEXT(4),    
    /**@ Web */
    xlConnectionTypeWEB(5),    
    /**@ Worksheet */
    xlConnectionTypeWORKSHEET(8),    
    /**@ XML MAP */
    xlConnectionTypeXMLMAP(3);

    private final long value;

    XlConnectionType(long value) {
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
