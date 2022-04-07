package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlobjectsize">https://docs.microsoft.com/en-us/office/vba/api/excel.xlobjectsize</a>}
*/
public enum XlObjectSize implements COMEnum {
    
    /**@ Print the chart as large as possible, while retaining the chart's height-to-width ratio as shown on the screen. */
    xlFitToPage(2),    
    /**@ Print the chart to fit the page, adjusting the height-to-width ratio as necessary. */
    xlFullPage(3),    
    /**@ Print the chart the same size as it appears on the screen. */
    xlScreenSize(1);

    private final long value;

    XlObjectSize(long value) {
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
