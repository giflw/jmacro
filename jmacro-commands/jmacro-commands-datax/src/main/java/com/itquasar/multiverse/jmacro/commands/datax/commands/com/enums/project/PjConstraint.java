package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjconstraint">https://docs.microsoft.com/en-us/office/vba/api/project.pjconstraint</a>}
*/
public enum PjConstraint implements COMEnum {
    
    /**@ Task occurs as late as possible in the schedule without delaying subsequent tasks. */
    pjALAP(1),    
    /**@ Task occurs as soon as possible in the schedule. This is the default constraint type for tasks. */
    pjASAP(0),    
    /**@ Task finishes on or after the constraint date. */
    pjFNET(6),    
    /**@ Task finishes on or before the constraint date. */
    pjFNLT(7),    
    /**@ Task finishes on the constraint date. */
    pjMFO(3),    
    /**@ Task starts on the constraint date. */
    pjMSO(2),    
    /**@ Task starts on or after the constraint date. */
    pjSNET(4),    
    /**@ Task starts on or before the constraint date. */
    pjSNLT(5);

    private final long value;

    PjConstraint(long value) {
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
