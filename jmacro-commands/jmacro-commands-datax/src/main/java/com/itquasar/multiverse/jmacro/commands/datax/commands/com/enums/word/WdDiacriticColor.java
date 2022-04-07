package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wddiacriticcolor">https://docs.microsoft.com/en-us/office/vba/api/word.wddiacriticcolor</a>}
*/
public enum WdDiacriticColor implements COMEnum {
    
    /**@ Bi-directional language (Arabic, Hebrew, and so forth). */
    wdDiacriticColorBidi(0),    
    /**@ Latin style languages. */
    wdDiacriticColorLatin(1);

    private final long value;

    WdDiacriticColor(long value) {
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
