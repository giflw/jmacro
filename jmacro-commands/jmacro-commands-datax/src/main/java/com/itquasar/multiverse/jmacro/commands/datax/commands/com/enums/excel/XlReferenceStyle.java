package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlreferencestyle">https://docs.microsoft.com/en-us/office/vba/api/excel.xlreferencestyle</a>}
*/
public enum XlReferenceStyle implements COMEnum {
    
    /**@ Default. Use xlA1 to return an A1-style reference. */
    xlA1(1),    
    /**@ Use xlR1C1 to return an R1C1-style reference. */
    xlR1C1(-4150);

    private final long value;

    XlReferenceStyle(long value) {
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
