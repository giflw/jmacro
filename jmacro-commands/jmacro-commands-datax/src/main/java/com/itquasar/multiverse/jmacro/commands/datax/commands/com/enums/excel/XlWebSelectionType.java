package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlwebselectiontype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlwebselectiontype</a>}
*/
public enum XlWebSelectionType implements COMEnum {
    
    /**@ All tables */
    xlAllTables(2),    
    /**@ Entire page */
    xlEntirePage(1),    
    /**@ Specified tables */
    xlSpecifiedTables(3);

    private final long value;

    XlWebSelectionType(long value) {
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
