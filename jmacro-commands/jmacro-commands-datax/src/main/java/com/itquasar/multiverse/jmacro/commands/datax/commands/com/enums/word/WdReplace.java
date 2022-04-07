package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdreplace">https://docs.microsoft.com/en-us/office/vba/api/word.wdreplace</a>}
*/
public enum WdReplace implements COMEnum {
    
    /**@ Replace all occurrences. */
    wdReplaceAll(2),    
    /**@ Replace no occurrences. */
    wdReplaceNone(0),    
    /**@ Replace the first occurrence encountered. */
    wdReplaceOne(1);

    private final long value;

    WdReplace(long value) {
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
