package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddeletecells">https://docs.microsoft.com/en-us/office/vba/api/word.wddeletecells</a>}
*/
public enum WdDeleteCells implements COMEnum {
    
    /**@ Delete the entire column of cells from the table. */
    wdDeleteCellsEntireColumn(3),    
    /**@ Delete the entire row of cells from the table. */
    wdDeleteCellsEntireRow(2),    
    /**@ Shift remaining cells left in the row where the deletion occurred after a cell or range of cells has been deleted. */
    wdDeleteCellsShiftLeft(0),    
    /**@ Shift remaining cells up in the column where the deletion occurred after a cell or range of cells has been deleted. */
    wdDeleteCellsShiftUp(1);

    private final long value;

    WdDeleteCells(long value) {
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
