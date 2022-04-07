package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlgeneratetablerefs">https://docs.microsoft.com/en-us/office/vba/api/excel.xlgeneratetablerefs</a>}
*/
public enum XlGenerateTableRefs implements COMEnum {
    
    /**@ A1 Table References. */
    xlA1TableRefs(0),    
    /**@ Table Names. */
    xlTableNames(1);

    private final long value;

    XlGenerateTableRefs(long value) {
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
