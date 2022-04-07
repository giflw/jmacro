package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpriority">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpriority</a>}
*/
public enum XlPriority implements COMEnum {
    
    /**@ High */
    xlPriorityHigh(-4127),    
    /**@ Low */
    xlPriorityLow(-4134),    
    /**@ Normal */
    xlPriorityNormal(-4143);

    private final long value;

    XlPriority(long value) {
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
