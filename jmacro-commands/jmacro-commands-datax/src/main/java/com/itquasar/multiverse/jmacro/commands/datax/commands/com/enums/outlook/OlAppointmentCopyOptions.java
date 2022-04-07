package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olappointmentcopyoptions">https://docs.microsoft.com/en-us/office/vba/api/outlook.olappointmentcopyoptions</a>}
*/
public enum OlAppointmentCopyOptions implements COMEnum {
    
    /**@ Creates an appointment in the destination folder and accepts the meeting request automatically. */
    olCopyAsAccept(2),    
    /**@ Creates an appointment in the destination folder without defaulting to a response or prompting for a response. */
    olCreateAppointment(1),    
    /**@ Copies the appointment to the destination folder and prompts the user to accept the request before completing the copy operation. */
    olPromptUser(0);

    private final long value;

    OlAppointmentCopyOptions(long value) {
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
