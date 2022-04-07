package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olsensitivity">https://docs.microsoft.com/en-us/office/vba/api/outlook.olsensitivity</a>}
*/
public enum OlSensitivity implements COMEnum {
    
    /**@ Confidential */
    olConfidential(3),    
    /**@ Normal sensitivity */
    olNormal(0),    
    /**@ Personal */
    olPersonal(1),    
    /**@ Private */
    olPrivate(2);

    private final long value;

    OlSensitivity(long value) {
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
