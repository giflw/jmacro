package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjteamplannerstyle">https://docs.microsoft.com/en-us/office/vba/api/project.pjteamplannerstyle</a>}
*/
public enum PjTeamPlannerStyle implements COMEnum {
    
    /**@ Set the Actual Work style in the Team Planner. */
    pjTPActualWork(1),    
    /**@ Set the Late Task style in the Team Planner. */
    pjTPLateTask(3),    
    /**@ Set the Manually Scheduled style in the Team Planner. */
    pjTPManualTask(4),    
    /**@ Set the Auto Scheduled style in the Team Planner . */
    pjTPScheduledWork(0),    
    /**@ Set the External Task style in the Team Planner. */
    pjTPSRA(2);

    private final long value;

    PjTeamPlannerStyle(long value) {
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
