package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjprojectservertrackingmethod">https://docs.microsoft.com/en-us/office/vba/api/project.pjprojectservertrackingmethod</a>}
*/
public enum PjProjectServerTrackingMethod implements COMEnum {
    
    /**@ Use the default tracking method. */
    pjTrackingMethodDefault(0),    
    /**@ Tracking is by percent complete. */
    pjTrackingMethodPercentComplete(2),    
    /**@ Tracking is by reported hours worked per period. */
    pjTrackingMethodSpecifyHours(1),    
    /**@ Tracking is by total work completed and estimated remaining work. */
    pjTrackingMethodTotalAndRemaining(3);

    private final long value;

    PjProjectServerTrackingMethod(long value) {
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
