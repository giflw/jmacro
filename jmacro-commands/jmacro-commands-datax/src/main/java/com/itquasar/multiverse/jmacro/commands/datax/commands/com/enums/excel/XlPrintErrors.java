package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlprinterrors">https://docs.microsoft.com/en-us/office/vba/api/excel.xlprinterrors</a>}
*/
public enum XlPrintErrors implements COMEnum {
    
    /**@ Print errors are blank. */
    xlPrintErrorsBlank(1),    
    /**@ Print errors are displayed as dashes. */
    xlPrintErrorsDash(2),    
    /**@ All print errors are displayed. */
    xlPrintErrorsDisplayed(0),    
    /**@ Print errors are displayed as not available. */
    xlPrintErrorsNA(3);

    private final long value;

    XlPrintErrors(long value) {
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
