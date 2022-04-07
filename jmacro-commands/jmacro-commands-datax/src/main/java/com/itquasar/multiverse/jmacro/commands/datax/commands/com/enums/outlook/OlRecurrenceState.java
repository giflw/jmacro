package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olrecurrencestate">https://docs.microsoft.com/en-us/office/vba/api/outlook.olrecurrencestate</a>}
*/
public enum OlRecurrenceState implements COMEnum {
    
    /**@ The appointment is an exception to a recurrence pattern defined by a master appointment. */
    olApptException(3),    
    /**@ The appointment is a master appointment. */
    olApptMaster(1),    
    /**@ The appointment is not a recurring appointment. */
    olApptNotRecurring(0),    
    /**@ The appointment is an occurrence of a recurring appointment defined by a master appointment. */
    olApptOccurrence(2);

    private final long value;

    OlRecurrenceState(long value) {
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
