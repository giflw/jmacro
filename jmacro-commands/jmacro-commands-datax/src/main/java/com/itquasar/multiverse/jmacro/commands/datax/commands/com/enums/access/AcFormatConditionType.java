package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acformatconditiontype">https://docs.microsoft.com/en-us/office/vba/api/access.acformatconditiontype</a>}
*/
public enum AcFormatConditionType implements COMEnum {
    
    /**@ The conditional format is displayed as a data bar. */
    acDataBar(3),    
    /**@ The conditional format is based on an expression. */
    acExpression(1),    
    /**@ The conditional format is based on the value of the control that has focus on a form. */
    acFieldHasFocus(2),    
    /**@ The conditional format is based on values in the selected control. */
    acFieldValue(0);

    private final long value;

    AcFormatConditionType(long value) {
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
