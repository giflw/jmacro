package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oltimelineviewmode">https://docs.microsoft.com/en-us/office/vba/api/outlook.oltimelineviewmode</a>}
*/
public enum OlTimelineViewMode implements COMEnum {
    
    /**@ Displays a timeline in which the upper scale represents days and the lower scale represents hours. */
    olTimelineViewDay(0),    
    /**@ Displays a timeline in which the upper scale represents months and the lower scale represents days. */
    olTimelineViewMonth(2),    
    /**@ Displays a timeline in which the upper scale represents weeks and the lower scale represents days. */
    olTimelineViewWeek(1);

    private final long value;

    OlTimelineViewMode(long value) {
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
