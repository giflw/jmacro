package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olrecipientselectors">https://docs.microsoft.com/en-us/office/vba/api/outlook.olrecipientselectors</a>}
*/
public enum OlRecipientSelectors implements COMEnum {
    
    /**@ No edit box will be displayed. */
    olShowNone(0),    
    /**@ Only an edit box for To recipients will be displayed. */
    olShowTo(1),    
    /**@ Only edit boxes for To and Cc recipients will be displayed. */
    olShowToCc(2),    
    /**@ Edit boxes for To, Cc, and Bcc recipients will be displayed. */
    olShowToCcBcc(3);

    private final long value;

    OlRecipientSelectors(long value) {
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
