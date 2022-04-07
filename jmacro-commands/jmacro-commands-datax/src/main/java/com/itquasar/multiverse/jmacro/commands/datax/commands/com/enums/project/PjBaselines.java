package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjbaselines">https://docs.microsoft.com/en-us/office/vba/api/project.pjbaselines</a>}
*/
public enum PjBaselines implements COMEnum {
    
    /**@ Baseline. */
    pjBaseline(0),    
    /**@ Baseline1. */
    pjBaseline1(1),    
    /**@ Baseline10. */
    pjBaseline10(10),    
    /**@ Baseline2. */
    pjBaseline2(2),    
    /**@ Baseline3. */
    pjBaseline3(3),    
    /**@ Baseline4. */
    pjBaseline4(4),    
    /**@ Baseline5. */
    pjBaseline5(5),    
    /**@ Baseline6. */
    pjBaseline6(6),    
    /**@ Baseline7. */
    pjBaseline7(7),    
    /**@ Baseline8. */
    pjBaseline8(8),    
    /**@ Baseline9. */
    pjBaseline9(9);

    private final long value;

    PjBaselines(long value) {
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
