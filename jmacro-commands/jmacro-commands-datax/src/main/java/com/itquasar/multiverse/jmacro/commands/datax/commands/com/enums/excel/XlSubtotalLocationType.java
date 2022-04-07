package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsubtotallocationtype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsubtotallocationtype</a>}
*/
public enum XlSubtotalLocationType implements COMEnum {
    
    /**@ Subtotal will be at the bottom. */
    xlAtBottom(2),    
    /**@ Subtotal will be at the top. */
    xlAtTop(1);

    private final long value;

    XlSubtotalLocationType(long value) {
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
