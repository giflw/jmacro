package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlwindowtype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlwindowtype</a>}
*/
public enum XlWindowType implements COMEnum {
    
    /**@ The chart will open in a new window. */
    xlChartAsWindow(5),    
    /**@ The chart will be displayed on the current worksheet. */
    xlChartInPlace(4),    
    /**@ The chart is copied to the clipboard. */
    xlClipboard(3),    
    /**@ This constant has been deprecated. */
    xlInfo(-4129),    
    /**@ This constant applies to Macintosh only. */
    xlWorkbook(1);

    private final long value;

    XlWindowType(long value) {
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
