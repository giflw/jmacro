package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjbaritem">https://docs.microsoft.com/en-us/office/vba/api/project.pjbaritem</a>}
*/
public enum PjBarItem implements COMEnum {
    
    /**@ Critical bar item. */
    pjBarCritical(1),    
    /**@ External task bar item. */
    pjBarExternalTask(8),    
    /**@ Highlighted bar item. */
    pjBarHighlighted(6),    
    /**@ Marked bar item. */
    pjBarMarked(5),    
    /**@ Milestone bar item. */
    pjBarMilestone(3),    
    /**@ Noncritical bar item. */
    pjBarNoncritical(0),    
    /**@ Project summary bar item. */
    pjBarProjectSummary(7),    
    /**@ Summary bar item. */
    pjBarSummary(2);

    private final long value;

    PjBarItem(long value) {
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
