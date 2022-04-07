package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdspecialpane">https://docs.microsoft.com/en-us/office/vba/api/word.wdspecialpane</a>}
*/
public enum WdSpecialPane implements COMEnum {
    
    /**@ Selected comments. */
    wdPaneComments(15),    
    /**@ The page footer. */
    wdPaneCurrentPageFooter(17),    
    /**@ The page header. */
    wdPaneCurrentPageHeader(16),    
    /**@ The endnote continuation notice. */
    wdPaneEndnoteContinuationNotice(12),    
    /**@ The endnote continuation separator. */
    wdPaneEndnoteContinuationSeparator(13),    
    /**@ Endnotes. */
    wdPaneEndnotes(8),    
    /**@ The endnote separator. */
    wdPaneEndnoteSeparator(14),    
    /**@ The even pages footer. */
    wdPaneEvenPagesFooter(6),    
    /**@ The even pages header. */
    wdPaneEvenPagesHeader(3),    
    /**@ The first page footer. */
    wdPaneFirstPageFooter(5),    
    /**@ The first page header. */
    wdPaneFirstPageHeader(2),    
    /**@ The footnote continuation notice. */
    wdPaneFootnoteContinuationNotice(9),    
    /**@ The footnote continuation separator. */
    wdPaneFootnoteContinuationSeparator(10),    
    /**@ Footnotes. */
    wdPaneFootnotes(7),    
    /**@ The footnote separator. */
    wdPaneFootnoteSeparator(11),    
    /**@ No display. */
    wdPaneNone(0),    
    /**@ The primary footer pane. */
    wdPanePrimaryFooter(4),    
    /**@ The primary header pane. */
    wdPanePrimaryHeader(1),    
    /**@ The revisions pane. */
    wdPaneRevisions(18),    
    /**@ The revisions pane displays along the bottom of the document window. */
    wdPaneRevisionsHoriz(19),    
    /**@ The revisions pane displays along the left side of the document window. */
    wdPaneRevisionsVert(20);

    private final long value;

    WdSpecialPane(long value) {
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
