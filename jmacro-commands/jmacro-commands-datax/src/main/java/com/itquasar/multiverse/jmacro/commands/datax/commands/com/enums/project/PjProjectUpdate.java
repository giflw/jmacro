package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjprojectupdate">https://docs.microsoft.com/en-us/office/vba/api/project.pjprojectupdate</a>}
*/
public enum PjProjectUpdate implements COMEnum {
    
    /**@ Sets only the Actual Start and Actual Finish dates. */
    pj0or100Percent(0),    
    /**@ Sets the percent complete to reflect the update date. */
    pj0to100Percent(1),    
    /**@ Schedules the remainder of the work to start on the update date. */
    pjReschedule(2);

    private final long value;

    PjProjectUpdate(long value) {
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
