package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdworddialogtab">https://docs.microsoft.com/en-us/office/vba/api/word.wdworddialogtab</a>}
*/
public enum WdWordDialogTab implements COMEnum {
    
    /**@ General tab of the Email Options dialog box. */
    wdDialogEmailOptionsTabQuoting(1900002),    
    /**@ Email Signature tab of the Email Options dialog box. */
    wdDialogEmailOptionsTabSignature(1900000),    
    /**@ Personal Stationary tab of the Email Options dialog box. */
    wdDialogEmailOptionsTabStationary(1900001),    
    /**@ Margins tab of the Page Setup dialog box, with Apply To drop-down list active. */
    wdDialogFilePageSetupTabCharsLines(150004),    
    /**@ Layout tab of the Page Setup dialog box. */
    wdDialogFilePageSetupTabLayout(150003),    
    /**@ Margins tab of the Page Setup dialog box. */
    wdDialogFilePageSetupTabMargins(150000),    
    /**@ Paper tab of the Page Setup dialog box. */
    wdDialogFilePageSetupTabPaper(150001),    
    /**@ Borders tab of the Borders dialog box. */
    wdDialogFormatBordersAndShadingTabBorders(700000),    
    /**@ Page Border tab of the Borders dialog box. */
    wdDialogFormatBordersAndShadingTabPageBorder(700001),    
    /**@ Shading tab of the Borders dialog box. */
    wdDialogFormatBordersAndShadingTabShading(700002),    
    /**@ Bulleted tab of the Bullets and Numbering dialog box. */
    wdDialogFormatBulletsAndNumberingTabBulleted(1500000),    
    /**@ Numbered tab of the Bullets and Numbering dialog box. */
    wdDialogFormatBulletsAndNumberingTabNumbered(1500001),    
    /**@ Outline Numbered tab of the Bullets and Numbering dialog box. */
    wdDialogFormatBulletsAndNumberingTabOutlineNumbered(1500002),    
    /**@ Colors and Lines tab of the Format Drawing Object dialog box. */
    wdDialogFormatDrawingObjectTabColorsAndLines(1200000),    
    /**@ Colors and Lines tab of the Format Drawing Object dialog box. */
    wdDialogFormatDrawingObjectTabHR(1200007),    
    /**@ Picture tab of the Format Drawing Object dialog box. */
    wdDialogFormatDrawingObjectTabPicture(1200004),    
    /**@ Position tab of the Format Drawing Object dialog box. */
    wdDialogFormatDrawingObjectTabPosition(1200002),    
    /**@ Size tab of the Format Drawing Object dialog box. */
    wdDialogFormatDrawingObjectTabSize(1200001),    
    /**@ Textbox tab of the Format Drawing Object dialog box. */
    wdDialogFormatDrawingObjectTabTextbox(1200005),    
    /**@ Web tab of the Format Drawing Object dialog box. */
    wdDialogFormatDrawingObjectTabWeb(1200006),    
    /**@ Wrapping tab of the Format Drawing Object dialog box. */
    wdDialogFormatDrawingObjectTabWrapping(1200003),    
    /**@ Animation tab of the Font dialog box. */
    wdDialogFormatFontTabAnimation(600002),    
    /**@ Character Spacing tab of the Font dialog box. */
    wdDialogFormatFontTabCharacterSpacing(600001),    
    /**@ Font tab of the Font dialog box. */
    wdDialogFormatFontTabFont(600000),    
    /**@ Indents and Spacing tab of the Paragraph dialog box. */
    wdDialogFormatParagraphTabIndentsAndSpacing(1000000),    
    /**@ Line and Page Breaks tab of the Paragraph dialog box, with choices appropriate for Asian text. */
    wdDialogFormatParagraphTabTeisai(1000002),    
    /**@ Line and Page Breaks tab of the Paragraph dialog box. */
    wdDialogFormatParagraphTabTextFlow(1000001),    
    /**@ Index tab of the Index and Tables dialog box. */
    wdDialogInsertIndexAndTablesTabIndex(400000),    
    /**@ Table of Authorities tab of the Index and Tables dialog box. */
    wdDialogInsertIndexAndTablesTabTableOfAuthorities(400003),    
    /**@ Table of Contents tab of the Index and Tables dialog box. */
    wdDialogInsertIndexAndTablesTabTableOfContents(400001),    
    /**@ Table of Figures tab of the Index and Tables dialog box. */
    wdDialogInsertIndexAndTablesTabTableOfFigures(400002),    
    /**@ Special Characters tab of the Symbol dialog box. */
    wdDialogInsertSymbolTabSpecialCharacters(200001),    
    /**@ Symbols tab of the Symbol dialog box. */
    wdDialogInsertSymbolTabSymbols(200000),    
    /**@ Letter Format tab of the Letter Wizard dialog box. */
    wdDialogLetterWizardTabLetterFormat(1600000),    
    /**@ Other Elements tab of the Letter Wizard dialog box. */
    wdDialogLetterWizardTabOtherElements(1600002),    
    /**@ Recipient Info tab of the Letter Wizard dialog box. */
    wdDialogLetterWizardTabRecipientInfo(1600001),    
    /**@ Sender Info tab of the Letter Wizard dialog box. */
    wdDialogLetterWizardTabSenderInfo(1600003),    
    /**@ All Endnotes tab of the Note Options dialog box. */
    wdDialogNoteOptionsTabAllEndnotes(300001),    
    /**@ All Footnotes tab of the Note Options dialog box. */
    wdDialogNoteOptionsTabAllFootnotes(300000),    
    /**@ AutoText tab of the Organizer dialog box. */
    wdDialogOrganizerTabAutoText(500001),    
    /**@ Command Bars tab of the Organizer dialog box. */
    wdDialogOrganizerTabCommandBars(500002),    
    /**@ Macros tab of the Organizer dialog box. */
    wdDialogOrganizerTabMacros(500003),    
    /**@ Styles tab of the Organizer dialog box. */
    wdDialogOrganizerTabStyles(500000),    
    /**@ Cell tab of the Table Properties dialog box. */
    wdDialogTablePropertiesTabCell(1800003),    
    /**@ Column tab of the Table Properties dialog box. */
    wdDialogTablePropertiesTabColumn(1800002),    
    /**@ Row tab of the Table Properties dialog box. */
    wdDialogTablePropertiesTabRow(1800001),    
    /**@ Table tab of the Table Properties dialog box. */
    wdDialogTablePropertiesTabTable(1800000),    
    /**@ Templates tab of the Templates and Add-ins dialog box. */
    wdDialogTemplates(2100000),    
    /**@ Linked CSS tab of the Templates and Add-ins dialog box. */
    wdDialogTemplatesLinkedCSS(2100003),    
    /**@ XML Expansion Packs tab of the Templates and Add-ins dialog box. */
    wdDialogTemplatesXMLExpansionPacks(2100002),    
    /**@ XML Schema tab of the Templates and Add-ins dialog box. */
    wdDialogTemplatesXMLSchema(2100001),    
    /**@ First Letter tab of the AutoCorrect Exceptions dialog box. */
    wdDialogToolsAutoCorrectExceptionsTabFirstLetter(1400000),    
    /**@ Hangul and Alphabet tab of the AutoCorrect Exceptions dialog box. Available only in multi-language versions. */
    wdDialogToolsAutoCorrectExceptionsTabHangulAndAlphabet(1400002),    
    /**@ Other Corrections tab of the AutoCorrect Exceptions dialog box. */
    wdDialogToolsAutoCorrectExceptionsTabIac(1400003),    
    /**@ Initial Caps tab of the AutoCorrect Exceptions dialog box. */
    wdDialogToolsAutoCorrectExceptionsTabInitialCaps(1400001),    
    /**@ AutoCorrect tab of the AutoCorrect dialog box. */
    wdDialogToolsAutoManagerTabAutoCorrect(1700000),    
    /**@ AutoFormat tab of the AutoCorrect dialog box. */
    wdDialogToolsAutoManagerTabAutoFormat(1700003),    
    /**@ Format As You Type tab of the AutoCorrect dialog box. */
    wdDialogToolsAutoManagerTabAutoFormatAsYouType(1700001),    
    /**@ AutoText tab of the AutoCorrect dialog box. */
    wdDialogToolsAutoManagerTabAutoText(1700002),    
    /**@ Smart Tags tab of the AutoCorrect dialog box. */
    wdDialogToolsAutoManagerTabSmartTags(1700004),    
    /**@ Envelopes tab of the Envelopes and Labels dialog box. */
    wdDialogToolsEnvelopesAndLabelsTabEnvelopes(800000),    
    /**@ Labels tab of the Envelopes and Labels dialog box. */
    wdDialogToolsEnvelopesAndLabelsTabLabels(800001),    
    /**@ Not supported. */
    wdDialogToolsOptionsTabAcetate(1266),    
    /**@ Complex Scripts tab of the Options dialog box. */
    wdDialogToolsOptionsTabBidi(1029),    
    /**@ Compatibility tab of the Options dialog box. */
    wdDialogToolsOptionsTabCompatibility(525),    
    /**@ Edit tab of the Options dialog box. */
    wdDialogToolsOptionsTabEdit(224),    
    /**@ File Locations tab of the Options dialog box. */
    wdDialogToolsOptionsTabFileLocations(225),    
    /**@ Not supported. */
    wdDialogToolsOptionsTabFuzzy(790),    
    /**@ General tab of the Options dialog box. */
    wdDialogToolsOptionsTabGeneral(203),    
    /**@ Hangul Hanja Conversion tab of the Options dialog box. */
    wdDialogToolsOptionsTabHangulHanjaConversion(786),    
    /**@ Print tab of the Options dialog box. */
    wdDialogToolsOptionsTabPrint(208),    
    /**@ Spelling and Grammar tab of the Options dialog box. */
    wdDialogToolsOptionsTabProofread(211),    
    /**@ Save tab of the Options dialog box. */
    wdDialogToolsOptionsTabSave(209),    
    /**@ Security tab of the Options dialog box. */
    wdDialogToolsOptionsTabSecurity(1361),    
    /**@ Track Changes tab of the Options dialog box. */
    wdDialogToolsOptionsTabTrackChanges(386),    
    /**@ Asian Typography tab of the Options dialog box. */
    wdDialogToolsOptionsTabTypography(739),    
    /**@ User Information tab of the Options dialog box. */
    wdDialogToolsOptionsTabUserInfo(213),    
    /**@ View tab of the Options dialog box. */
    wdDialogToolsOptionsTabView(204),    
    /**@ Browsers tab of the Web Options dialog box. */
    wdDialogWebOptionsBrowsers(2000000),    
    /**@ Encoding tab of the Web Options dialog box. */
    wdDialogWebOptionsEncoding(2000003),    
    /**@ Files tab of the Web Options dialog box. */
    wdDialogWebOptionsFiles(2000001),    
    /**@ Fonts tab of the Web Options dialog box. */
    wdDialogWebOptionsFonts(2000004),    
    /**@ General tab of the Web Options dialog box. */
    wdDialogWebOptionsGeneral(2000000),    
    /**@ Pictures tab of the Web Options dialog box. */
    wdDialogWebOptionsPictures(2000002),    
    /**@ Edit tab of the Style Management dialog box. */
    wdDialogStyleManagementTabEdit(2200000),    
    /**@ Recommend tab of the Style Management dialog box. */
    wdDialogStyleManagementTabRecommend(2200001),    
    /**@ Restrict tab of the Style Management dialog box. */
    wdDialogStyleManagementTabRestrict(2200002);

    private final long value;

    WdWordDialogTab(long value) {
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
