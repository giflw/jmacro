package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdjustificationmode">https://docs.microsoft.com/en-us/office/vba/api/word.wdjustificationmode</a>}
*/
public enum WdJustificationMode implements COMEnum {
    
    /**@ Compress. */
    wdJustificationModeCompress(1),    
    /**@ Compress, using rules of the kana syllabaries, Hiragana and Katakana. */
    wdJustificationModeCompressKana(2),    
    /**@ Expand. */
    wdJustificationModeExpand(0);

    private final long value;

    WdJustificationMode(long value) {
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
