package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjtaskwarnings">https://docs.microsoft.com/en-us/office/vba/api/project.pjtaskwarnings</a>}
*/
public enum PjTaskWarnings implements COMEnum {
    
    /**@ The assignment is in overallocated non-working time. */
    pjTaskWarningAssnOverallocatedInNonWorkingTime(16384),    
    /**@ The assignment is more than the maximum resource units available. */
    pjTaskWarningResourceBeyondMaxUnit(64),    
    /**@ The resource is overallocated. */
    pjTaskWarningResourceOverallocated(128),    
    /**@ The shadow task has a different date. */
    pjTaskWarningShadowDateDifferent(1024),    
    /**@ The shadow task finishes earlier because of a predecessor link. */
    pjTaskWarningShadowFinishesEarlierDueToLink(2),    
    /**@ The shadow task finishes later because of a predecessor link. */
    pjTaskWarningShadowFinishesLaterDueToLink(1),    
    /**@ The shadow task is incorrect because of a constraint. */
    pjTaskWarningShadowIncorrectByConstraintOnly(256),    
    /**@ The shadow task is incorrect because of a leveling delay. */
    pjTaskWarningShadowIncorrectByLevelingDelayOnly(512),    
    /**@ The subtask finishes after the parent task. */
    pjTaskWarningSubTaskFinishingAfterParentFinish(16),    
    /**@ The subtask starts after the parent task starts. */
    pjTaskWarningSubTaskStartingAfterParentStart(8),    
    /**@ The subtask starts before the parent task. */
    pjTaskWarningSubTaskStartingBeforeParentStart(4),    
    /**@ The finish date of the summary task is inconsistent. */
    pjTaskWarningSummaryInconsistentFinish(2048),    
    /**@ The start date of the summary task is inconsistent. */
    pjTaskWarningSummaryInconsistentStart(32),    
    /**@ The finish date of the task is in non-working time. */
    pjTaskWarningTaskFinishingInNonWorkingTime(8192),    
    /**@ The start date of the task is in non-working time. */
    pjTaskWarningTaskStartingInNonWorkingTime(4096);

    private final long value;

    PjTaskWarnings(long value) {
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
