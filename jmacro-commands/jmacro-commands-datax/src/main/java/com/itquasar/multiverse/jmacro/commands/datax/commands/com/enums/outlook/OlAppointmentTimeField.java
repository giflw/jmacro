package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olappointmenttimefield">https://docs.microsoft.com/en-us/office/vba/api/outlook.olappointmenttimefield</a>}
*/
public enum OlAppointmentTimeField implements COMEnum {
    
    /**@ The control is bound to the end time of the appointment. */
    olAppointmentTimeFieldEnd(3),    
    /**@ The control is not bound. */
    olAppointmentTimeFieldNone(1),    
    /**@ The control is bound to the start time of the appointment. */
    olAppointmentTimeFieldStart(2);

    private final long value;

    OlAppointmentTimeField(long value) {
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
