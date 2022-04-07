package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olresponsestatus">https://docs.microsoft.com/en-us/office/vba/api/outlook.olresponsestatus</a>}
*/
public enum OlResponseStatus implements COMEnum {
    
    /**@ Meeting accepted. */
    olResponseAccepted(3),    
    /**@ Meeting declined. */
    olResponseDeclined(4),    
    /**@ The appointment is a simple appointment and does not require a response. */
    olResponseNone(0),    
    /**@ Recipient has not responded. */
    olResponseNotResponded(5),    
    /**@ The AppointmentItem is on the Organizer's calendar or the recipient is the Organizer of the meeting. */
    olResponseOrganized(1),    
    /**@ Meeting tentatively accepted. */
    olResponseTentative(2);

    private final long value;

    OlResponseStatus(long value) {
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
