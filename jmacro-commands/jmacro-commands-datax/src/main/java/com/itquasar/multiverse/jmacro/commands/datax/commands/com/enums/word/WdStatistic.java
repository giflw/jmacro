package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdstatistic">https://docs.microsoft.com/en-us/office/vba/api/word.wdstatistic</a>}
*/
public enum WdStatistic implements COMEnum {
    
    /**@ Count of characters. */
    wdStatisticCharacters(3),    
    /**@ Count of characters including spaces. */
    wdStatisticCharactersWithSpaces(5),    
    /**@ Count of characters for Asian languages. */
    wdStatisticFarEastCharacters(6),    
    /**@ Count of lines. */
    wdStatisticLines(1),    
    /**@ Count of pages. */
    wdStatisticPages(2),    
    /**@ Count of paragraphs. */
    wdStatisticParagraphs(4),    
    /**@ Count of words. */
    wdStatisticWords(0);

    private final long value;

    WdStatistic(long value) {
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
