package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjpagesetupcalendaritem">https://docs.microsoft.com/en-us/office/vba/api/project.pjpagesetupcalendaritem</a>}
*/
public enum PjPageSetupCalendarItem implements COMEnum {
    
    /**@ Additional tasks. */
    pjAdditionalTasks(3),    
    /**@ All calendar items. */
    pjAllCalendarItems(0),    
    /**@ Monthly titles. */
    pjMonthlyTitles(1),    
    /**@ Previous and next months. */
    pjPreviousNextMonths(2);

    private final long value;

    PjPageSetupCalendarItem(long value) {
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
