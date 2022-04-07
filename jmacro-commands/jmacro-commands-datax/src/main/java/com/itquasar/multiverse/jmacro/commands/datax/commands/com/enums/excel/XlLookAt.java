package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllookat">https://docs.microsoft.com/en-us/office/vba/api/excel.xllookat</a>}
*/
public enum XlLookAt implements COMEnum {
    
    /**@ Match against any part of the search text. */
    xlPart(2),    
    /**@ Match against the whole of the search text. */
    xlWhole(1);

    private final long value;

    XlLookAt(long value) {
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
