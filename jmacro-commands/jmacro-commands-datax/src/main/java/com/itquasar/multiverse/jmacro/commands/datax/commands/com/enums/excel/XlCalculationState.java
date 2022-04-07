package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcalculationstate">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcalculationstate</a>}
*/
public enum XlCalculationState implements COMEnum {
    
    /**@ Calculations in process. */
    xlCalculating(1),    
    /**@ Calculations complete. */
    xlDone(0),    
    /**@ Changes that trigger calculation have been made, but a recalculation has not yet been performed. */
    xlPending(2);

    private final long value;

    XlCalculationState(long value) {
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
