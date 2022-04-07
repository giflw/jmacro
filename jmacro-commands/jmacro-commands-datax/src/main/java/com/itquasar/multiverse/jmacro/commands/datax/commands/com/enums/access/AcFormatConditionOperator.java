package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acformatconditionoperator">https://docs.microsoft.com/en-us/office/vba/api/access.acformatconditionoperator</a>}
*/
public enum AcFormatConditionOperator implements COMEnum {
    
    /**@ The value must be between the values specified by the Expression1 and Expression2 arguments. */
    acBetween(0),    
    /**@ The value must equal to the value specified by the Expression1 argument. */
    acEqual(2),    
    /**@ The value must be greater than the value specified by the Expression1 argument. */
    acGreaterThan(4),    
    /**@ The value must be greater than or equal to the value specified by the Expression1 argument. */
    acGreaterThanOrEqual(6),    
    /**@ The value must be less than the value specified by the Expression1 argument. */
    acLessThan(5),    
    /**@ The value must be less than or equal to the value specified by the Expression1 argument. */
    acLessThanOrEqual(7),    
    /**@ The value must not be between the values specified by the Expression1 and Expression2 arguments. */
    acNotBetween(1),    
    /**@ The value must not be equal to the value specified by the Expression1 argument. */
    acNotEqual(3);

    private final long value;

    AcFormatConditionOperator(long value) {
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
