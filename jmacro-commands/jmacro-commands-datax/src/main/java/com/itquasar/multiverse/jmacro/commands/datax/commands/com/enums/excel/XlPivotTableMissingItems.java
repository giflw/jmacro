package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivottablemissingitems">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivottablemissingitems</a>}
*/
public enum XlPivotTableMissingItems implements COMEnum {
    
    /**@ The default number of unique items per PivotField allowed. */
    xlMissingItemsDefault(-1),    
    /**@ The maximum number of unique items per PivotField allowed (32,500) for a pre-Excel 2007 PivotTable. */
    xlMissingItemsMax(32500),    
    /**@ The maximum number of unique items per PivotField allowed (1,048,576) for PivotTables in Excel 2007 and later. */
    xlMissingItemsMax2(1048576),    
    /**@ No unique items per PivotField allowed (zero). */
    xlMissingItemsNone(0);

    private final long value;

    XlPivotTableMissingItems(long value) {
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
