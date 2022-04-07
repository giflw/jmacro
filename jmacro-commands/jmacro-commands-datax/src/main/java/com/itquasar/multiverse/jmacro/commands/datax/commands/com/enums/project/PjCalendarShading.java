package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcalendarshading">https://docs.microsoft.com/en-us/office/vba/api/project.pjcalendarshading</a>}
*/
public enum PjCalendarShading implements COMEnum {
    
    /**@ In a base calendar, working days for which the working hours differ from the default working hours. */
    pjBaseNondefaultWorking(2),    
    /**@ Nonworking days in a base calendar. */
    pjBaseNonworking(1),    
    /**@ Working days in a base calendar. */
    pjBaseWorking(0),    
    /**@ In a resource calendar, working days for which the working hours are different from the default working hours. */
    pjResourceNondefaultWorking(5),    
    /**@ Nonworking days in a resource calendar. */
    pjResourceNonworking(4),    
    /**@ Working days in a resource calendar. */
    pjResourceWorking(3);

    private final long value;

    PjCalendarShading(long value) {
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
