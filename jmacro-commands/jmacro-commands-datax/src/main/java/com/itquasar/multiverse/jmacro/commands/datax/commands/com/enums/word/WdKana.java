package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdkana">https://docs.microsoft.com/en-us/office/vba/api/word.wdkana</a>}
*/
public enum WdKana implements COMEnum {
    
    /**@ The text is formatted as Hiragana. */
    wdKanaHiragana(9),    
    /**@ The text is formatted as Katakana. */
    wdKanaKatakana(8);

    private final long value;

    WdKana(long value) {
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
