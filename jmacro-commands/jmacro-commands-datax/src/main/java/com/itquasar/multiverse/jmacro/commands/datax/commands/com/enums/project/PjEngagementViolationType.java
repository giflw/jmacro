package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjengagementviolationtype">https://docs.microsoft.com/en-us/office/vba/api/project.pjengagementviolationtype</a>}
*/
public enum PjEngagementViolationType implements COMEnum {
    
    /**@ No description provided */
    pjEngagementViolationTypeAssignmentWorkingAboveEngagedTime(16384),    
    /**@ No description provided */
    pjEngagementViolationTypeAssignmentWorkingInDraftEngagedTime(65536),    
    /**@ No description provided */
    pjEngagementViolationTypeAssignmentWorkingInProposedEngagedTime(32768),    
    /**@ No description provided */
    pjEngagementViolationTypeAssignmentWorkingOutsideEngagedTime(4096),    
    /**@ No description provided */
    pjEngagementViolationTypeAssignmentWorkingPartiallyOutsideEngagedTime(8192),    
    /**@ No description provided */
    pjEngagementViolationTypeNone(0),    
    /**@ No description provided */
    pjEngagementViolationTypeResourceAssignmentEngagementViolation(64),    
    /**@ No description provided */
    pjEngagementViolationTypeResourceAssignmentWorkingInDraftEngagedTime(256),    
    /**@ No description provided */
    pjEngagementViolationTypeResourceAssignmentWorkingInProposedEngagedTime(128),    
    /**@ No description provided */
    pjEngagementViolationTypeResourceEngagementViolation(512),    
    /**@ No description provided */
    pjEngagementViolationTypeResourceWorkingInDraftEngagedTime(2048),    
    /**@ No description provided */
    pjEngagementViolationTypeResourceWorkingInProposedEngagedTime(1024),    
    /**@ No description provided */
    pjEngagementViolationTypeTaskAssignmentEngagementViolation(1),    
    /**@ No description provided */
    pjEngagementViolationTypeTaskAssignmentWorkingInDraftEngagedTime(4),    
    /**@ No description provided */
    pjEngagementViolationTypeTaskAssignmentWorkingInProposedEngagedTime(2),    
    /**@ No description provided */
    pjEngagementViolationTypeTaskResourceEngagementViolation(8),    
    /**@ No description provided */
    pjEngagementViolationTypeTaskResourceWorkingInDraftEngagedTime(32),    
    /**@ No description provided */
    pjEngagementViolationTypeTaskResourceWorkingInProposedEngagedTime(16);

    private final long value;

    PjEngagementViolationType(long value) {
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
