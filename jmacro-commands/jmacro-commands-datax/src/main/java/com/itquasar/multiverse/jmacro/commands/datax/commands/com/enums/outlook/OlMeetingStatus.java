package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olmeetingstatus">https://docs.microsoft.com/en-us/office/vba/api/outlook.olmeetingstatus</a>}
*/
public enum OlMeetingStatus implements COMEnum {
    
    /**@ The meeting has been scheduled. */
    olMeeting(1),    
    /**@ The scheduled meeting has been cancelled. */
    olMeetingCanceled(5),    
    /**@ The meeting request has been received. */
    olMeetingReceived(3),    
    /**@ The scheduled meeting has been cancelled but still appears on the user's calendar. */
    olMeetingReceivedAndCanceled(7),    
    /**@ An Appointment item without attendees has been scheduled. This status can be used to set up holidays on a calendar. */
    olNonMeeting(0);

    private final long value;

    OlMeetingStatus(long value) {
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
