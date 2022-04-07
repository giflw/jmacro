package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdhebspellstart">https://docs.microsoft.com/en-us/office/vba/api/word.wdhebspellstart</a>}
*/
public enum WdHebSpellStart implements COMEnum {
    
    /**@ The spelling checker follows rules for the conventional script required by the Hebrew Language Academy for writing text without diacritics. */
    wdFullScript(0),    
    /**@ The spelling checker follows rules for full and partial script, but highlights as potential mistakes any spelling variations not permitted within either system and any completely unrecognized words. */
    wdMixedAuthorizedScript(3),    
    /**@ The spelling checker follows rules for full and partial script and allows non-conventional spelling variations. Only completely unrecognized words are highlighted as potential mistakes. */
    wdMixedScript(2),    
    /**@ The spelling checker follows rules for the traditional script used only for text with diacritics. */
    wdPartialScript(1);

    private final long value;

    WdHebSpellStart(long value) {
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
