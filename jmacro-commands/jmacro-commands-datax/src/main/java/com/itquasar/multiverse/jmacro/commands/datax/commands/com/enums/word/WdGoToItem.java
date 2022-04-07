package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdgotoitem">https://docs.microsoft.com/en-us/office/vba/api/word.wdgotoitem</a>}
*/
public enum WdGoToItem implements COMEnum {
    
    /**@ A bookmark. */
    wdGoToBookmark(-1),    
    /**@ A comment. */
    wdGoToComment(6),    
    /**@ An endnote. */
    wdGoToEndnote(5),    
    /**@ An equation. */
    wdGoToEquation(10),    
    /**@ A field. */
    wdGoToField(7),    
    /**@ A footnote. */
    wdGoToFootnote(4),    
    /**@ A grammatical error. */
    wdGoToGrammaticalError(14),    
    /**@ A graphic. */
    wdGoToGraphic(8),    
    /**@ A heading. */
    wdGoToHeading(11),    
    /**@ A line. */
    wdGoToLine(3),    
    /**@ An object. */
    wdGoToObject(9),    
    /**@ A page. */
    wdGoToPage(1),    
    /**@ A percent. */
    wdGoToPercent(12),    
    /**@ A proofreading error. */
    wdGoToProofreadingError(15),    
    /**@ A section. */
    wdGoToSection(0),    
    /**@ A spelling error. */
    wdGoToSpellingError(13),    
    /**@ A table. */
    wdGoToTable(2);

    private final long value;

    WdGoToItem(long value) {
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
