package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olviewtype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olviewtype</a>}
*/
public enum OlViewType implements COMEnum {
    
    /**@ Represents a TableView object. */
    olTableView(0),    
    /**@ Represents a CardView object. */
    olCardView(1),    
    /**@ Represents a CalendarView object. */
    olCalendarView(2),    
    /**@ Represents an IconView object. */
    olIconView(3),    
    /**@ Represents a TimelineView object. */
    olTimelineView(4),    
    /**@ Represents a BusinessCardView object. */
    olBusinessCardView(5),    
    /**@ Represents the TableView object that contains the daily task list in a calendar view. */
    olDailyTaskListView(6),    
    /**@ Represents a PeopleView object. */
    olPeopleView(7);

    private final long value;

    OlViewType(long value) {
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
