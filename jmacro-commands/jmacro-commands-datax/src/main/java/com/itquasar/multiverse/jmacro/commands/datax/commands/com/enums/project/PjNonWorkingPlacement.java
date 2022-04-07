package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjnonworkingplacement">https://docs.microsoft.com/en-us/office/vba/api/project.pjnonworkingplacement</a>}
*/
public enum PjNonWorkingPlacement implements COMEnum {
    
    /**@ Behind the Gantt bars. */
    pjBehind(0),    
    /**@ Do not draw. */
    pjDoNotDraw(2),    
    /**@ In front of the Gantt bars. */
    pjInFront(1);

    private final long value;

    PjNonWorkingPlacement(long value) {
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
