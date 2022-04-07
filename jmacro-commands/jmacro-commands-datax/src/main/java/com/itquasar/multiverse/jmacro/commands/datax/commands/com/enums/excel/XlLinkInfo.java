package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllinkinfo">https://docs.microsoft.com/en-us/office/vba/api/excel.xllinkinfo</a>}
*/
public enum XlLinkInfo implements COMEnum {
    
    /**@ Applies only to editions in the Macintosh operating system. */
    xlEditionDate(2),    
    /**@ Returns the link status. */
    xlLinkInfoStatus(3),    
    /**@ Specifies whether the link updates automatically or manually. */
    xlUpdateState(1);

    private final long value;

    XlLinkInfo(long value) {
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
