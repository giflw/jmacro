package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdworddialog">https://docs.microsoft.com/en-us/office/vba/api/word.wdworddialog</a>}
*/
public enum WdWordDialog implements COMEnum {
    
    /**@ (none) */
    wdDialogBuildingBlockOrganizer(2067),    
    /**@ Drive, Path, Password */
    wdDialogConnect(420),    
    /**@ (none) */
    wdDialogConsistencyChecker(1121),    
    /**@ (none) */
    wdDialogContentControlProperties(2394),    
    /**@ Application */
    wdDialogControlRun(235),    
    /**@ IconNumber, ActivateAs, IconFileName, Caption, Class, DisplayIcon, Floating */
    wdDialogConvertObject(392),    
    /**@ FileName, Directory */
    wdDialogCopyFile(300),    
    /**@ (none) */
    wdDialogCreateAutoText(872),    
    /**@ (none) */
    wdDialogCreateSource(1922),    
    /**@ LinkStyles */
    wdDialogCSSLinks(1261),    
    /**@ (none) */
    wdDialogDocumentInspector(1482),    
    /**@ FileName, Directory, Template, Title, Created, LastSaved, LastSavedBy, Revision, Time, Printed, Pages, Words, Characters, Paragraphs, Lines, FileSize */
    wdDialogDocumentStatistics(78),    
    /**@ Horizontal, Vertical, RelativeTo */
    wdDialogDrawAlign(634),    
    /**@ SnapToGrid, XGrid, YGrid, XOrigin, YOrigin, SnapToShapes, XGridDisplay, YGridDisplay, FollowMargins, ViewGridLines, DefineLineBasedOnGrid */
    wdDialogDrawSnapToGrid(633),    
    /**@ Name, Context, InsertAs, Insert, Add, Define, InsertAsText, Delete, CompleteAT */
    wdDialogEditAutoText(985),    
    /**@ Macintosh-only. For information about this constant, consult the language reference Help included with Microsoft Office Macintosh Edition. */
    wdDialogEditCreatePublisher(732),    
    /**@ Find, Replace, Direction, MatchCase, WholeWord, PatternMatch, SoundsLike, FindNext, ReplaceOne, ReplaceAll, Format, Wrap, FindAllWordForms, MatchByte, FuzzyFind, Destination, CorrectEnd, MatchKashida, MatchDiacritics, MatchAlefHamza, MatchControl */
    wdDialogEditFind(112),    
    /**@ Wrap, WidthRule, FixedWidth, HeightRule, FixedHeight, PositionHorz, PositionHorzRel, DistFromText, PositionVert, PositionVertRel, DistVertFromText, MoveWithText, LockAnchor, RemoveFrame */
    wdDialogEditFrame(458),    
    /**@ Find, Replace, Direction, MatchCase, WholeWord, PatternMatch, SoundsLike, FindNext, ReplaceOne, ReplaceAll, Format, Wrap, FindAllWordForms, MatchByte, FuzzyFind, Destination, CorrectEnd, MatchKashida, MatchDiacritics, MatchAlefHamza, MatchControl */
    wdDialogEditGoTo(896),    
    /**@ (none) */
    wdDialogEditGoToOld(811),    
    /**@ UpdateMode, Locked, SavePictureInDoc, UpdateNow, OpenSource, KillLink, Link, Application, Item, FileName, PreserveFormatLinkUpdate */
    wdDialogEditLinks(124),    
    /**@ Verb */
    wdDialogEditObject(125),    
    /**@ IconNumber, Link, DisplayIcon, Class, DataType, IconFileName, Caption, Floating */
    wdDialogEditPasteSpecial(111),    
    /**@ Macintosh-only. For information about this constant, consult the language reference Help included with Microsoft Office Macintosh Edition. */
    wdDialogEditPublishOptions(735),    
    /**@ Find, Replace, Direction, MatchCase, WholeWord, PatternMatch, SoundsLike, FindNext, ReplaceOne, ReplaceAll, Format, Wrap, FindAllWordForms, MatchByte, FuzzyFind, Destination, CorrectEnd, MatchKashida, MatchDiacritics, MatchAlefHamza, MatchControl */
    wdDialogEditReplace(117),    
    /**@ (none) */
    wdDialogEditStyle(120),    
    /**@ Macintosh-only. For information about this constant, consult the language reference Help included with Microsoft Office Macintosh Edition. */
    wdDialogEditSubscribeOptions(736),    
    /**@ Macintosh-only. For information about this constant, consult the language reference Help included with Microsoft Office Macintosh Edition. */
    wdDialogEditSubscribeTo(733),    
    /**@ Category, CategoryName */
    wdDialogEditTOACategory(625),    
    /**@ (none) */
    wdDialogEmailOptions(863),    
    /**@ Tab, PaperSize, TopMargin, BottomMargin, LeftMargin, RightMargin, Gutter, PageWidth, PageHeight, Orientation, FirstPage, OtherPages, VertAlign, ApplyPropsTo, Default, FacingPages, HeaderDistance, FooterDistance, SectionStart, OddAndEvenPages, DifferentFirstPage, Endnotes, LineNum, StartingNum, FromText, CountBy, NumMode, TwoOnOne, GutterPosition, LayoutMode, CharsLine, LinesPage, CharPitch, LinePitch, DocFontName, DocFontSize, PageColumns, TextFlow, FirstPageOnLeft, SectionType, RTLAlignment */
    wdDialogFileDocumentLayout(178),    
    /**@ SearchName, SearchPath, Name, SubDir, Title, Author, Keywords, Subject, Options, MatchCase, Text, PatternMatch, DateSavedFrom, DateSavedTo, SavedBy, DateCreatedFrom, DateCreatedTo, View, SortBy, ListBy, SelectedFile, Add, Delete, ShowFolders, MatchByte */
    wdDialogFileFind(99),    
    /**@ Macintosh-only. For information about this constant, consult the language reference Help included with Microsoft Office Macintosh Edition. */
    wdDialogFileMacCustomPageSetupGX(737),    
    /**@ Macintosh-only. For information about this constant, consult the language reference Help included with Microsoft Office Macintosh Edition. */
    wdDialogFileMacPageSetup(685),    
    /**@ Macintosh-only. For information about this constant, consult the language reference Help included with Microsoft Office Macintosh Edition. */
    wdDialogFileMacPageSetupGX(444),    
    /**@ Template, NewTemplate, DocumentType, Visible */
    wdDialogFileNew(79),    
    /**@ Name, ConfirmConversions, ReadOnly, LinkToSource, AddToMru, PasswordDoc, PasswordDot, Revert, WritePasswordDoc, WritePasswordDot, Connection, SQLStatement, SQLStatement1, Format, Encoding, Visible, OpenExclusive, OpenAndRepair, SubType, DocumentDirection, NoEncodingDialog, XMLTransform */
    wdDialogFileOpen(80),    
    /**@ Tab, PaperSize, TopMargin, BottomMargin, LeftMargin, RightMargin, Gutter, PageWidth, PageHeight, Orientation, FirstPage, OtherPages, VertAlign, ApplyPropsTo, Default, FacingPages, HeaderDistance, FooterDistance, SectionStart, OddAndEvenPages, DifferentFirstPage, Endnotes, LineNum, StartingNum, FromText, CountBy, NumMode, TwoOnOne, GutterPosition, LayoutMode, CharsLine, LinesPage, CharPitch, LinePitch, DocFontName, DocFontSize, PageColumns, TextFlow, FirstPageOnLeft, SectionType, RTLAlignment, FolioPrint */
    wdDialogFilePageSetup(178),    
    /**@ Background, AppendPrFile, Range, PrToFileName, From, To, Type, NumCopies, Pages, Order, PrintToFile, Collate, FileName, Printer, OutputPrinter, DuplexPrint, PrintZoomColumn, PrintZoomRow, PrintZoomPaperWidth, PrintZoomPaperHeight, ZoomPaper */
    wdDialogFilePrint(88),    
    /**@ Macintosh-only. For information about this constant, consult the language reference Help included with Microsoft Office Macintosh Edition. */
    wdDialogFilePrintOneCopy(445),    
    /**@ Printer, Options, Network, DoNotSetAsSysDefault */
    wdDialogFilePrintSetup(97),    
    /**@ Subject, Message, AllAtOnce, ReturnWhenDone, TrackStatus, Protect, AddSlip, RouteDocument, AddRecipient, OldRecipient, ResetSlip, ClearSlip, ClearRecipients, Address */
    wdDialogFileRoutingSlip(624),    
    /**@ Name, Format, LockAnnot, Password, AddToMru, WritePassword, RecommendReadOnly, EmbedFonts, NativePictureFormat, FormsData, SaveAsAOCELetter, WriteVersion, VersionDesc, InsertLineBreaks, AllowSubstitutions, LineEnding, AddBiDiMarks */
    wdDialogFileSaveAs(84),    
    /**@ (none) */
    wdDialogFileSaveVersion(1007),    
    /**@ Title, Subject, Author, Keywords, Comments, FileName, Directory, Template, CreateDate, LastSavedDate, LastSavedBy, RevisionNumber, EditTime, LastPrintedDate, NumPages, NumWords, NumChars, NumParas, NumLines, Update, FileSize */
    wdDialogFileSummaryInfo(86),    
    /**@ AutoVersion, VersionDesc */
    wdDialogFileVersions(945),    
    /**@ FitTextWidth */
    wdDialogFitText(983),    
    /**@ UnavailableFont, SubstituteFont */
    wdDialogFontSubstitution(581),    
    /**@ Points, Underline, Color, StrikeThrough, Superscript, Subscript, Hidden, SmallCaps, AllCaps, Spacing, Position, Kerning, KerningMin, Default, Tab, Font, Bold, Italic, DoubleStrikeThrough, Shadow, Outline, Emboss, Engrave, Scale, Animations, CharAccent, FontMajor, FontLowAnsi, FontHighAnsi, CharacterWidthGrid, ColorRGB, UnderlineColor, PointsBi, ColorBi, FontNameBi, BoldBi, ItalicBi, DiacColor */
    wdDialogFormatAddrFonts(103),    
    /**@ ApplyTo, Shadow, TopBorder, LeftBorder, BottomBorder, RightBorder, HorizBorder, VertBorder, TopColor, LeftColor, BottomColor, RightColor, HorizColor, VertColor, FromText, Shading, Foreground, Background, Tab, FineShading, TopStyle, LeftStyle, BottomStyle, RightStyle, HorizStyle, VertStyle, TopWeight, LeftWeight, BottomWeight, RightWeight, HorizWeight, VertWeight, BorderObjectType, BorderArtWeight, BorderArt, FromTextTop, FromTextBottom, FromTextLeft, FromTextRight, OffsetFrom, InFront, SurroundHeader, SurroundFooter, JoinBorder, LineColor, WhichPages, TL2BRBorder, TR2BLBorder, TL2BRColor, TR2BLColor, TL2BRStyle, TR2BLStyle, TL2BRWeight, TR2BLWeight, ForegroundRGB, BackgroundRGB, TopColorRGB, LeftColorRGB, BottomColorRGB, RightColorRGB, HorizColorRGB, VertColorRGB, TL2BRColorRGB, TR2BLColorRGB, LineColorRGB */
    wdDialogFormatBordersAndShading(189),    
    /**@ (none) */
    wdDialogFormatBulletsAndNumbering(824),    
    /**@ Type, Gap, Angle, Drop, Length, Border, AutoAttach, Accent */
    wdDialogFormatCallout(610),    
    /**@ Type */
    wdDialogFormatChangeCase(322),    
    /**@ Columns, ColumnNo, ColumnWidth, ColumnSpacing, EvenlySpaced, ApplyColsTo, ColLine, StartNewCol, FlowColumnsRtl */
    wdDialogFormatColumns(177),    
    /**@ ApplyTo, Shadow, TopBorder, LeftBorder, BottomBorder, RightBorder, HorizBorder, VertBorder, TopColor, LeftColor, BottomColor, RightColor, HorizColor, VertColor, FromText, Shading, Foreground, Background, Tab, FineShading, TopStyle, LeftStyle, BottomStyle, RightStyle, HorizStyle, VertStyle, TopWeight, LeftWeight, BottomWeight, RightWeight, HorizWeight, VertWeight, BorderObjectType, BorderArtWeight, BorderArt, FromTextTop, FromTextBottom, FromTextLeft, FromTextRight, OffsetFrom, InFront, SurroundHeader, SurroundFooter, JoinBorder, LineColor, WhichPages, TL2BRBorder, TR2BLBorder, TL2BRColor, TR2BLColor, TL2BRStyle, TR2BLStyle, TL2BRWeight, TR2BLWeight, ForegroundRGB, BackgroundRGB, TopColorRGB, LeftColorRGB, BottomColorRGB, RightColorRGB, HorizColorRGB, VertColorRGB, TL2BRColorRGB, TR2BLColorRGB, LineColorRGB */
    wdDialogFormatDefineStyleBorders(185),    
    /**@ Points, Underline, Color, StrikeThrough, Superscript, Subscript, Hidden, SmallCaps, AllCaps, Spacing, Position, Kerning, KerningMin, Default, Tab, Font, Bold, Italic, DoubleStrikeThrough, Shadow, Outline, Emboss, Engrave, Scale, Animations, CharAccent, FontMajor, FontLowAnsi, FontHighAnsi, CharacterWidthGrid, ColorRGB, UnderlineColor, PointsBi, ColorBi, FontNameBi, BoldBi, ItalicBi, DiacColor */
    wdDialogFormatDefineStyleFont(181),    
    /**@ Wrap, WidthRule, FixedWidth, HeightRule, FixedHeight, PositionHorz, PositionHorzRel, DistFromText, PositionVert, PositionVertRel, DistVertFromText, MoveWithText, LockAnchor, RemoveFrame */
    wdDialogFormatDefineStyleFrame(184),    
    /**@ Language, CheckLanguage, Default, NoProof */
    wdDialogFormatDefineStyleLang(186),    
    /**@ LeftIndent, RightIndent, Before, After, LineSpacingRule, LineSpacing, Alignment, WidowControl, KeepWithNext, KeepTogether, PageBreak, NoLineNum, DontHyphen, Tab, FirstIndent, OutlineLevel, Kinsoku, WordWrap, OverflowPunct, TopLinePunct, AutoSpaceDE, LineHeightGrid, AutoSpaceDN, CharAlign, CharacterUnitLeftIndent, AdjustRight, CharacterUnitFirstIndent, CharacterUnitRightIndent, LineUnitBefore, LineUnitAfter, NoSpaceBetweenParagraphsOfSameStyle, OrientationBi */
    wdDialogFormatDefineStylePara(182),    
    /**@ Position, DefTabs, Align, Leader, Set, Clear, ClearAll */
    wdDialogFormatDefineStyleTabs(183),    
    /**@ Left, PositionHorzRel, Top, PositionVertRel, LockAnchor, FloatOverText, LayoutInCell, WrapSide, TopDistanceFromText, BottomDistanceFromText, LeftDistanceFromText, RightDistanceFromText, Wrap, WordWrap, AutoSize, HRWidthType, HRHeight, HRNoshade, HRAlign, Text, AllowOverlap, HorizRule */
    wdDialogFormatDrawingObject(960),    
    /**@ Position, Font, DropHeight, DistFromText */
    wdDialogFormatDropCap(488),    
    /**@ Style, Text, Enclosure */
    wdDialogFormatEncloseCharacters(1162),    
    /**@ Points, Underline, Color, StrikeThrough, Superscript, Subscript, Hidden, SmallCaps, AllCaps, Spacing, Position, Kerning, KerningMin, Default, Tab, Font, Bold, Italic, DoubleStrikeThrough, Shadow, Outline, Emboss, Engrave, Scale, Animations, CharAccent, FontMajor, FontLowAnsi, FontHighAnsi, CharacterWidthGrid, ColorRGB, UnderlineColor, PointsBi, ColorBi, FontNameBi, BoldBi, ItalicBi, DiacColor */
    wdDialogFormatFont(174),    
    /**@ Wrap, WidthRule, FixedWidth, HeightRule, FixedHeight, PositionHorz, PositionHorzRel, DistFromText, PositionVert, PositionVertRel, DistVertFromText, MoveWithText, LockAnchor, RemoveFrame */
    wdDialogFormatFrame(190),    
    /**@ ChapterNumber, NumRestart, NumFormat, StartingNum, Level, Separator, DoubleQuote, PgNumberingStyle */
    wdDialogFormatPageNumber(298),    
    /**@ LeftIndent, RightIndent, Before, After, LineSpacingRule, LineSpacing, Alignment, WidowControl, KeepWithNext, KeepTogether, PageBreak, NoLineNum, DontHyphen, Tab, FirstIndent, OutlineLevel, Kinsoku, WordWrap, OverflowPunct, TopLinePunct, AutoSpaceDE, LineHeightGrid, AutoSpaceDN, CharAlign, CharacterUnitLeftIndent, AdjustRight, CharacterUnitFirstIndent, CharacterUnitRightIndent, LineUnitBefore, LineUnitAfter, NoSpaceBetweenParagraphsOfSameStyle, OrientationBi */
    wdDialogFormatParagraph(175),    
    /**@ SetSize, CropLeft, CropRight, CropTop, CropBottom, ScaleX, ScaleY, SizeX, SizeY */
    wdDialogFormatPicture(187),    
    /**@ Points, Underline, Color, StrikeThrough, Superscript, Subscript, Hidden, SmallCaps, AllCaps, Spacing, Position, Kerning, KerningMin, Default, Tab, Font, Bold, Italic, DoubleStrikeThrough, Shadow, Outline, Emboss, Engrave, Scale, Animations, CharAccent, FontMajor, FontLowAnsi, FontHighAnsi, CharacterWidthGrid, ColorRGB, UnderlineColor, PointsBi, ColorBi, FontNameBi, BoldBi, ItalicBi, DiacColor */
    wdDialogFormatRetAddrFonts(221),    
    /**@ SectionStart, VertAlign, Endnotes, LineNum, StartingNum, FromText, CountBy, NumMode, SectionType */
    wdDialogFormatSectionLayout(176),    
    /**@ Name, Delete, Merge, NewName, BasedOn, NextStyle, Type, FileName, Source, AddToTemplate, Define, Rename, Apply, New, Link */
    wdDialogFormatStyle(180),    
    /**@ Template, Preview */
    wdDialogFormatStyleGallery(505),    
    /**@ (none) */
    wdDialogFormatStylesCustom(1248),    
    /**@ Position, DefTabs, Align, Leader, Set, Clear, ClearAll */
    wdDialogFormatTabs(179),    
    /**@ (none) */
    wdDialogFormatTheme(855),    
    /**@ (none) */
    wdDialogFormattingRestrictions(1427),    
    /**@ (none) */
    wdDialogFormFieldHelp(361),    
    /**@ Entry, Exit, Name, Enable, TextType, TextWidth, TextDefault, TextFormat, CheckSize, CheckWidth, CheckDefault, Type, OwnHelp, HelpText, OwnStat, StatText, Calculate */
    wdDialogFormFieldOptions(353),    
    /**@ (none) */
    wdDialogFrameSetProperties(1074),    
    /**@ APPNAME, APPCOPYRIGHT, APPUSERNAME, APPORGANIZATION, APPSERIALNUMBER */
    wdDialogHelpAbout(9),    
    /**@ WPCommand, HelpText, DemoGuidance */
    wdDialogHelpWordPerfectHelp(10),    
    /**@ CommandKeyHelp, DocNavKeys, MouseSimulation, DemoGuidance, DemoSpeed, HelpType */
    wdDialogHelpWordPerfectHelpOptions(511),    
    /**@ (none) */
    wdDialogHorizontalInVertical(1160),    
    /**@ (none) */
    wdDialogIMESetDefault(1094),    
    /**@ Name */
    wdDialogInsertAddCaption(402),    
    /**@ Clear, ClearAll, Object, Label, Position */
    wdDialogInsertAutoCaption(359),    
    /**@ Name, SortBy, Add, Delete, Goto, Hidden */
    wdDialogInsertBookmark(168),    
    /**@ Type */
    wdDialogInsertBreak(159),    
    /**@ Label, TitleAutoText, Title, Delete, Position, AutoCaption, ExcludeLabel */
    wdDialogInsertCaption(357),    
    /**@ Label, FormatNumber, ChapterNumber, Level, Separator, CapNumberingStyle */
    wdDialogInsertCaptionNumbering(358),    
    /**@ ReferenceType, ReferenceKind, ReferenceItem, InsertAsHyperLink, InsertPosition, SeparateNumbers, SeparatorCharacters */
    wdDialogInsertCrossReference(367),    
    /**@ Format, Style, LinkToSource, Connection, SQLStatement, SQLStatement1, PasswordDoc, PasswordDot, DataSource, From, To, IncludeFields, WritePasswordDoc, WritePasswordDot */
    wdDialogInsertDatabase(341),    
    /**@ DateTimePic, InsertAsField, DbCharField, DateLanguage, CalendarType */
    wdDialogInsertDateTime(165),    
    /**@ Field */
    wdDialogInsertField(166),    
    /**@ Name, Range, ConfirmConversions, Link, Attachment */
    wdDialogInsertFile(164),    
    /**@ Reference, NoteType, Symbol, FootNumberAs, EndNumberAs, FootnotesAt, EndnotesAt, FootNumberingStyle, EndNumberingStyle, FootStartingNum, FootRestartNum, EndStartingNum, EndRestartNum, ApplyPropsTo */
    wdDialogInsertFootnote(370),    
    /**@ Entry, Exit, Name, Enable, TextType, TextWidth, TextDefault, TextFormat, CheckSize, CheckWidth, CheckDefault, Type, OwnHelp, HelpText, OwnStat, StatText, Calculate */
    wdDialogInsertFormField(483),    
    /**@ (none) */
    wdDialogInsertHyperlink(925),    
    /**@ Outline, Fields, From, To, TableId, AddedStyles, Caption, HeadingSeparator, Replace, MarkEntry, AutoMark, MarkCitation, Type, RightAlignPageNumbers, Passim, KeepFormatting, Columns, Category, Label, ShowPageNumbers, AccentedLetters, Filter, SortBy, Leader, TOCUseHyperlinks, TOCHidePageNumInWeb, IndexLanguage, UseOutlineLevel */
    wdDialogInsertIndex(170),    
    /**@ Outline, Fields, From, To, TableId, AddedStyles, Caption, HeadingSeparator, Replace, MarkEntry, AutoMark, MarkCitation, Type, RightAlignPageNumbers, Passim, KeepFormatting, Columns, Category, Label, ShowPageNumbers, AccentedLetters, Filter, SortBy, Leader, TOCUseHyperlinks, TOCHidePageNumInWeb, IndexLanguage, UseOutlineLevel */
    wdDialogInsertIndexAndTables(473),    
    /**@ MergeField, WordField */
    wdDialogInsertMergeField(167),    
    /**@ NumPic */
    wdDialogInsertNumber(812),    
    /**@ IconNumber, FileName, Link, DisplayIcon, Tab, Class, IconFileName, Caption, Floating */
    wdDialogInsertObject(172),    
    /**@ Type, Position, FirstPage */
    wdDialogInsertPageNumbers(294),    
    /**@ Name, LinkToFile, New, FloatOverText */
    wdDialogInsertPicture(163),    
    /**@ (none) */
    wdDialogInsertPlaceholder(2348),    
    /**@ (none) */
    wdDialogInsertSource(2120),    
    /**@ Name, ConfirmConversions, ReadOnly, LinkToSource, AddToMru, PasswordDoc, PasswordDot, Revert, WritePasswordDoc, WritePasswordDot, Connection, SQLStatement, SQLStatement1, Format, Encoding, Visible, OpenExclusive, OpenAndRepair, SubType, DocumentDirection, NoEncodingDialog, XMLTransform */
    wdDialogInsertSubdocument(583),    
    /**@ Font, Tab, CharNum, CharNumLow, Unicode, Hint */
    wdDialogInsertSymbol(162),    
    /**@ Outline, Fields, From, To, TableId, AddedStyles, Caption, HeadingSeparator, Replace, MarkEntry, AutoMark, MarkCitation, Type, RightAlignPageNumbers, Passim, KeepFormatting, Columns, Category, Label, ShowPageNumbers, AccentedLetters, Filter, SortBy, Leader, TOCUseHyperlinks, TOCHidePageNumInWeb, IndexLanguage, UseOutlineLevel */
    wdDialogInsertTableOfAuthorities(471),    
    /**@ Outline, Fields, From, To, TableId, AddedStyles, Caption, HeadingSeparator, Replace, MarkEntry, AutoMark, MarkCitation, Type, RightAlignPageNumbers, Passim, KeepFormatting, Columns, Category, Label, ShowPageNumbers, AccentedLetters, Filter, SortBy, Leader, TOCUseHyperlinks, TOCHidePageNumInWeb, IndexLanguage, UseOutlineLevel */
    wdDialogInsertTableOfContents(171),    
    /**@ Outline, Fields, From, To, TableId, AddedStyles, Caption, HeadingSeparator, Replace, MarkEntry, AutoMark, MarkCitation, Type, RightAlignPageNumbers, Passim, KeepFormatting, Columns, Category, Label, ShowPageNumbers, AccentedLetters, Filter, SortBy, Leader, TOCUseHyperlinks, TOCHidePageNumInWeb, IndexLanguage, UseOutlineLevel */
    wdDialogInsertTableOfFigures(472),    
    /**@ IconNumber, FileName, Link, DisplayIcon, Tab, Class, IconFileName, Caption, Floating */
    wdDialogInsertWebComponent(1324),    
    /**@ (none) */
    wdDialogLabelOptions(1367),    
    /**@ SenderCity, DateFormat, IncludeHeaderFooter, LetterStyle, Letterhead, LetterheadLocation, LetterheadSize, RecipientName, RecipientAddress, Salutation, SalutationType, RecipientGender, RecipientReference, MailingInstructions, AttentionLine, LetterSubject, CCList, SenderName, ReturnAddress, Closing, SenderJobTitle, SenderCompany, SenderInitials, EnclosureNumber, PageDesign, InfoBlock, SenderGender, ReturnAddressSF, RecipientCode, SenderCode, SenderReference */
    wdDialogLetterWizard(821),    
    /**@ ListType */
    wdDialogListCommands(723),    
    /**@ CheckErrors, Destination, MergeRecords, From, To, Suppression, MailMerge, QueryOptions, MailSubject, MailAsAttachment, MailAddress */
    wdDialogMailMerge(676),    
    /**@ CheckErrors */
    wdDialogMailMergeCheck(677),    
    /**@ FileName, PasswordDoc, PasswordDot, HeaderRecord, MSQuery, SQLStatement, SQLStatement1, Connection, LinkToSource, WritePasswordDoc */
    wdDialogMailMergeCreateDataSource(642),    
    /**@ FileName, PasswordDoc, PasswordDot, HeaderRecord, MSQuery, SQLStatement, SQLStatement1, Connection, LinkToSource, WritePasswordDoc */
    wdDialogMailMergeCreateHeaderSource(643),    
    /**@ (none) */
    wdDialogMailMergeFieldMapping(1304),    
    /**@ (none) */
    wdDialogMailMergeFindRecipient(1326),    
    /**@ (none) */
    wdDialogMailMergeFindRecord(569),    
    /**@ (none) */
    wdDialogMailMergeHelper(680),    
    /**@ (none) */
    wdDialogMailMergeInsertAddressBlock(1305),    
    /**@ (none) */
    wdDialogMailMergeInsertAsk(4047),    
    /**@ (none) */
    wdDialogMailMergeInsertFields(1307),    
    /**@ (none) */
    wdDialogMailMergeInsertFillIn(4048),    
    /**@ (none) */
    wdDialogMailMergeInsertGreetingLine(1306),    
    /**@ (none) */
    wdDialogMailMergeInsertIf(4049),    
    /**@ (none) */
    wdDialogMailMergeInsertNextIf(4053),    
    /**@ (none) */
    wdDialogMailMergeInsertSet(4054),    
    /**@ (none) */
    wdDialogMailMergeInsertSkipIf(4055),    
    /**@ (none) */
    wdDialogMailMergeOpenDataSource(81),    
    /**@ (none) */
    wdDialogMailMergeOpenHeaderSource(82),    
    /**@ (none) */
    wdDialogMailMergeQueryOptions(681),    
    /**@ (none) */
    wdDialogMailMergeRecipients(1308),    
    /**@ (none) */
    wdDialogMailMergeSetDocumentType(1339),    
    /**@ (none) */
    wdDialogMailMergeUseAddressBook(779),    
    /**@ (none) */
    wdDialogMarkCitation(463),    
    /**@ (none) */
    wdDialogMarkIndexEntry(169),    
    /**@ (none) */
    wdDialogMarkTableOfContentsEntry(442),    
    /**@ (none) */
    wdDialogMyPermission(1437),    
    /**@ (none) */
    wdDialogNewToolbar(586),    
    /**@ (none) */
    wdDialogNoteOptions(373),    
    /**@ (none) */
    wdDialogOMathRecognizedFunctions(2165),    
    /**@ (none) */
    wdDialogOrganizer(222),    
    /**@ (none) */
    wdDialogPermission(1469),    
    /**@ (none) */
    wdDialogPhoneticGuide(986),    
    /**@ (none) */
    wdDialogReviewAfmtRevisions(570),    
    /**@ (none) */
    wdDialogSchemaLibrary(1417),    
    /**@ (none) */
    wdDialogSearch(1363),    
    /**@ (none) */
    wdDialogShowRepairs(1381),    
    /**@ (none) */
    wdDialogSourceManager(1920),    
    /**@ (none) */
    wdDialogStyleManagement(1948),    
    /**@ (none) */
    wdDialogTableAutoFormat(563),    
    /**@ (none) */
    wdDialogTableCellOptions(1081),    
    /**@ (none) */
    wdDialogTableColumnWidth(143),    
    /**@ (none) */
    wdDialogTableDeleteCells(133),    
    /**@ (none) */
    wdDialogTableFormatCell(612),    
    /**@ (none) */
    wdDialogTableFormula(348),    
    /**@ (none) */
    wdDialogTableInsertCells(130),    
    /**@ (none) */
    wdDialogTableInsertRow(131),    
    /**@ (none) */
    wdDialogTableInsertTable(129),    
    /**@ (none) */
    wdDialogTableOfCaptionsOptions(551),    
    /**@ (none) */
    wdDialogTableOfContentsOptions(470),    
    /**@ (none) */
    wdDialogTableProperties(861),    
    /**@ (none) */
    wdDialogTableRowHeight(142),    
    /**@ (none) */
    wdDialogTableSort(199),    
    /**@ (none) */
    wdDialogTableSplitCells(137),    
    /**@ (none) */
    wdDialogTableTableOptions(1080),    
    /**@ (none) */
    wdDialogTableToText(128),    
    /**@ (none) */
    wdDialogTableWrapping(854),    
    /**@ (none) */
    wdDialogTCSCTranslator(1156),    
    /**@ (none) */
    wdDialogTextToTable(127),    
    /**@ (none) */
    wdDialogToolsAcceptRejectChanges(506),    
    /**@ (none) */
    wdDialogToolsAdvancedSettings(206),    
    /**@ (none) */
    wdDialogToolsAutoCorrect(378),    
    /**@ (none) */
    wdDialogToolsAutoCorrectExceptions(762),    
    /**@ (none) */
    wdDialogToolsAutoManager(915),    
    /**@ (none) */
    wdDialogToolsAutoSummarize(874),    
    /**@ (none) */
    wdDialogToolsBulletsNumbers(196),    
    /**@ (none) */
    wdDialogToolsCompareDocuments(198),    
    /**@ (none) */
    wdDialogToolsCreateDirectory(833),    
    /**@ (none) */
    wdDialogToolsCreateEnvelope(173),    
    /**@ (none) */
    wdDialogToolsCreateLabels(489),    
    /**@ (none) */
    wdDialogToolsCustomize(152),    
    /**@ (none) */
    wdDialogToolsCustomizeKeyboard(432),    
    /**@ (none) */
    wdDialogToolsCustomizeMenuBar(615),    
    /**@ (none) */
    wdDialogToolsCustomizeMenus(433),    
    /**@ (none) */
    wdDialogToolsDictionary(989),    
    /**@ (none) */
    wdDialogToolsEnvelopesAndLabels(607),    
    /**@ (none) */
    wdDialogToolsGrammarSettings(885),    
    /**@ (none) */
    wdDialogToolsHangulHanjaConversion(784),    
    /**@ (none) */
    wdDialogToolsHighlightChanges(197),    
    /**@ (none) */
    wdDialogToolsHyphenation(195),    
    /**@ (none) */
    wdDialogToolsLanguage(188),    
    /**@ (none) */
    wdDialogToolsMacro(215),    
    /**@ (none) */
    wdDialogToolsMacroRecord(214),    
    /**@ (none) */
    wdDialogToolsManageFields(631),    
    /**@ (none) */
    wdDialogToolsMergeDocuments(435),    
    /**@ (none) */
    wdDialogToolsOptions(974),    
    /**@ (none) */
    wdDialogToolsOptionsAutoFormat(959),    
    /**@ (none) */
    wdDialogToolsOptionsAutoFormatAsYouType(778),    
    /**@ (none) */
    wdDialogToolsOptionsBidi(1029),    
    /**@ (none) */
    wdDialogToolsOptionsCompatibility(525),    
    /**@ (none) */
    wdDialogToolsOptionsEdit(224),    
    /**@ (none) */
    wdDialogToolsOptionsEditCopyPaste(1356),    
    /**@ (none) */
    wdDialogToolsOptionsFileLocations(225),    
    /**@ (none) */
    wdDialogToolsOptionsFuzzy(790),    
    /**@ (none) */
    wdDialogToolsOptionsGeneral(203),    
    /**@ (none) */
    wdDialogToolsOptionsPrint(208),    
    /**@ (none) */
    wdDialogToolsOptionsSave(209),    
    /**@ (none) */
    wdDialogToolsOptionsSecurity(1361),    
    /**@ (none) */
    wdDialogToolsOptionsSmartTag(1395),    
    /**@ (none) */
    wdDialogToolsOptionsSpellingAndGrammar(211),    
    /**@ (none) */
    wdDialogToolsOptionsTrackChanges(386),    
    /**@ (none) */
    wdDialogToolsOptionsTypography(739),    
    /**@ (none) */
    wdDialogToolsOptionsUserInfo(213),    
    /**@ (none) */
    wdDialogToolsOptionsView(204),    
    /**@ (none) */
    wdDialogToolsProtectDocument(503),    
    /**@ (none) */
    wdDialogToolsProtectSection(578),    
    /**@ (none) */
    wdDialogToolsRevisions(197),    
    /**@ (none) */
    wdDialogToolsSpellingAndGrammar(828),    
    /**@ (none) */
    wdDialogToolsTemplates(87),    
    /**@ (none) */
    wdDialogToolsThesaurus(194),    
    /**@ (none) */
    wdDialogToolsUnprotectDocument(521),    
    /**@ (none) */
    wdDialogToolsWordCount(228),    
    /**@ (none) */
    wdDialogTwoLinesInOne(1161),    
    /**@ (none) */
    wdDialogUpdateTOC(331),    
    /**@ (none) */
    wdDialogViewZoom(577),    
    /**@ (none) */
    wdDialogWebOptions(898),    
    /**@ (none) */
    wdDialogWindowActivate(220),    
    /**@ (none) */
    wdDialogXMLElementAttributes(1460),    
    /**@ (none) */
    wdDialogXMLOptions(1425);

    private final long value;

    WdWordDialog(long value) {
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
