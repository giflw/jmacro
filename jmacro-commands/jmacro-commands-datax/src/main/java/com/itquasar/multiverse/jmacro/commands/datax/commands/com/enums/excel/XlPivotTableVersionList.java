package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivottableversionlist">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivottableversionlist</a>}
*/
public enum XlPivotTableVersionList implements COMEnum {
    
    /**@ Excel 2000 */
    xlPivotTableVersion2000(0),    
    /**@ Excel 2002 */
    xlPivotTableVersion10(1),    
    /**@ Excel 2003 */
    xlPivotTableVersion11(2),    
    /**@ Excel 2007 */
    xlPivotTableVersion12(3),    
    /**@ Excel 2010 */
    xlPivotTableVersion14(4),    
    /**@ Excel 2013 */
    xlPivotTableVersion15(5),    
    /**@ Provided only for backward compatibility */
    xlPivotTableVersionCurrent(-1);

    private final long value;

    XlPivotTableVersionList(long value) {
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
