package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdportuguesereform">https://docs.microsoft.com/en-us/office/vba/api/word.wdportuguesereform</a>}
*/
public enum WdPortugueseReform implements COMEnum {
    
    /**@ Use both the pre-reform and post-reform spelling rules. */
    wdPortugueseBoth(3),    
    /**@ Use the post-reform spelling rules. */
    wdPortuguesePostReform(2),    
    /**@ Use the pre-reform spelling rules. */
    wdPortuguesePreReform(1);

    private final long value;

    WdPortugueseReform(long value) {
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
