package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjviewtype">https://docs.microsoft.com/en-us/office/vba/api/project.pjviewtype</a>}
*/
public enum PjViewType implements COMEnum {
    
    /**@ The view is undefined. */
    pjViewUndefined(-1),    
    /**@ Bar Rollup view. */
    pjViewBarRollup(0),    
    /**@ Calendar view. */
    pjViewCalendar(1),    
    /**@ Descriptive Network Diagram view. */
    pjViewDescriptiveNetworkDiagram(2),    
    /**@ Detail Gantt view. */
    pjViewDetailGantt(3),    
    /**@ Gantt Chart view. */
    pjViewGantt(4),    
    /**@ Gantt with Timeline view. */
    pjViewGanttWithTimeline(5),    
    /**@ Leveling Gantt view. */
    pjViewLevelingGantt(6),    
    /**@ Milestone Date Rollup view. */
    pjViewMilestoneDateRollup(7),    
    /**@ Milestone Rollup view. */
    pjViewMilestoneRollup(8),    
    /**@ Multiple Baselines Gantt view. */
    pjViewMultipleBaselinesGantt(9),    
    /**@ Network Diagram view. */
    pjViewNetworkDiagram(10),    
    /**@ Relationship Diagram view. */
    pjViewRelationshipDiagram(11),    
    /**@ Resource Allocation view. */
    pjViewResourceAllocation(12),    
    /**@ Resource Form view. */
    pjViewResourceForm(13),    
    /**@ Resource Graph View. */
    pjViewResourceGraph(14),    
    /**@ Resource Name Form view. */
    pjViewResourceNameForm(15),    
    /**@ Team Planner view. */
    pjViewResourceSchedulingView(16),    
    /**@ Resource Sheet view. */
    pjViewResourceSheet(17),    
    /**@ Resource Usage view. */
    pjViewResourceUsage(18),    
    /**@ Task Details Form view. */
    pjViewTaskDetailsForm(20),    
    /**@ Task Entry view. */
    pjViewTaskEntry(21),    
    /**@ Task Form view. */
    pjViewTaskForm(19),    
    /**@ Task Name Form view. */
    pjViewTaskNameForm(22),    
    /**@ Task Sheet view. */
    pjViewTaskSheet(23),    
    /**@ Task Usage view. */
    pjViewTaskUsage(24),    
    /**@ Timeline view. */
    pjViewTimeline(25),    
    /**@ Tracking Gantt view. */
    pjViewTrackingGantt(26);

    private final long value;

    PjViewType(long value) {
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
