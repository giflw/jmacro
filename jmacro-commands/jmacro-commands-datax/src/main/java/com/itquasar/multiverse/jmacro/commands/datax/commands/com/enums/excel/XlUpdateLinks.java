package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlupdatelinks">https://docs.microsoft.com/en-us/office/vba/api/excel.xlupdatelinks</a>}
*/
public enum XlUpdateLinks implements COMEnum {
    
    /**@ Embedded OLE links are always updated for the specified workbook. */
    xlUpdateLinksAlways(3),    
    /**@ Embedded OLE links are never updated for the specified workbook. */
    xlUpdateLinksNever(2),    
    /**@ Embedded OLE links are updated according to the user's settings for the specified workbook. */
    xlUpdateLinksUserSetting(1);

    private final long value;

    XlUpdateLinks(long value) {
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
