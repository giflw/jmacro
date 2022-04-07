package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdunits">https://docs.microsoft.com/en-us/office/vba/api/word.wdunits</a>}
*/
public enum WdUnits implements COMEnum {
    
    /**@ A cell. */
    wdCell(12),    
    /**@ A character. */
    wdCharacter(1),    
    /**@ Character formatting. */
    wdCharacterFormatting(13),    
    /**@ A column. */
    wdColumn(9),    
    /**@ The selected item. */
    wdItem(16),    
    /**@ A line. */
    wdLine(5),    
    /**@ A paragraph. */
    wdParagraph(4),    
    /**@ Paragraph formatting. */
    wdParagraphFormatting(14),    
    /**@ A row. */
    wdRow(10),    
    /**@ The screen dimensions. */
    wdScreen(7),    
    /**@ A section. */
    wdSection(8),    
    /**@ A sentence. */
    wdSentence(3),    
    /**@ A story. */
    wdStory(6),    
    /**@ A table. */
    wdTable(15),    
    /**@ A window. */
    wdWindow(11),    
    /**@ A word. */
    wdWord(2);

    private final long value;

    WdUnits(long value) {
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
