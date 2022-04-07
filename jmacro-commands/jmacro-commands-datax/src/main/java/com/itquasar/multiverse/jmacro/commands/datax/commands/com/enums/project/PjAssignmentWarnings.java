package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjassignmentwarnings">https://docs.microsoft.com/en-us/office/vba/api/project.pjassignmentwarnings</a>}
*/
public enum PjAssignmentWarnings implements COMEnum {
    
    /**@ No description provided */
    pjAssignmentWarningNoOverlappingCommittedEngagement(1),    
    /**@ No description provided */
    pjAssignmentWarningOverlappingDraftEngagement(16),    
    /**@ No description provided */
    pjAssignmentWarningOverlappingProposedEngagement(8),    
    /**@ No description provided */
    pjAssignmentWarningOverlappingWithLessWorkCommittedEngagement(4),    
    /**@ No description provided */
    pjAssignmentWarningPartiallyOverlappingCommittedEngagement(2);

    private final long value;

    PjAssignmentWarnings(long value) {
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
