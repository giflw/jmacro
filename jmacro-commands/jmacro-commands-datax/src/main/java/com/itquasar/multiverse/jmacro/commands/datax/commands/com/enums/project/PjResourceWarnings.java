package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjresourcewarnings">https://docs.microsoft.com/en-us/office/vba/api/project.pjresourcewarnings</a>}
*/
public enum PjResourceWarnings implements COMEnum {
    
    /**@ No description provided */
    pjResourceWarningAssignmentEngagementViolation(1),    
    /**@ No description provided */
    pjResourceWarningAssignmentWorkingInDraftEngagedTime(4),    
    /**@ No description provided */
    pjResourceWarningAssignmentWorkingInProposedEngagedTime(2),    
    /**@ No description provided */
    pjResourceWarningEngagementViolation(8),    
    /**@ No description provided */
    pjResourceWarningWorkingInDraftEngagedTime(32),    
    /**@ No description provided */
    pjResourceWarningWorkingInProposedEngagedTime(16);

    private final long value;

    PjResourceWarnings(long value) {
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
