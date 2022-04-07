package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcellchangedstate">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcellchangedstate</a>}
*/
public enum XlCellChangedState implements COMEnum {
    
    /**@ The value in the cell has been edited or recalculated, and that change has been applied to the data source. (Applies only PivotTable reports with OLAP data sources) */
    xlCellChangeApplied(3),    
    /**@ The value in the cell has been edited or recalculated. */
    xlCellChanged(2),    
    /**@ The value in the cell has not been edited or recalculated. */
    xlCellNotChanged(1);

    private final long value;

    XlCellChangedState(long value) {
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
