package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olmailrecipienttype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olmailrecipienttype</a>}
*/
public enum OlMailRecipientType implements COMEnum {
    
    /**@ The recipient is specified in the BCC property of the Item. */
    olBCC(3),    
    /**@ The recipient is specified in the CC property of the Item. */
    olCC(2),    
    /**@ Originator (sender) of the Item. */
    olOriginator(0),    
    /**@ The recipient is specified in the To property of the Item. */
    olTo(1);

    private final long value;

    OlMailRecipientType(long value) {
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
