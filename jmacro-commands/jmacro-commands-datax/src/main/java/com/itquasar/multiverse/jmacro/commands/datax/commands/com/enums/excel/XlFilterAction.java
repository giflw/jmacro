package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlfilteraction">https://docs.microsoft.com/en-us/office/vba/api/excel.xlfilteraction</a>}
*/
public enum XlFilterAction implements COMEnum {
    
    /**@ Copy filtered data to new location. */
    xlFilterCopy(2),    
    /**@ Leave data in place. */
    xlFilterInPlace(1);

    private final long value;

    XlFilterAction(long value) {
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
