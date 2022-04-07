package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjinformationtab">https://docs.microsoft.com/en-us/office/vba/api/project.pjinformationtab</a>}
*/
public enum PjInformationTab implements COMEnum {
    
    /**@ General tab of the Assignment Information dialog box. */
    pjAssignmentGeneralTab(0),    
    /**@ Notes tab of the Assignment Information dialog box. */
    pjAssignmentNotesTab(2),    
    /**@ Tracking tab of the Assignment Information dialog box. */
    pjAssignmentTrackingTab(1),    
    /**@ Costs tab of the Resource Information dialog box. */
    pjResourceCostsTab(2),    
    /**@ Custom Fields tab of the Resource Information dialog box. */
    pjResourceCustomFieldsTab(4),    
    /**@ General tab of the Resource Information dialog box. */
    pjResourceGeneralTab(0),    
    /**@ Notes tab of the Resource Information dialog box. */
    pjResourceNotesTab(3),    
    /**@ Working Time tab of the Resource Information dialog box. */
    pjResourceWorkingTimeTab(1),    
    /**@ Advanced tab of the Task Information dialog box. */
    pjTaskAdvancedTab(3),    
    /**@ Custom Fields tab of the Task Information dialog box. */
    pjTaskCustomFieldsTab(5),    
    /**@ General tab of the Task Information dialog box. */
    pjTaskGeneralTab(0),    
    /**@ Notes tab of the Task Information dialog box. */
    pjTaskNotesTab(4),    
    /**@ Predecessors tab of the Task Information dialog box. */
    pjTaskPredecessorsTab(1),    
    /**@ Resources tab of the Task Information dialog box. */
    pjTaskResourcesTab(2);

    private final long value;

    PjInformationTab(long value) {
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
