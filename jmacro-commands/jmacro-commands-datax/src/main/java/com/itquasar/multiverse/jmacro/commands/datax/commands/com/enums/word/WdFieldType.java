package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdfieldtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdfieldtype</a>}
*/
public enum WdFieldType implements COMEnum {
    
    /**@ Add-in field. Not available through the Field dialog box. Used to store data that is hidden from the user interface. */
    wdFieldAddin(81),    
    /**@ AddressBlock field. */
    wdFieldAddressBlock(93),    
    /**@ Advance field. */
    wdFieldAdvance(84),    
    /**@ Ask field. */
    wdFieldAsk(38),    
    /**@ Author field. */
    wdFieldAuthor(17),    
    /**@ AutoNum field. */
    wdFieldAutoNum(54),    
    /**@ AutoNumLgl field. */
    wdFieldAutoNumLegal(53),    
    /**@ AutoNumOut field. */
    wdFieldAutoNumOutline(52),    
    /**@ AutoText field. */
    wdFieldAutoText(79),    
    /**@ AutoTextList field. */
    wdFieldAutoTextList(89),    
    /**@ BarCode field. */
    wdFieldBarCode(63),    
    /**@ BidiOutline field. */
    wdFieldBidiOutline(92),    
    /**@ Comments field. */
    wdFieldComments(19),    
    /**@ Compare field. */
    wdFieldCompare(80),    
    /**@ CreateDate field. */
    wdFieldCreateDate(21),    
    /**@ Data field. */
    wdFieldData(40),    
    /**@ Database field. */
    wdFieldDatabase(78),    
    /**@ Date field. */
    wdFieldDate(31),    
    /**@ DDE field. No longer available through the Field dialog box, but supported for documents created in earlier versions of Word. */
    wdFieldDDE(45),    
    /**@ DDEAuto field. No longer available through the Field dialog box, but supported for documents created in earlier versions of Word. */
    wdFieldDDEAuto(46),    
    /**@ DisplayBarcode field. */
    wdFieldDisplayBarcode(99),    
    /**@ DocProperty field. */
    wdFieldDocProperty(85),    
    /**@ DocVariable field. */
    wdFieldDocVariable(64),    
    /**@ EditTime field. */
    wdFieldEditTime(25),    
    /**@ Embedded field. */
    wdFieldEmbed(58),    
    /**@ Empty field. Acts as a placeholder for field content that has not yet been added. A field added by pressing Ctrl+F9 in the user interface is an Empty field. */
    wdFieldEmpty(-1),    
    /**@ = (Formula) field. */
    wdFieldExpression(34),    
    /**@ FileName field. */
    wdFieldFileName(29),    
    /**@ FileSize field. */
    wdFieldFileSize(69),    
    /**@ Fill-In field. */
    wdFieldFillIn(39),    
    /**@ FootnoteRef field. Not available through the Field dialog box. Inserted programmatically or interactively. */
    wdFieldFootnoteRef(5),    
    /**@ FormCheckBox field. */
    wdFieldFormCheckBox(71),    
    /**@ FormDropDown field. */
    wdFieldFormDropDown(83),    
    /**@ FormText field. */
    wdFieldFormTextInput(70),    
    /**@ EQ (Equation) field. */
    wdFieldFormula(49),    
    /**@ Glossary field. No longer supported in Word. */
    wdFieldGlossary(47),    
    /**@ GoToButton field. */
    wdFieldGoToButton(50),    
    /**@ GreetingLine field. */
    wdFieldGreetingLine(94),    
    /**@ HTMLActiveX field. Not currently supported. */
    wdFieldHTMLActiveX(91),    
    /**@ Hyperlink field. */
    wdFieldHyperlink(88),    
    /**@ If field. */
    wdFieldIf(7),    
    /**@ Import field. Cannot be added through the Field dialog box, but can be added interactively or through code. */
    wdFieldImport(55),    
    /**@ Include field. Cannot be added through the Field dialog box, but can be added interactively or through code. */
    wdFieldInclude(36),    
    /**@ IncludePicture field. */
    wdFieldIncludePicture(67),    
    /**@ IncludeText field. */
    wdFieldIncludeText(68),    
    /**@ Index field. */
    wdFieldIndex(8),    
    /**@ XE (Index Entry) field. */
    wdFieldIndexEntry(4),    
    /**@ Info field. */
    wdFieldInfo(14),    
    /**@ Keywords field. */
    wdFieldKeyWord(18),    
    /**@ LastSavedBy field. */
    wdFieldLastSavedBy(20),    
    /**@ Link field. */
    wdFieldLink(56),    
    /**@ ListNum field. */
    wdFieldListNum(90),    
    /**@ MacroButton field. */
    wdFieldMacroButton(51),    
    /**@ MergeBarcode field. */
    wdFieldMergeBarcode(98),    
    /**@ MergeField field. */
    wdFieldMergeField(59),    
    /**@ MergeRec field. */
    wdFieldMergeRec(44),    
    /**@ MergeSeq field. */
    wdFieldMergeSeq(75),    
    /**@ Next field. */
    wdFieldNext(41),    
    /**@ NextIf field. */
    wdFieldNextIf(42),    
    /**@ NoteRef field. */
    wdFieldNoteRef(72),    
    /**@ NumChars field. */
    wdFieldNumChars(28),    
    /**@ NumPages field. */
    wdFieldNumPages(26),    
    /**@ NumWords field. */
    wdFieldNumWords(27),    
    /**@ OCX field. Cannot be added through the Field dialog box, but can be added through code by using the AddOLEControl method of the Shapes collection or of the InlineShapes collection. */
    wdFieldOCX(87),    
    /**@ Page field. */
    wdFieldPage(33),    
    /**@ PageRef field. */
    wdFieldPageRef(37),    
    /**@ Print field. */
    wdFieldPrint(48),    
    /**@ PrintDate field. */
    wdFieldPrintDate(23),    
    /**@ Private field. */
    wdFieldPrivate(77),    
    /**@ Quote field. */
    wdFieldQuote(35),    
    /**@ Ref field. */
    wdFieldRef(3),    
    /**@ RD (Reference Document) field. */
    wdFieldRefDoc(11),    
    /**@ RevNum field. */
    wdFieldRevisionNum(24),    
    /**@ SaveDate field. */
    wdFieldSaveDate(22),    
    /**@ Section field. */
    wdFieldSection(65),    
    /**@ SectionPages field. */
    wdFieldSectionPages(66),    
    /**@ Seq (Sequence) field. */
    wdFieldSequence(12),    
    /**@ Set field. */
    wdFieldSet(6),    
    /**@ Shape field. Automatically created for any drawn picture. */
    wdFieldShape(95),    
    /**@ SkipIf field. */
    wdFieldSkipIf(43),    
    /**@ StyleRef field. */
    wdFieldStyleRef(10),    
    /**@ Subject field. */
    wdFieldSubject(16),    
    /**@ Macintosh only. For information about this constant, consult the language reference Help included with Microsoft Office Macintosh Edition. */
    wdFieldSubscriber(82),    
    /**@ Symbol field. */
    wdFieldSymbol(57),    
    /**@ Template field. */
    wdFieldTemplate(30),    
    /**@ Time field. */
    wdFieldTime(32),    
    /**@ Title field. */
    wdFieldTitle(15),    
    /**@ TOA (Table of Authorities) field. */
    wdFieldTOA(73),    
    /**@ TOA (Table of Authorities Entry) field. */
    wdFieldTOAEntry(74),    
    /**@ TOC (Table of Contents) field. */
    wdFieldTOC(13),    
    /**@ TOC (Table of Contents Entry) field. */
    wdFieldTOCEntry(9),    
    /**@ UserAddress field. */
    wdFieldUserAddress(62),    
    /**@ UserInitials field. */
    wdFieldUserInitials(61),    
    /**@ UserName field. */
    wdFieldUserName(60),    
    /**@ Bibliography field. */
    wdFieldBibliography(97),    
    /**@ Citation field. */
    wdFieldCitation(96);

    private final long value;

    WdFieldType(long value) {
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
