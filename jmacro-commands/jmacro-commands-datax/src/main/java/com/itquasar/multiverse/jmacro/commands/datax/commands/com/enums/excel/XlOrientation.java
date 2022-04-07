package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlorientation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlorientation</a>}
*/
public enum XlOrientation implements COMEnum {
    
    /**@ Text runs downward. */
    xlDownward(-4170),    
    /**@ Text runs horizontally. */
    xlHorizontal(-4128),    
    /**@ Text runs upward. */
    xlUpward(-4171),    
    /**@ Text runs downward and is centered in the cell. */
    xlVertical(-4166);

    private final long value;

    XlOrientation(long value) {
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
