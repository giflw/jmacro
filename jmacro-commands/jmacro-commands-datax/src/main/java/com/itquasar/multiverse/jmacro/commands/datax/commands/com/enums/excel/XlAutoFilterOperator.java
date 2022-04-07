package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlautofilteroperator">https://docs.microsoft.com/en-us/office/vba/api/excel.xlautofilteroperator</a>}
*/
public enum XlAutoFilterOperator implements COMEnum {
    
    /**@ Logical AND of Criteria1 and Criteria2 */
    xlAnd(1),    
    /**@ Lowest-valued items displayed (number of items specified in Criteria1) */
    xlBottom10Items(4),    
    /**@ Lowest-valued items displayed (percentage specified in Criteria1) */
    xlBottom10Percent(6),    
    /**@ Color of the cell */
    xlFilterCellColor(8),    
    /**@ Dynamic filter */
    xlFilterDynamic(11),    
    /**@ Color of the font */
    xlFilterFontColor(9),    
    /**@ Filter icon */
    xlFilterIcon(10),    
    /**@ Filter values */
    xlFilterValues(7),    
    /**@ Logical OR of Criteria1 or Criteria2 */
    xlOr(2),    
    /**@ Highest-valued items displayed (number of items specified in Criteria1) */
    xlTop10Items(3),    
    /**@ Highest-valued items displayed (percentage specified in Criteria1) */
    xlTop10Percent(5);

    private final long value;

    XlAutoFilterOperator(long value) {
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
