package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllinktype">https://docs.microsoft.com/en-us/office/vba/api/excel.xllinktype</a>}
*/
public enum XlLinkType implements COMEnum {
    
    /**@ A link to a Microsoft Excel source. */
    xlLinkTypeExcelLinks(1),    
    /**@ A link to an OLE source. */
    xlLinkTypeOLELinks(2);

    private final long value;

    XlLinkType(long value) {
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
