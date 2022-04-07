package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjteamstatuscompletedwork">https://docs.microsoft.com/en-us/office/vba/api/project.pjteamstatuscompletedwork</a>}
*/
public enum PjTeamStatusCompletedWork implements COMEnum {
    
    /**@ Report work by day. */
    pjBrokenDownByDay(1),    
    /**@ Report work by week. */
    pjBrokenDownByWeek(2),    
    /**@ Report total work for the entire period. */
    pjTotalForEntirePeriod(0);

    private final long value;

    PjTeamStatusCompletedWork(long value) {
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
