package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdinsertcells">https://docs.microsoft.com/en-us/office/vba/api/word.wdinsertcells</a>}
*/
public enum WdInsertCells implements COMEnum {
    
    /**@ Inserts an entire column to the left of the column that contains the selection. */
    wdInsertCellsEntireColumn(3),    
    /**@ Inserts an entire row above the row that contains the selection. */
    wdInsertCellsEntireRow(2),    
    /**@ Inserts new cells above the selected cells. */
    wdInsertCellsShiftDown(1),    
    /**@ Insert new cells to the left of the selected cells. */
    wdInsertCellsShiftRight(0);

    private final long value;

    WdInsertCells(long value) {
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
