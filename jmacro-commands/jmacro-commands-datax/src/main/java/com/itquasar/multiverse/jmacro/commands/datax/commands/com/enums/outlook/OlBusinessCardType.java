package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olbusinesscardtype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olbusinesscardtype</a>}
*/
public enum OlBusinessCardType implements COMEnum {
    
    /**@ Indicates that the ContactItem uses the Microsoft Office InterConnect format for the associated Electronic Business Card. */
    olBusinessCardTypeInterConnect(1),    
    /**@ Indicates that the ContactItem object uses the Microsoft Outlook format for the associated Electronic Business Card. */
    olBusinessCardTypeOutlook(0);

    private final long value;

    OlBusinessCardType(long value) {
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
