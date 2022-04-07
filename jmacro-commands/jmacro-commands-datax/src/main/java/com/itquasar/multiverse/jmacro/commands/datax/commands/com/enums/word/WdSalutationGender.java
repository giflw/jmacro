package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdsalutationgender">https://docs.microsoft.com/en-us/office/vba/api/word.wdsalutationgender</a>}
*/
public enum WdSalutationGender implements COMEnum {
    
    /**@ Female gender. */
    wdGenderFemale(0),    
    /**@ Male gender. */
    wdGenderMale(1),    
    /**@ Neutral gender. */
    wdGenderNeutral(2),    
    /**@ Unknown gender. */
    wdGenderUnknown(3);

    private final long value;

    WdSalutationGender(long value) {
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
