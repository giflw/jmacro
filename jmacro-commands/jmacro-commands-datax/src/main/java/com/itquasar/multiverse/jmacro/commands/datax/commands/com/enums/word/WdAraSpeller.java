package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdaraspeller">https://docs.microsoft.com/en-us/office/vba/api/word.wdaraspeller</a>}
*/
public enum WdAraSpeller implements COMEnum {
    
    /**@ The spelling checker uses spelling rules regarding both Arabic words ending with the letter yaa and Arabic words beginning with an alef hamza. */
    wdBoth(3),    
    /**@ The spelling checker uses spelling rules regarding Arabic words ending with the letter yaa. */
    wdFinalYaa(2),    
    /**@ The spelling checker uses spelling rules regarding Arabic words beginning with an alef hamza. */
    wdInitialAlef(1),    
    /**@ The spelling checker ignores spelling rules regarding either Arabic words ending with the letter yaa or Arabic words beginning with an alef hamza. */
    wdNone(0);

    private final long value;

    WdAraSpeller(long value) {
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
