package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlformatconditionoperator">https://docs.microsoft.com/en-us/office/vba/api/excel.xlformatconditionoperator</a>}
*/
public enum XlFormatConditionOperator implements COMEnum {
    
    /**@ Between. Can be used only if two formulas are provided. */
    xlBetween(1),    
    /**@ Equal. */
    xlEqual(3),    
    /**@ Greater than. */
    xlGreater(5),    
    /**@ Greater than or equal to. */
    xlGreaterEqual(7),    
    /**@ Less than. */
    xlLess(6),    
    /**@ Less than or equal to. */
    xlLessEqual(8),    
    /**@ Not between. Can be used only if two formulas are provided. */
    xlNotBetween(2),    
    /**@ Not equal. */
    xlNotEqual(4);

    private final long value;

    XlFormatConditionOperator(long value) {
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
