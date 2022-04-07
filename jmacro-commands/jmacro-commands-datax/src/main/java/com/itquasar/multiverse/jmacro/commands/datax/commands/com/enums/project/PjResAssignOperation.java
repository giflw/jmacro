package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjresassignoperation">https://docs.microsoft.com/en-us/office/vba/api/project.pjresassignoperation</a>}
*/
public enum PjResAssignOperation implements COMEnum {
    
    /**@ Assigns the specified resources to the selected tasks. */
    pjAssign(0),    
    /**@ Changes the resource units for the specified resource. This constant can be used only for a single resource. */
    pjChange(3),    
    /**@ Removes the specified resources from the selected tasks. */
    pjRemove(1),    
    /**@ The resources specified with With replace the resources specified with Resources. */
    pjReplace(2);

    private final long value;

    PjResAssignOperation(long value) {
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
