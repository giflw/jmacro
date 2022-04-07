package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcompatibility">https://docs.microsoft.com/en-us/office/vba/api/word.wdcompatibility</a>}
*/
public enum WdCompatibility implements COMEnum {
    
    /**@ Align table rows independently. */
    wdAlignTablesRowByRow(39),    
    /**@ Use line-breaking rules. */
    wdApplyBreakingRules(46),    
    /**@ Autospace like Microsoft Word 95. */
    wdAutospaceLikeWW7(38),    
    /**@ Treat " as "" in mail merge data sources. */
    wdConvMailMergeEsc(6),    
    /**@ Adjust line height to grid height in the table. */
    wdDontAdjustLineHeightInTable(36),    
    /**@ Balance SBCS characters and DBCS characters. */
    wdDontBalanceSingleByteDoubleByteWidth(16),    
    /**@ Do not break wrapped tables across pages. */
    wdDontBreakWrappedTables(43),    
    /**@ Do not snap text to grid inside table with inline objects. */
    wdDontSnapTextToGridInTableWithObjects(44),    
    /**@ Draw underline on trailing spaces. */
    wdDontULTrailSpace(15),    
    /**@ Do not use Asian rules for line breaks with character grid. */
    wdDontUseAsianBreakRulesInGrid(48),    
    /**@ Do not use HTML paragraph auto spacing. */
    wdDontUseHTMLParagraphAutoSpacing(35),    
    /**@ Do not allow hanging punctuation with character grid. */
    wdDontWrapTextWithPunctuation(47),    
    /**@ Do not center "exact line height" lines. */
    wdExactOnTop(28),    
    /**@ Do not expand character spaces on the line ending Shift+Return. */
    wdExpandShiftReturn(14),    
    /**@ Lay out footnotes like Word 6.x/95/97. */
    wdFootnoteLayoutLikeWW8(34),    
    /**@ Forget last tab alignment. */
    wdForgetLastTabAlignment(37),    
    /**@ Allow tables to extend into margins. */
    wdGrowAutofit(50),    
    /**@ Lay out tables with raw width. */
    wdLayoutRawTableWidth(40),    
    /**@ Allow table rows to lay out apart. */
    wdLayoutTableRowsApart(41),    
    /**@ Convert backslash characters into yen signs. */
    wdLeaveBackslashAlone(13),    
    /**@ Line wrap like Word 6.0. */
    wdLineWrapLikeWord6(32),    
    /**@ Use larger small caps like Word 5.x for the Macintosh. */
    wdMWSmallCaps(22),    
    /**@ Do not balance columns for continuous section starts. */
    wdNoColumnBalance(5),    
    /**@ Suppress extra line spacing like WordPerfect 5.x. */
    wdNoExtraLineSpacing(23),    
    /**@ Do not add leading (extra space) between rows of text. */
    wdNoLeading(20),    
    /**@ Add space for underline. */
    wdNoSpaceForUL(21),    
    /**@ Do not add extra space for raised/lowered characters. */
    wdNoSpaceRaiseLower(2),    
    /**@ Do not add automatic tab stop for hanging indent. */
    wdNoTabHangIndent(1),    
    /**@ Combine table borders like Word 5.x for the Macintosh. */
    wdOrigWordTableRules(9),    
    /**@ Print body text before header/footer. */
    wdPrintBodyTextBeforeHeader(19),    
    /**@ Print colors as black on noncolor printers. */
    wdPrintColBlack(3),    
    /**@ Select entire field with first or last character. */
    wdSelectFieldWithFirstOrLastCharacter(45),    
    /**@ Lay out autoshapes like Word 97. */
    wdShapeLayoutLikeWW8(33),    
    /**@ Show hard page or column breaks in frames. */
    wdShowBreaksInFrames(11),    
    /**@ Expand/condense by whole number of points. */
    wdSpacingInWholePoints(18),    
    /**@ Substitute fonts based on font size. */
    wdSubFontBySize(25),    
    /**@ Suppress extra line spacing at bottom of page. */
    wdSuppressBottomSpacing(29),    
    /**@ Suppress Space Before after a hard page or column break. */
    wdSuppressSpBfAfterPgBrk(7),    
    /**@ Suppress extra line spacing at top of page. */
    wdSuppressTopSpacing(8),    
    /**@ Suppress extra line spacing at top of page like Word 5.x for the Macintosh. */
    wdSuppressTopSpacingMac5(17),    
    /**@ Swap left and right borders on odd facing pages. */
    wdSwapBordersFacingPages(12),    
    /**@ Do not blank the area behind metafile pictures. */
    wdTransparentMetafiles(10),    
    /**@ Truncate font height. */
    wdTruncateFontHeight(24),    
    /**@ Use printer metrics to lay out document. */
    wdUsePrinterMetrics(26),    
    /**@ Use Microsoft Word 2002 table style rules. */
    wdUseWord2002TableStyleRules(49),    
    /**@ Use Microsoft Word 2010 table style rules. */
    wdUseWord2010TableStyleRules(69),    
    /**@ Use Microsoft Word 97 line breaking rules for Asian text. */
    wdUseWord97LineBreakingRules(42),    
    /**@ Do full justification like WordPerfect 6.x for Windows. */
    wdWPJustification(31),    
    /**@ Set the width of a space like WordPerfect 5.x. */
    wdWPSpaceWidth(30),    
    /**@ Wrap trailing spaces to next line. */
    wdWrapTrailSpaces(4),    
    /**@ Use Word 6.x/95 border rules. */
    wdWW6BorderRules(27),    
    /**@ Allow space between paragraphs of the same style in a table. */
    wdAllowSpaceOfSameStyleInTable(54),    
    /**@ Use Microsoft Word 2003 table autofit rules. */
    wdAutofitLikeWW11(57),    
    /**@ Do not autofit tables next to wrapped objects. */
    wdDontAutofitConstrainedTables(56),    
    /**@ Do not use hanging indent as tab stop for bullets and numbering. */
    wdDontUseIndentAsNumberingTabStop(52),    
    /**@ Use Word 2003 hanging-punctuation rules in Asian languages. */
    wdFELineBreak11(53),    
    /**@ Do not use proportional width for Korean characters. */
    wdHangulWidthLikeWW11(59),    
    /**@ Split apart page break and paragraph mark. */
    wdSplitPgBreakAndParaMark(60),    
    /**@ Underline the tab character between the number and the text in numbered lists. */
    wdUnderlineTabInNumList(58),    
    /**@ Use the Normal style instead of the List Paragraph style for bulleted or numbered lists. */
    wdUseNormalStyleForList(51),    
    /**@ Use Word 2003 indent rules for text next to wrapped objects. */
    wdWW11IndentRules(55);

    private final long value;

    WdCompatibility(long value) {
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
