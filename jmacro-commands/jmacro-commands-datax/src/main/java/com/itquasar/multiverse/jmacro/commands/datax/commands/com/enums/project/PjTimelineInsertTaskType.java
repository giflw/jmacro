package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjtimelineinserttasktype">https://docs.microsoft.com/en-us/office/vba/api/project.pjtimelineinserttasktype</a>}
*/
public enum PjTimelineInsertTaskType implements COMEnum {
    
    /**@ Insert a callout task, where the task information is shown in a callout box attached to the timeline. */
    pjTimelineInsertCalloutTask(2),    
    /**@ Insert a milestone (a task with 0 days duration). */
    pjTimelineInsertMilestone(1),    
    /**@ Insert a task. */
    pjTimelineInsertTask(0);

    private final long value;

    PjTimelineInsertTaskType(long value) {
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
