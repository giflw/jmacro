package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlmodelchangesource">https://docs.microsoft.com/en-us/office/vba/api/excel.xlmodelchangesource</a>}
*/
public enum XlModelChangeSource implements COMEnum {
    
    /**@ Excel */
    xlChangeByExcel(0),    
    /**@ PowerPivot add-in */
    xlChangeByPowerPivotAddIn(1);

    private final long value;

    XlModelChangeSource(long value) {
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
