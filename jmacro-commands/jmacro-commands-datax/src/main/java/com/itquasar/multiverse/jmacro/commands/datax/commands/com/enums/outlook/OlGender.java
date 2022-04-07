package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olgender">https://docs.microsoft.com/en-us/office/vba/api/outlook.olgender</a>}
*/
public enum OlGender implements COMEnum {
    
    /**@ Female */
    olFemale(1),    
    /**@ Male */
    olMale(2),    
    /**@ Unspecified gender */
    olUnspecified(0);

    private final long value;

    OlGender(long value) {
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
