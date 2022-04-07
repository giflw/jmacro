package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcorruptload">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcorruptload</a>}
*/
public enum XlCorruptLoad implements COMEnum {
    
    /**@ Workbook is opened in extract data mode. */
    xlExtractData(2),    
    /**@ Workbook is opened normally. */
    xlNormalLoad(0),    
    /**@ Workbook is opened in repair mode. */
    xlRepairFile(1);

    private final long value;

    XlCorruptLoad(long value) {
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
