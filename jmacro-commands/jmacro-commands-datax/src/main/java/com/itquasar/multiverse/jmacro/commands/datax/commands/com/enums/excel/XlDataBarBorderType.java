package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldatabarbordertype">https://docs.microsoft.com/en-us/office/vba/api/excel.xldatabarbordertype</a>}
*/
public enum XlDataBarBorderType implements COMEnum {
    
    /**@ The data bar has no border. */
    xlDataBarBorderNone(0),    
    /**@ The data bar has a solid border. */
    xlDataBarBorderSolid(1);

    private final long value;

    XlDataBarBorderType(long value) {
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
