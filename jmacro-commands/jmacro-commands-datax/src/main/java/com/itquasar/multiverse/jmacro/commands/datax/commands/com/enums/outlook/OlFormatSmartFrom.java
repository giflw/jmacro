package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatsmartfrom">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatsmartfrom</a>}
*/
public enum OlFormatSmartFrom implements COMEnum {
    
    /**@ Display the value of the From Outlook item property. If no value is available, display an empty string. */
    olFormatSmartFromFromOnly(2),    
    /**@ Display the value of the From Outlook item property. If no value is available, display instead the value of the To Outlook item property. */
    olFormatSmartFromFromTo(1);

    private final long value;

    OlFormatSmartFrom(long value) {
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
