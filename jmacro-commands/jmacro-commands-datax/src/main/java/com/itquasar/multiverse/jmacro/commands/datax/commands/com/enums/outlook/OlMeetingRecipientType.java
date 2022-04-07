package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olmeetingrecipienttype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olmeetingrecipienttype</a>}
*/
public enum OlMeetingRecipientType implements COMEnum {
    
    /**@ Optional attendee */
    olOptional(2),    
    /**@ Meeting organizer */
    olOrganizer(0),    
    /**@ Required attendee */
    olRequired(1),    
    /**@ A resource such as a conference room */
    olResource(3);

    private final long value;

    OlMeetingRecipientType(long value) {
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
