package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjassignmentunits">https://docs.microsoft.com/en-us/office/vba/api/project.pjassignmentunits</a>}
*/
public enum PjAssignmentUnits implements COMEnum {
    
    /**@ Decimal. */
    pjDecimalAssignmentUnits(1),    
    /**@ Percentage. */
    pjPercentageAssignmentUnits(0);

    private final long value;

    PjAssignmentUnits(long value) {
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
