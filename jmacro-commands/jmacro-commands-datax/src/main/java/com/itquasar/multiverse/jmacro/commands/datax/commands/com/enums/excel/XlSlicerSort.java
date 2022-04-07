package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlslicersort">https://docs.microsoft.com/en-us/office/vba/api/excel.xlslicersort</a>}
*/
public enum XlSlicerSort implements COMEnum {
    
    /**@ Slicer items are sorted in ascending order by item captions. */
    xlSlicerSortAscending(2),    
    /**@ Slicer items are displayed in the order provided by the data source. */
    xlSlicerSortDataSourceOrder(1),    
    /**@ Slicer items are sorted in descending order by item captions. */
    xlSlicerSortDescending(3);

    private final long value;

    XlSlicerSort(long value) {
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
