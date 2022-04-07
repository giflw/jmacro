package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjboxstyle">https://docs.microsoft.com/en-us/office/vba/api/project.pjboxstyle</a>}
*/
public enum PjBoxStyle implements COMEnum {
    
    /**@ Critical style. */
    pjBoxCritical(0),    
    /**@ Critical external task style. */
    pjBoxCriticalExternalTask(10),    
    /**@ Critical inserted project style. */
    pjBoxCriticalInsertedProject(6),    
    /**@ Critical marked style. */
    pjBoxCriticalMarked(8),    
    /**@ Critical milestone style. */
    pjBoxCriticalMilestone(2),    
    /**@ Critical summary style. */
    pjBoxCriticalSummary(4),    
    /**@ Highlighted tasks style. */
    pjBoxHighlightedTasks(13),    
    /**@ Noncritical style. */
    pjBoxNoncritical(1),    
    /**@ Noncritical external task style. */
    pjBoxNoncriticalExternalTask(11),    
    /**@ Noncritical inserted project style. */
    pjBoxNoncriticalInsertedProject(7),    
    /**@ Noncritical marked style. */
    pjBoxNoncriticalMarked(9),    
    /**@ Noncritical milestone style. */
    pjBoxNoncriticalMilestone(3),    
    /**@ Noncritical summary style. */
    pjBoxNoncriticalSummary(5),    
    /**@ Project summary task style. */
    pjBoxProjectSummaryTask(12);

    private final long value;

    PjBoxStyle(long value) {
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
