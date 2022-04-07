package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlchartlocation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlchartlocation</a>}
*/
public enum XlChartLocation implements COMEnum {
    
    /**@ Chart is moved to a new sheet. */
    xlLocationAsNewSheet(1),    
    /**@ Chart is to be embedded in an existing sheet. */
    xlLocationAsObject(2),    
    /**@ Excel controls chart location. */
    xlLocationAutomatic(3);

    private final long value;

    XlChartLocation(long value) {
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
