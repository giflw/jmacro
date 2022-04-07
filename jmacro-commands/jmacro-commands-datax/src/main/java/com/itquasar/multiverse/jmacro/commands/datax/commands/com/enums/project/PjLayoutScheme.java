package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjlayoutscheme">https://docs.microsoft.com/en-us/office/vba/api/project.pjlayoutscheme</a>}
*/
public enum PjLayoutScheme implements COMEnum {
    
    /**@ Layout centered from left. */
    pjLayoutCenteredFromLeft(5),    
    /**@ Layout centered from top. */
    pjLayoutCenteredFromTop(6),    
    /**@ Layout top down by day. */
    pjLayoutTopDownByDay(1),    
    /**@ Layout top down by month. */
    pjLayoutTopDownByMonth(3),    
    /**@ Layout top down by week. */
    pjLayoutTopDownByWeek(2),    
    /**@ Layout top down by critical first. */
    pjLayoutTopDownCriticalFirst(4),    
    /**@ Layout top down from left. */
    pjLayoutTopDownFromLeft(0);

    private final long value;

    PjLayoutScheme(long value) {
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
