package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsorton">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsorton</a>}
*/
public enum XlSortOn implements COMEnum {
    
    /**@ Cell color. */
    SortOnCellColor(1),    
    /**@ Font color. */
    SortOnFontColor(2),    
    /**@ Icon. */
    SortOnIcon(3),    
    /**@ Values. */
    SortOnValues(0);

    private final long value;

    XlSortOn(long value) {
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
