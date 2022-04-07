package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlxmlexportresult">https://docs.microsoft.com/en-us/office/vba/api/excel.xlxmlexportresult</a>}
*/
public enum XlXmlExportResult implements COMEnum {
    
    /**@ The XML data file was successfully exported. */
    xlXmlExportSuccess(0),    
    /**@ The contents of the XML data file don't match the specified schema map. */
    xlXmlExportValidationFailed(1);

    private final long value;

    XlXmlExportResult(long value) {
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
