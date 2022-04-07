package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdfrenchspeller">https://docs.microsoft.com/en-us/office/vba/api/word.wdfrenchspeller</a>}
*/
public enum WdFrenchSpeller implements COMEnum {
    
    /**@ Use both Post Reform and Pre-Reform French dictionaries when checking French language spelling. */
    wdFrenchBoth(0),    
    /**@ Use only the Post Reform French dictionary when checking French language spelling. */
    wdFrenchPostReform(2),    
    /**@ Use only the Pre-Reform French dictionary when checking French language spelling. */
    wdFrenchPreReform(1);

    private final long value;

    WdFrenchSpeller(long value) {
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
