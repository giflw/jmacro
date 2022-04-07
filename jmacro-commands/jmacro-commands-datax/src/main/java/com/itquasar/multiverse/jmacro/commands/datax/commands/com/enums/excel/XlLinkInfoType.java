package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllinkinfotype">https://docs.microsoft.com/en-us/office/vba/api/excel.xllinkinfotype</a>}
*/
public enum XlLinkInfoType implements COMEnum {
    
    /**@ OLE or DDE server */
    xlLinkInfoOLELinks(2),    
    /**@ Publisher */
    xlLinkInfoPublishers(5),    
    /**@ Subscriber */
    xlLinkInfoSubscribers(6);

    private final long value;

    XlLinkInfoType(long value) {
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
