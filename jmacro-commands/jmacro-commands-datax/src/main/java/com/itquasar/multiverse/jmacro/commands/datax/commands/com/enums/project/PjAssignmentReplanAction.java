package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjassignmentreplanaction">https://docs.microsoft.com/en-us/office/vba/api/project.pjassignmentreplanaction</a>}
*/
public enum PjAssignmentReplanAction implements COMEnum {
    
    /**@ Constrain assignments to the maximum units by decreasing work. */
    pjConstrainToMaxUnitsByDecreasingWork(1),    
    /**@ Constrain assignments to the maximum units by increasing duration. */
    pjConstrainToMaxUnitsByIncreasingDuration(0);

    private final long value;

    PjAssignmentReplanAction(long value) {
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
