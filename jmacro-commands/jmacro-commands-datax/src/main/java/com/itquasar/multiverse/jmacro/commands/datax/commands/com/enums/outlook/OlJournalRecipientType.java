package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oljournalrecipienttype">https://docs.microsoft.com/en-us/office/vba/api/outlook.oljournalrecipienttype</a>}
*/
public enum OlJournalRecipientType implements COMEnum {
    
    /**@ The Contact associated with the Journal item. */
    olAssociatedContact(1);

    private final long value;

    OlJournalRecipientType(long value) {
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
