package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlslicercrossfiltertype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlslicercrossfiltertype</a>}
*/
public enum XlSlicerCrossFilterType implements COMEnum {
    
    /**@ Cross filtering is turned on for this slicer cache, any tile with no data for a filtering selection in other slicers connected to the same data source will be dimmed. Additionally, buttons will be hidden. */
    xlSlicerCrossFilterHideButtonsWithNoData(4),    
    /**@ Cross filtering is turned on for this slicer cache, any tile with no data for a filtering selection in other slicers connected to the same data source will be dimmed. Additionally, tiles with data are moved to the top in the slicer. (Default) */
    xlSlicerCrossFilterShowItemsWithDataAtTop(2),    
    /**@ Cross filtering is turned on for this slicer cache, any tile with no data for a filtering selection in other slicers connected to the same data source will be dimmed. */
    xlSlicerCrossFilterShowItemsWithNoData(3),    
    /**@ Cross filtering is turned off entirely, so all tiles are displayed and active (not dimmed) regardless of filtering selections in other slicers. */
    xlSlicerNoCrossFilter(1);

    private final long value;

    XlSlicerCrossFilterType(long value) {
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
