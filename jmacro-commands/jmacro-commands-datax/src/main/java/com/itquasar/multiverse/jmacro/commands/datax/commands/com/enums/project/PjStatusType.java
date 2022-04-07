package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjstatustype">https://docs.microsoft.com/en-us/office/vba/api/project.pjstatustype</a>}
*/
public enum PjStatusType implements COMEnum {
    
    /**@ Task complete. */
    pjComplete(0),    
    /**@ Task for future. */
    pjFutureTask(3),    
    /**@ Task late. */
    pjLate(2),    
    /**@ Status not available. */
    pjNoData(4),    
    /**@ Task on schedule. */
    pjOnSchedule(1);

    private final long value;

    PjStatusType(long value) {
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
