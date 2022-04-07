package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlforecastdatacompletion">https://docs.microsoft.com/en-us/office/vba/api/excel.xlforecastdatacompletion</a>}
*/
public enum XlForecastDataCompletion implements COMEnum {
    
    /**@ No description provided */
    xlForecastDataCompletionZeros(0);

    private final long value;

    XlForecastDataCompletion(long value) {
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
