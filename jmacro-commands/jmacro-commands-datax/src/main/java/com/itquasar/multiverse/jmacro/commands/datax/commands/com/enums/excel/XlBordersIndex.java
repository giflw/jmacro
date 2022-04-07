package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlbordersindex">https://docs.microsoft.com/en-us/office/vba/api/excel.xlbordersindex</a>}
*/
public enum XlBordersIndex implements COMEnum {
    
    /**@ Border running from the upper-left corner to the lower-right of each cell in the range. */
    xlDiagonalDown(5),    
    /**@ Border running from the lower-left corner to the upper-right of each cell in the range. */
    xlDiagonalUp(6),    
    /**@ Border at the bottom of the range. */
    xlEdgeBottom(9),    
    /**@ Border at the left edge of the range. */
    xlEdgeLeft(7),    
    /**@ Border at the right edge of the range. */
    xlEdgeRight(10),    
    /**@ Border at the top of the range. */
    xlEdgeTop(8),    
    /**@ Horizontal borders for all cells in the range except borders on the outside of the range. */
    xlInsideHorizontal(12),    
    /**@ Vertical borders for all the cells in the range except borders on the outside of the range. */
    xlInsideVertical(11);

    private final long value;

    XlBordersIndex(long value) {
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
