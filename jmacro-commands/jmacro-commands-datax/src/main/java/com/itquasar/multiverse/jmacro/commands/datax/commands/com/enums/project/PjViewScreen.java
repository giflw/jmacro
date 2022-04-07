package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjviewscreen">https://docs.microsoft.com/en-us/office/vba/api/project.pjviewscreen</a>}
*/
public enum PjViewScreen implements COMEnum {
    
    /**@ Calendar view. */
    pjCalendar(13),    
    /**@ Gantt view. */
    pjGantt(1),    
    /**@ Network Diagram view. */
    pjNetworkDiagram(2),    
    /**@ Relationship Diagram view. */
    pjRelationshipDiagram(3),    
    /**@ Resource Form view. */
    pjResourceForm(6),    
    /**@ Resource Graph view. */
    pjResourceGraph(8),    
    /**@ Resource Name Form view. */
    pjResourceNameForm(12),    
    /**@ Team Planner view. */
    pjResourceScheduling(17),    
    /**@ Resource Sheet view. */
    pjResourceSheet(7),    
    /**@ Resource Usage view. */
    pjResourceUsage(15),    
    /**@ Do not use this view. */
    pjRSVDoNotUse(9),    
    /**@ Task Details Form view. */
    pjTaskDetailsForm(10),    
    /**@ Task Form view. */
    pjTaskForm(4),    
    /**@ Task Name Form view. */
    pjTaskNameForm(11),    
    /**@ Task Sheet view. */
    pjTaskSheet(5),    
    /**@ Task Usage view. */
    pjTaskUsage(14),    
    /**@ Timeline view. */
    pjTimeline(16);

    private final long value;

    PjViewScreen(long value) {
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
