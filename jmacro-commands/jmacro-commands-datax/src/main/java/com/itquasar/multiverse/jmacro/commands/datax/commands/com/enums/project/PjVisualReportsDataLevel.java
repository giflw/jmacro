package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjvisualreportsdatalevel">https://docs.microsoft.com/en-us/office/vba/api/project.pjvisualreportsdatalevel</a>}
*/
public enum PjVisualReportsDataLevel implements COMEnum {
    
    /**@ Automatically determine the time level based on the data time range. */
    pjLevelAutomatic(5),    
    /**@ The time level is days. */
    pjLevelDays(4),    
    /**@ The time level is months. */
    pjLevelMonths(2),    
    /**@ The time level is quarters. */
    pjLevelQuarters(1),    
    /**@ The time level is weeks. */
    pjLevelWeeks(3),    
    /**@ The time level is years. */
    pjLevelYears(0);

    private final long value;

    PjVisualReportsDataLevel(long value) {
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
