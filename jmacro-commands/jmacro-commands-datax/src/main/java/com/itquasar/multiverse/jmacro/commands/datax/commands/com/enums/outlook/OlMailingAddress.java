package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olmailingaddress">https://docs.microsoft.com/en-us/office/vba/api/outlook.olmailingaddress</a>}
*/
public enum OlMailingAddress implements COMEnum {
    
    /**@ Business mailing address */
    olBusiness(2),    
    /**@ Home mailing address */
    olHome(1),    
    /**@ No mailing address defined */
    olNone(0),    
    /**@ Other mailing address */
    olOther(3);

    private final long value;

    OlMailingAddress(long value) {
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
