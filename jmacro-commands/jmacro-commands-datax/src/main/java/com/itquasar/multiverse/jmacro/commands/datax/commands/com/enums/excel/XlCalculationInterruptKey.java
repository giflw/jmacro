package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcalculationinterruptkey">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcalculationinterruptkey</a>}
*/
public enum XlCalculationInterruptKey implements COMEnum {
    
    /**@ Pressing any key interrupts recalculation. */
    xlAnyKey(2),    
    /**@ Pressing the ESC key interrupts recalculation. */
    xlEscKey(1),    
    /**@ No key press can interrupt recalculation. */
    xlNoKey(0);

    private final long value;

    XlCalculationInterruptKey(long value) {
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
