package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdbreaktype">https://docs.microsoft.com/en-us/office/vba/api/word.wdbreaktype</a>}
*/
public enum WdBreakType implements COMEnum {
    
    /**@ Column break at the insertion point. */
    wdColumnBreak(8),    
    /**@ Line break. */
    wdLineBreak(6),    
    /**@ Line break. */
    wdLineBreakClearLeft(9),    
    /**@ Line break. */
    wdLineBreakClearRight(10),    
    /**@ Page break at the insertion point. */
    wdPageBreak(7),    
    /**@ New section without a corresponding page break. */
    wdSectionBreakContinuous(3),    
    /**@ Section break with the next section beginning on the next even-numbered page. If the section break falls on an even-numbered page, Word leaves the next odd-numbered page blank. */
    wdSectionBreakEvenPage(4),    
    /**@ Section break on next page. */
    wdSectionBreakNextPage(2),    
    /**@ Section break with the next section beginning on the next odd-numbered page. If the section break falls on an odd-numbered page, Word leaves the next even-numbered page blank. */
    wdSectionBreakOddPage(5),    
    /**@ Ends the current line and forces the text to continue below a picture, table, or other item. The text continues on the next blank line that does not contain a table aligned with the left or right margin. */
    wdTextWrappingBreak(11);

    private final long value;

    WdBreakType(long value) {
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
