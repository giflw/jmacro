package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjtextitem">https://docs.microsoft.com/en-us/office/vba/api/project.pjtextitem</a>}
*/
public enum PjTextItem implements COMEnum {
    
    /**@ Represents the All text item. */
    pjAll(0),    
    /**@ Represents the Allocated text item. */
    pjAllocated(1),    
    /**@ Represents the Bar Text Bottom text item. */
    pjBarTextBottom(14),    
    /**@ Represents the Bar Text Inside text item. */
    pjBarTextInside(15),    
    /**@ Represents the Bar Text Left text item. */
    pjBarTextLeft(11),    
    /**@ Represents the Bar Text Right text item. */
    pjBarTextRight(12),    
    /**@ Represents the Bar Text Top text item. */
    pjBarTextTop(13),    
    /**@ Represents the Calendar External Task text item. */
    pjCalendarExternalTask(17),    
    /**@ Represents the Calendar Monthly Titles text item. */
    pjCalendarMonthlyTitles(8),    
    /**@ Represents the Critical text item. */
    pjCritical(2),    
    /**@ Represents the Daily Titles text item. */
    pjDailyTitles(9),    
    /**@ Represents the Date Box Bottom Left text item. */
    pjDateBoxBottomLeft(15),    
    /**@ Represents the Date Box Bottom Right text item. */
    pjDateBoxBottomRight(14),    
    /**@ Represents the Date Box Top Left text item. */
    pjDateBoxTopLeft(13),    
    /**@ Represents the Date Box Top Right text item. */
    pjDateBoxTopRight(12),    
    /**@ Represents the Gantt External Task text item. */
    pjGanttExternalTask(16),    
    /**@ Represents the Gantt Major Timescale text item. */
    pjGanttMajorTimescale(9),    
    /**@ Represents the Gantt Minor Timescale text item. */
    pjGanttMinorTimescale(10),    
    /**@ Represents the Graph Major Timescale text item. */
    pjGraphMajorTimescale(3),    
    /**@ Represents the Graph Minor Timescale text item. */
    pjGraphMinorTimescale(4),    
    /**@ Represents the Legend Labels text item. */
    pjLegendLabels(6),    
    /**@ Represents the Marked text item. */
    pjMarked(6),    
    /**@ Represents the Milestone text item. */
    pjMilestone(3),    
    /**@ Represents the Month Previews text item. */
    pjMonthPreviews(11),    
    /**@ Represents the Noncritical text item. */
    pjNoncritical(1),    
    /**@ Represents the Overallocated text item. */
    pjOverallocated(2),    
    /**@ Represents the Project Summary text item. */
    pjProjectSummary(5),    
    /**@ Represents the Resource Filter Highlight text item. */
    pjResourceFilterHighlight(3),    
    /**@ Represents the Resource Major Timescale text item. */
    pjResourceMajorTimescale(6),    
    /**@ Represents the Resource Minor Timescale text item. */
    pjResourceMinorTimescale(7),    
    /**@ Represents the Resource Row Column Titles text item. */
    pjResourceRowColumnTitles(4),    
    /**@ Represents the Resource Usage Assignment Row text item. */
    pjResourceUsageAssignmentRow(5),    
    /**@ Represents the Summary text item. */
    pjSummary(4),    
    /**@ Represents the Task Filter Highlight text item. */
    pjTaskFilterHighlight(7),    
    /**@ Represents the Task Major Timescale text item. */
    pjTaskMajorTimescale(10),    
    /**@ Represents the Task Minor Timescale text item. */
    pjTaskMinorTimescale(11),    
    /**@ Represents the Task Row Column Titles text item. */
    pjTaskRowColumnTitles(8),    
    /**@ Represents the Task Sheet External Task text item. */
    pjTaskSheetExternalTask(9),    
    /**@ Represents the Task Usage Assignment Row text item. */
    pjTaskUsageAssignmentRow(9),    
    /**@ Represents the Task Usage External Task text item. */
    pjTaskUsageExternalTask(11),    
    /**@ Represents the Tick Labels text item. */
    pjTickLabels(5),    
    /**@ Represents the Weekly Titles text item. */
    pjWeeklyTitles(10);

    private final long value;

    PjTextItem(long value) {
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
