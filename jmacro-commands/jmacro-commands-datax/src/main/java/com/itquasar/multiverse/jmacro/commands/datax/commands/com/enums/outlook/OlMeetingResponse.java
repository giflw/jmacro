package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olmeetingresponse">https://docs.microsoft.com/en-us/office/vba/api/outlook.olmeetingresponse</a>}
*/
public enum OlMeetingResponse implements COMEnum {
    
    /**@ The meeting was accepted. */
    olMeetingAccepted(3),    
    /**@ The meeting was declined. */
    olMeetingDeclined(4),    
    /**@ The meeting was tentatively accepted. */
    olMeetingTentative(2);

    private final long value;

    OlMeetingResponse(long value) {
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
