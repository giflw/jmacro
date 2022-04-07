package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjfieldtypes">https://docs.microsoft.com/en-us/office/vba/api/project.pjfieldtypes</a>}
*/
public enum PjFieldTypes implements COMEnum {
    
    /**@ Cost custom field. */
    pjCostField(0),    
    /**@ Date custom field. */
    pjDateField(1),    
    /**@ Duration custom field. */
    pjDurationField(2),    
    /**@ Finish date custom field. */
    pjFinishField(4),    
    /**@ Flag custom field. */
    pjFlagField(3),    
    /**@ Number custom field. */
    pjNumberField(5),    
    /**@ Start date custom field. */
    pjStartField(6),    
    /**@ Text custom field. */
    pjTextField(7);

    private final long value;

    PjFieldTypes(long value) {
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
