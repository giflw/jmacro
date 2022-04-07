package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjdaylabel">https://docs.microsoft.com/en-us/office/vba/api/project.pjdaylabel</a>}
*/
public enum PjDayLabel implements COMEnum {
    
    /**@ Examples: Mon, Tue */
    pjDayLabelDay_ddd(19),    
    /**@ Examples: Monday, Tuesday */
    pjDayLabelDay_dddd(18),    
    /**@ Examples: Mo, Tu */
    pjDayLabelDay_ddi(119),    
    /**@ Examples: M, T */
    pjDayLabelDay_di(20),    
    /**@ No date is displayed. */
    pjDayLabelNoDateFormat(35);

    private final long value;

    PjDayLabel(long value) {
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
