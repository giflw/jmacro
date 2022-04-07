package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjlinetype">https://docs.microsoft.com/en-us/office/vba/api/project.pjlinetype</a>}
*/
public enum PjLineType implements COMEnum {
    
    /**@ Close dot. */
    pjCloseDot(2),    
    /**@ Continuous line. */
    pjContinuous(1),    
    /**@ Dashed line. */
    pjDash(4),    
    /**@ Dotted line. */
    pjDot(3),    
    /**@ No line. */
    pjNoLines(0);

    private final long value;

    PjLineType(long value) {
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
