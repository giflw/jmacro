package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjengagementwarnings">https://docs.microsoft.com/en-us/office/vba/api/project.pjengagementwarnings</a>}
*/
public enum PjEngagementWarnings implements COMEnum {
    
    /**@ No description provided */
    pjEngagementWarningDeletedEngagement(4),    
    /**@ No description provided */
    pjEngagementWarningDeletedResource(8),    
    /**@ No description provided */
    pjEngagementWarningInactivatedResource(16),    
    /**@ No description provided */
    pjEngagementWarningStaleData(1),    
    /**@ No description provided */
    pjEngagementWarningStateChange(2);

    private final long value;

    PjEngagementWarnings(long value) {
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
