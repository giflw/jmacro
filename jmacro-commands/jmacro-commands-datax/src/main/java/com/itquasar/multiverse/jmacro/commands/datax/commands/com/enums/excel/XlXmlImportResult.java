package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlxmlimportresult">https://docs.microsoft.com/en-us/office/vba/api/excel.xlxmlimportresult</a>}
*/
public enum XlXmlImportResult implements COMEnum {
    
    /**@ The contents of the specified XML data file have been truncated because the XML data file is too large for the worksheet. */
    xlXmlImportElementsTruncated(1),    
    /**@ The XML data file was successfully imported. */
    xlXmlImportSuccess(0),    
    /**@ The contents of the XML data file don't match the specified schema map. */
    xlXmlImportValidationFailed(2);

    private final long value;

    XlXmlImportResult(long value) {
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
