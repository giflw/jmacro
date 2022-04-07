package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdstorytype">https://docs.microsoft.com/en-us/office/vba/api/word.wdstorytype</a>}
*/
public enum WdStoryType implements COMEnum {
    
    /**@ Comments story. */
    wdCommentsStory(4),    
    /**@ Endnote continuation notice story. */
    wdEndnoteContinuationNoticeStory(17),    
    /**@ Endnote continuation separator story. */
    wdEndnoteContinuationSeparatorStory(16),    
    /**@ Endnote separator story. */
    wdEndnoteSeparatorStory(15),    
    /**@ Endnotes story. */
    wdEndnotesStory(3),    
    /**@ Even pages footer story. */
    wdEvenPagesFooterStory(8),    
    /**@ Even pages header story. */
    wdEvenPagesHeaderStory(6),    
    /**@ First page footer story. */
    wdFirstPageFooterStory(11),    
    /**@ First page header story. */
    wdFirstPageHeaderStory(10),    
    /**@ Footnote continuation notice story. */
    wdFootnoteContinuationNoticeStory(14),    
    /**@ Footnote continuation separator story. */
    wdFootnoteContinuationSeparatorStory(13),    
    /**@ Footnote separator story. */
    wdFootnoteSeparatorStory(12),    
    /**@ Footnotes story. */
    wdFootnotesStory(2),    
    /**@ Main text story. */
    wdMainTextStory(1),    
    /**@ Primary footer story. */
    wdPrimaryFooterStory(9),    
    /**@ Primary header story. */
    wdPrimaryHeaderStory(7),    
    /**@ Text frame story. */
    wdTextFrameStory(5);

    private final long value;

    WdStoryType(long value) {
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
