package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjboxset">https://docs.microsoft.com/en-us/office/vba/api/project.pjboxset</a>}
*/
public enum PjBoxSet implements COMEnum {
    
    /**@ Selects the task, retaining any existing selection. */
    pjBoxAddToSelection(0),    
    /**@ Creates a new task, clearing any existing selection. */
    pjBoxCreate(1),    
    /**@ Positions the task relative to the upper-left corner of the view. If more than one task is selected and TaskID is not specified, all selected tasks are moved. If TaskID is specified, the selection is cleared and only that task is moved. */
    pjBoxMoveAbsolute(2),    
    /**@ Positions the task relative to its current position. If more than one task is selected and TaskID is not specified, all selected tasks are moved. If TaskID is specified, the selection is cleared and only that task is moved. */
    pjBoxMoveRelative(3),    
    /**@ Selects the task, clearing any existing selection. */
    pjBoxSelect(4),    
    /**@ Removes the task from the selection. If more than one task is selected and TaskID is not specified, the box with focus is removed from the selection. If TaskID is specified, only that task is removed from the selection. */
    pjBoxUnselect(5);

    private final long value;

    PjBoxSet(long value) {
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
