package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjnewtasksstartondate">https://docs.microsoft.com/en-us/office/vba/api/project.pjnewtasksstartondate</a>}
*/
public enum PjNewTasksStartOnDate implements COMEnum {
    
    /**@ New tasks start on the current date. */
    pjCurrentDate(1),    
    /**@ New tasks start on no specified date. */
    pjNoDate(2),    
    /**@ New tasks start on the project start date. */
    pjProjectDate(0);

    private final long value;

    PjNewTasksStartOnDate(long value) {
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
