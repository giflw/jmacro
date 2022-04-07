package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjscheduleprojectfrom">https://docs.microsoft.com/en-us/office/vba/api/project.pjscheduleprojectfrom</a>}
*/
public enum PjScheduleProjectFrom implements COMEnum {
    
    /**@ Schedule project from finish. */
    pjProjectFinish(2),    
    /**@ Schedule project from start. */
    pjProjectStart(1);

    private final long value;

    PjScheduleProjectFrom(long value) {
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
