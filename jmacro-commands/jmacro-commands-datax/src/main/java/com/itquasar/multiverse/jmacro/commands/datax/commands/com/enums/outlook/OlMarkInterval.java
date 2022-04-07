package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olmarkinterval">https://docs.microsoft.com/en-us/office/vba/api/outlook.olmarkinterval</a>}
*/
public enum OlMarkInterval implements COMEnum {
    
    /**@ Mark the task as complete. */
    olMarkComplete(5),    
    /**@ Mark the task due next week. */
    olMarkNextWeek(3),    
    /**@ Mark the task due with no date. */
    olMarkNoDate(4),    
    /**@ Mark the task due this week. */
    olMarkThisWeek(2),    
    /**@ Mark the task due today. */
    olMarkToday(0),    
    /**@ Mark the task due tomorrow. */
    olMarkTomorrow(1);

    private final long value;

    OlMarkInterval(long value) {
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
