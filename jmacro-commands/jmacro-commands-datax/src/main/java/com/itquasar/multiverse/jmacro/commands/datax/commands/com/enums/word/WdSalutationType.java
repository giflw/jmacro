package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdsalutationtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdsalutationtype</a>}
*/
public enum WdSalutationType implements COMEnum {
    
    /**@ Business salutation */
    wdSalutationBusiness(2),    
    /**@ Format salutation. */
    wdSalutationFormal(1),    
    /**@ Informal salutation. */
    wdSalutationInformal(0),    
    /**@ Custom salutation. */
    wdSalutationOther(3);

    private final long value;

    WdSalutationType(long value) {
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
