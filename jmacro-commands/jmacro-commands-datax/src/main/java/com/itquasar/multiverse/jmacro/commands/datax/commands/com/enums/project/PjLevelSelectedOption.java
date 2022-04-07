package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjlevelselectedoption">https://docs.microsoft.com/en-us/office/vba/api/project.pjlevelselectedoption</a>}
*/
public enum PjLevelSelectedOption implements COMEnum {
    
    /**@ Resolve leveling for the resource. */
    pjResolveForResource(1),    
    /**@ Resolve leveling for the selected resources. */
    pjResolveForSelectedResources(3),    
    /**@ Resolve leveling for the next available time. */
    pjResolveNextAvailableTime(2),    
    /**@ Resolve leveling for the selected tasks. */
    pjResolveSelectedTasks(0);

    private final long value;

    PjLevelSelectedOption(long value) {
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
