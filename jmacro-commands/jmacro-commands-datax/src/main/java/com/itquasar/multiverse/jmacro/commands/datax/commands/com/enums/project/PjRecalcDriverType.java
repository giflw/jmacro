package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjrecalcdrivertype">https://docs.microsoft.com/en-us/office/vba/api/project.pjrecalcdrivertype</a>}
*/
public enum PjRecalcDriverType implements COMEnum {
    
    /**@ The task driver is actual work. */
    pjDriverActuals(1),    
    /**@ The task driver is a resource calendar. */
    pjDriverCalendar(32),    
    /**@ The task driver is a child task. */
    pjDriverChildTask(64),    
    /**@ The task driver is a task constraint. */
    pjDriverConstraint(4),    
    /**@ The task driver is a leveling delay. */
    pjDriverLevelingDelay(2),    
    /**@ The task driver is the parent task. */
    pjDriverParentTask(128),    
    /**@ The task driver is a predecessor task. */
    pjDriverPredecessor(8),    
    /**@ The task driver is the project start date. */
    pjDriverProjectStart(16);

    private final long value;

    PjRecalcDriverType(long value) {
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
