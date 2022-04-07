package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllink">https://docs.microsoft.com/en-us/office/vba/api/excel.xllink</a>}
*/
public enum XlLink implements COMEnum {
    
    /**@ The link is to an Excel worksheet. */
    xlExcelLinks(1),    
    /**@ The link is to an OLE source. */
    xlOLELinks(2),    
    /**@ Macintosh only. */
    xlPublishers(5),    
    /**@ Macintosh only. */
    xlSubscribers(6);

    private final long value;

    XlLink(long value) {
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
