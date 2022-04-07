package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdfareastlinebreaklanguageid">https://docs.microsoft.com/en-us/office/vba/api/word.wdfareastlinebreaklanguageid</a>}
*/
public enum WdFarEastLineBreakLanguageID implements COMEnum {
    
    /**@ Japanese. */
    wdLineBreakJapanese(1041),    
    /**@ Korean. */
    wdLineBreakKorean(1042),    
    /**@ Simplified Chinese. */
    wdLineBreakSimplifiedChinese(2052),    
    /**@ Traditional Chinese. */
    wdLineBreakTraditionalChinese(1028);

    private final long value;

    WdFarEastLineBreakLanguageID(long value) {
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
