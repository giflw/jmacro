package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjoverallocationtype">https://docs.microsoft.com/en-us/office/vba/api/project.pjoverallocationtype</a>}
*/
public enum PjOverallocationType implements COMEnum {
    
    /**@ The resource allocation is above the maximum resource units. */
    pjOverallocationTypeAboveMaxUnits(1),    
    /**@ There is no overallocation. */
    pjOverallocationTypeNone(0),    
    /**@ The resource is allocated in nonworking time. */
    pjOverallocationTypeWorkingInNonWorkingTime(2),    
    /**@ The resource is working on other tasks. */
    pjOverallocationTypeWorkingOnOtherTasks(3);

    private final long value;

    PjOverallocationType(long value) {
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
