package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlrangevaluedatatype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlrangevaluedatatype</a>}
*/
public enum XlRangeValueDataType implements COMEnum {
    
    /**@ Default. If the specified Range object is empty, returns the value Empty (use the IsEmpty function to test for this case). If the Range object contains more than one cell, returns an array of values (use the IsArray function to test for this case). */
    xlRangeValueDefault(10),    
    /**@ Returns the recordset representation of the specified Range object in an XML format. */
    xlRangeValueMSPersistXML(12),    
    /**@ Returns the values, formatting, formulas, and names of the specified Range object in the XML Spreadsheet format. */
    xlRangeValueXMLSpreadsheet(11);

    private final long value;

    XlRangeValueDataType(long value) {
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
