package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpieslicelocation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpieslicelocation</a>}
*/
public enum XlPieSliceLocation implements COMEnum {
    
    /**@ The horizontal coordinate (x) */
    xlHorizontalCoordinate(1),    
    /**@ The vertical coordinate (y) */
    xlVerticalCoordinate(2);

    private final long value;

    XlPieSliceLocation(long value) {
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
