package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acspreadsheettype">https://docs.microsoft.com/en-us/office/vba/api/access.acspreadsheettype</a>}
*/
public enum AcSpreadSheetType implements COMEnum {
    
    /**@ Microsoft Excel 3.0 format */
    acSpreadsheetTypeExcel3(0),    
    /**@ Microsoft Excel 4.0 format */
    acSpreadsheetTypeExcel4(6),    
    /**@ Microsoft Excel 5.0 format */
    acSpreadsheetTypeExcel5(5),    
    /**@ Microsoft Excel 95 format */
    acSpreadsheetTypeExcel7(5),    
    /**@ Microsoft Excel 97 format */
    acSpreadsheetTypeExcel8(8),    
    /**@ Microsoft Excel 2000 format */
    acSpreadsheetTypeExcel9(8),    
    /**@ Microsoft Excel 2010 format */
    acSpreadsheetTypeExcel12(9),    
    /**@ Microsoft Excel 2010/2013/2016 XML format (.xlsx, .xlsm, .xlsb) */
    acSpreadsheetTypeExcel12Xml(10);

    private final long value;

    AcSpreadSheetType(long value) {
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
