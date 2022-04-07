package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olitemtype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olitemtype</a>}
*/
public enum OlItemType implements COMEnum {
    
    /**@ An AppointmentItem object. */
    olAppointmentItem(1),    
    /**@ A ContactItem object. */
    olContactItem(2),    
    /**@ A DistListItem object. */
    olDistributionListItem(7),    
    /**@ A JournalItem object. */
    olJournalItem(4),    
    /**@ A MailItem object. */
    olMailItem(0),    
    /**@ A NoteItem object. */
    olNoteItem(5),    
    /**@ A PostItem object. */
    olPostItem(6),    
    /**@ A TaskItem object. */
    olTaskItem(3);

    private final long value;

    OlItemType(long value) {
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
