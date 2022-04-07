package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdinformation">https://docs.microsoft.com/en-us/office/vba/api/word.wdinformation</a>}
*/
public enum WdInformation implements COMEnum {
    
    /**@ Returns the number of the page that contains the active end of the specified selection or range. If you set a starting page number or make other manual adjustments, returns the adjusted page number (unlike wdActiveEndPageNumber). */
    wdActiveEndAdjustedPageNumber(1),    
    /**@ Returns the number of the page that contains the active end of the specified selection or range, counting from the beginning of the document. Any manual adjustments to page numbering are disregarded (unlike wdActiveEndAdjustedPageNumber). */
    wdActiveEndPageNumber(3),    
    /**@ Returns the number of the section that contains the active end of the specified selection or range. */
    wdActiveEndSectionNumber(2),    
    /**@ Returns True if the specified selection or range is at the end-of-row mark in a table. */
    wdAtEndOfRowMarker(31),    
    /**@ Returns True if Caps Lock is in effect. */
    wdCapsLock(21),    
    /**@ Returns the table column number that contains the end of the specified selection or range. */
    wdEndOfRangeColumnNumber(17),    
    /**@ Returns the table row number that contains the end of the specified selection or range. */
    wdEndOfRangeRowNumber(14),    
    /**@ Returns the character position of the first character in the specified selection or range. If the selection or range is collapsed, the character number immediately to the right of the range or selection is returned (this is the same as the character column number displayed in the status bar after "Col"). */
    wdFirstCharacterColumnNumber(9),    
    /**@ Returns the character position of the first character in the specified selection or range. If the selection or range is collapsed, the character number immediately to the right of the range or selection is returned (this is the same as the character line number displayed in the status bar after "Ln"). */
    wdFirstCharacterLineNumber(10),    
    /**@ Returns True if the selection or range is an entire frame or text box. */
    wdFrameIsSelected(11),    
    /**@ Returns a value that indicates the type of header or footer that contains the specified selection or range. See the table in the remarks section for additional information. */
    wdHeaderFooterType(33),    
    /**@ Returns the horizontal position of the specified selection or range; this is the distance from the left edge of the selection or range to the left edge of the page measured in points (1 point = 20 twips, 72 points = 1 inch). If the selection or range isn't within the screen area, returns -1. */
    wdHorizontalPositionRelativeToPage(5),    
    /**@ Returns the horizontal position of the specified selection or range relative to the left edge of the nearest text boundary enclosing it, in points (1 point = 20 twips, 72 points = 1 inch). If the selection or range isn't within the screen area, returns -1. */
    wdHorizontalPositionRelativeToTextBoundary(7),    
    /**@ Returns True if the specified selection or range is in a bibliography. */
    wdInBibliography(42),    
    /**@ Returns True if the specified selection or range is in a citation. */
    wdInCitation(43),    
    /**@ For information about this constant, consult the language reference Help included with Microsoft Office Macintosh Edition. */
    wdInClipboard(38),    
    /**@ Returns True if the specified selection or range is in a comment pane. */
    wdInCommentPane(26),    
    /**@ Returns True if the specified selection or range is in a content control. */
    wdInContentControl(46),    
    /**@ Returns True if the specified selection or range is in a cover page. */
    wdInCoverPage(41),    
    /**@ Returns True if the specified selection or range is in an endnote area in print layout view or in the endnote pane in normal view. */
    wdInEndnote(36),    
    /**@ Returns True if the specified selection or range is in a field code. */
    wdInFieldCode(44),    
    /**@ Returns True if the specified selection or range is in a field result. */
    wdInFieldResult(45),    
    /**@ Returns True if the specified selection or range is in a footnote area in print layout view or in the footnote pane in normal view. */
    wdInFootnote(35),    
    /**@ Returns True if the specified selection or range is in the footnote or endnote pane in normal view or in a footnote or endnote area in print layout view. For more information, see the descriptions of wdInFootnote and wdInEndnote in the preceding paragraphs. */
    wdInFootnoteEndnotePane(25),    
    /**@ Returns True if the selection or range is in the header or footer pane or in a header or footer in print layout view. */
    wdInHeaderFooter(28),    
    /**@ Returns True if the selection or range is in a master document (that is, a document that contains at least one subdocument). */
    wdInMasterDocument(34),    
    /**@ Returns True if the selection or range is in the header or footer pane or in a header or footer in print layout view. */
    wdInWordMail(37),    
    /**@ Returns the greatest number of table columns within any row in the selection or range. */
    wdMaximumNumberOfColumns(18),    
    /**@ Returns the greatest number of table rows within the table in the specified selection or range. */
    wdMaximumNumberOfRows(15),    
    /**@ Returns the number of pages in the document associated with the selection or range. */
    wdNumberOfPagesInDocument(4),    
    /**@ Returns True if Num Lock is in effect. */
    wdNumLock(22),    
    /**@ Returns True if Overtype mode is in effect. The Overtype property can be used to change the state of the Overtype mode. */
    wdOverType(23),    
    /**@ Returns a value that indicates where the selection is in relation to a footnote, endnote, or comment reference, as shown in the table in the remarks section. */
    wdReferenceOfType(32),    
    /**@ Returns True if change tracking is in effect. */
    wdRevisionMarking(24),    
    /**@ Returns a value that indicates the current selection mode, as shown in the following table. */
    wdSelectionMode(20),    
    /**@ Returns the table column number that contains the beginning of the selection or range. */
    wdStartOfRangeColumnNumber(16),    
    /**@ Returns the table row number that contains the beginning of the selection or range. */
    wdStartOfRangeRowNumber(13),    
    /**@ Returns the vertical position of the selection or range; this is the distance from the top edge of the selection to the top edge of the page measured in points (1 point = 20 twips, 72 points = 1 inch). If the selection isn't visible in the document window, returns -1. */
    wdVerticalPositionRelativeToPage(6),    
    /**@ Returns the vertical position of the selection or range relative to the top edge of the nearest text boundary enclosing it, in points (1 point = 20 twips, 72 points = 1 inch). This is useful for determining the position of the insertion point within a frame or table cell. If the selection isn't visible, returns -1. */
    wdVerticalPositionRelativeToTextBoundary(8),    
    /**@ Returns True if the selection is in a table. */
    wdWithInTable(12),    
    /**@ Returns the current percentage of magnification as set by the Percentage property. */
    wdZoomPercentage(19);

    private final long value;

    WdInformation(long value) {
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
