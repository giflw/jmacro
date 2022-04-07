package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjmonth">https://docs.microsoft.com/en-us/office/vba/api/project.pjmonth</a>}
*/
public enum PjMonth implements COMEnum {
    
    /**@ April. */
    pjApril(4),    
    /**@ August. */
    pjAugust(8),    
    /**@ December. */
    pjDecember(12),    
    /**@ February. */
    pjFebruary(2),    
    /**@ January. */
    pjJanuary(1),    
    /**@ July. */
    pjJuly(7),    
    /**@ June. */
    pjJune(6),    
    /**@ March. */
    pjMarch(3),    
    /**@ May. */
    pjMay(5),    
    /**@ November. */
    pjNovember(11),    
    /**@ October. */
    pjOctober(10),    
    /**@ September. */
    pjSeptember(9);

    private final long value;

    PjMonth(long value) {
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
