package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldatabaraxisposition">https://docs.microsoft.com/en-us/office/vba/api/excel.xldatabaraxisposition</a>}
*/
public enum XlDataBarAxisPosition implements COMEnum {
    
    /**@ Display the axis at a variable position based on the ratio of the minimum negative value to the maximum positive value in the range. Positive values are displayed in a left-to-right direction. Negative values are displayed in a right-to-left direction. When all values are positive or all values are negative, no axis is displayed. */
    xlDataBarAxisAutomatic(0),    
    /**@ Display the axis at the midpoint of the cell regardless of the set of values in the range. Positive values are displayed in a left-to-right direction. Negative values are displayed in a right-to-left direction. */
    xlDataBarAxisMidpoint(1),    
    /**@ No axis is displayed, and both positive and negative values are displayed in the left-to-right direction. */
    xlDataBarAxisNone(2);

    private final long value;

    XlDataBarAxisPosition(long value) {
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
