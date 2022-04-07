package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olselectionlocation">https://docs.microsoft.com/en-us/office/vba/api/outlook.olselectionlocation</a>}
*/
public enum OlSelectionLocation implements COMEnum {
    
    /**@ The selection is an attachment of an item in the Reading Pane or inspector. */
    olAttachmentWell(4),    
    /**@ The selection is in the daily Tasks list in the calendar view. */
    olDailyTaskList(3),    
    /**@ The selection is in the list of appointments in the To-Do Bar. */
    olToDoBarAppointmentList(2),    
    /**@ The selection is in the list of tasks in the To-Do Bar. */
    olToDoBarTaskList(1),    
    /**@ The selection is in a list of items in an explorer. */
    olViewList(0);

    private final long value;

    OlSelectionLocation(long value) {
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
