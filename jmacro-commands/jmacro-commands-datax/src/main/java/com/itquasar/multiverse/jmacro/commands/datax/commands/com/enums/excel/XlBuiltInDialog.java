package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlbuiltindialog">https://docs.microsoft.com/en-us/office/vba/api/excel.xlbuiltindialog</a>}
*/
public enum XlBuiltInDialog implements COMEnum {
    
    /**@ Activate dialog box */
    xlDialogActivate(103),    
    /**@ Active Cell Font dialog box */
    xlDialogActiveCellFont(476),    
    /**@ Add Chart Autoformat dialog box */
    xlDialogAddChartAutoformat(390),    
    /**@ Addin Manager dialog box */
    xlDialogAddinManager(321),    
    /**@ Alignment dialog box */
    xlDialogAlignment(43),    
    /**@ Apply Names dialog box */
    xlDialogApplyNames(133),    
    /**@ Apply Style dialog box */
    xlDialogApplyStyle(212),    
    /**@ AppMove dialog box */
    xlDialogAppMove(170),    
    /**@ AppSize dialog box */
    xlDialogAppSize(171),    
    /**@ Arrange All dialog box */
    xlDialogArrangeAll(12),    
    /**@ Assign To Object dialog box */
    xlDialogAssignToObject(213),    
    /**@ Assign To Tool dialog box */
    xlDialogAssignToTool(293),    
    /**@ Attach Text dialog box */
    xlDialogAttachText(80),    
    /**@ Attach Toolbars dialog box */
    xlDialogAttachToolbars(323),    
    /**@ Auto Correct dialog box */
    xlDialogAutoCorrect(485),    
    /**@ Axes dialog box */
    xlDialogAxes(78),    
    /**@ Border dialog box */
    xlDialogBorder(45),    
    /**@ Calculation dialog box */
    xlDialogCalculation(32),    
    /**@ Cell Protection dialog box */
    xlDialogCellProtection(46),    
    /**@ Change Link dialog box */
    xlDialogChangeLink(166),    
    /**@ Chart Add Data dialog box */
    xlDialogChartAddData(392),    
    /**@ Chart Location dialog box */
    xlDialogChartLocation(527),    
    /**@ Chart Options DataLabel Multiple dialog box */
    xlDialogChartOptionsDataLabelMultiple(724),    
    /**@ Chart Options DataLabels dialog box */
    xlDialogChartOptionsDataLabels(505),    
    /**@ Chart Options DataTable dialog box */
    xlDialogChartOptionsDataTable(506),    
    /**@ Chart SourceData dialog box */
    xlDialogChartSourceData(540),    
    /**@ Chart Trend dialog box */
    xlDialogChartTrend(350),    
    /**@ Chart Type dialog box */
    xlDialogChartType(526),    
    /**@ ChartWizard dialog box */
    xlDialogChartWizard(288),    
    /**@ Checkbox Properties dialog box */
    xlDialogCheckboxProperties(435),    
    /**@ Clear dialog box */
    xlDialogClear(52),    
    /**@ Color Palette dialog box */
    xlDialogColorPalette(161),    
    /**@ Column Width dialog box */
    xlDialogColumnWidth(47),    
    /**@ Combination dialog box */
    xlDialogCombination(73),    
    /**@ Conditional Formatting dialog box */
    xlDialogConditionalFormatting(583),    
    /**@ Consolidate dialog box */
    xlDialogConsolidate(191),    
    /**@ Copy Chart dialog box */
    xlDialogCopyChart(147),    
    /**@ Copy Picture dialog box */
    xlDialogCopyPicture(108),    
    /**@ Create List dialog box */
    xlDialogCreateList(796),    
    /**@ Create Names dialog box */
    xlDialogCreateNames(62),    
    /**@ Create Publisher dialog box */
    xlDialogCreatePublisher(217),    
    /**@ Create Relationship dialog box */
    xlDialogCreateRelationship(1272),    
    /**@ Customize Toolbar dialog box */
    xlDialogCustomizeToolbar(276),    
    /**@ Custom Views dialog box */
    xlDialogCustomViews(493),    
    /**@ Data Delete dialog box */
    xlDialogDataDelete(36),    
    /**@ Data Label dialog box */
    xlDialogDataLabel(379),    
    /**@ Data Label Multiple dialog box */
    xlDialogDataLabelMultiple(723),    
    /**@ Data Series dialog box */
    xlDialogDataSeries(40),    
    /**@ Data Validation dialog box */
    xlDialogDataValidation(525),    
    /**@ Define Name dialog box */
    xlDialogDefineName(61),    
    /**@ Define Style dialog box */
    xlDialogDefineStyle(229),    
    /**@ Delete Format dialog box */
    xlDialogDeleteFormat(111),    
    /**@ Delete Name dialog box */
    xlDialogDeleteName(110),    
    /**@ Demote dialog box */
    xlDialogDemote(203),    
    /**@ Display dialog box */
    xlDialogDisplay(27),    
    /**@ Document Inspector dialog box */
    xlDialogDocumentInspector(862),    
    /**@ Editbox Properties dialog box */
    xlDialogEditboxProperties(438),    
    /**@ Edit Color dialog box */
    xlDialogEditColor(223),    
    /**@ Edit Delete dialog box */
    xlDialogEditDelete(54),    
    /**@ Edition Options dialog box */
    xlDialogEditionOptions(251),    
    /**@ Edit Series dialog box */
    xlDialogEditSeries(228),    
    /**@ Errorbar X dialog box */
    xlDialogErrorbarX(463),    
    /**@ Errorbar Y dialog box */
    xlDialogErrorbarY(464),    
    /**@ Error Checking dialog box */
    xlDialogErrorChecking(732),    
    /**@ Evaluate Formula dialog box */
    xlDialogEvaluateFormula(709),    
    /**@ External Data Properties dialog box */
    xlDialogExternalDataProperties(530),    
    /**@ Extract dialog box */
    xlDialogExtract(35),    
    /**@ File Delete dialog box */
    xlDialogFileDelete(6),    
    /**@ File Sharing dialog box */
    xlDialogFileSharing(481),    
    /**@ Fill Group dialog box */
    xlDialogFillGroup(200),    
    /**@ Fill Workgroup dialog box */
    xlDialogFillWorkgroup(301),    
    /**@ Dialog Filter dialog box */
    xlDialogFilter(447),    
    /**@ Filter Advanced dialog box */
    xlDialogFilterAdvanced(370),    
    /**@ Find File dialog box */
    xlDialogFindFile(475),    
    /**@ Font dialog box */
    xlDialogFont(26),    
    /**@ Font Properties dialog box */
    xlDialogFontProperties(381),    
    /**@ Format Auto dialog box */
    xlDialogFormatAuto(269),    
    /**@ Format Chart dialog box */
    xlDialogFormatChart(465),    
    /**@ Format Charttype dialog box */
    xlDialogFormatCharttype(423),    
    /**@ Format Font dialog box */
    xlDialogFormatFont(150),    
    /**@ Format Legend dialog box */
    xlDialogFormatLegend(88),    
    /**@ Format Main dialog box */
    xlDialogFormatMain(225),    
    /**@ Format Move dialog box */
    xlDialogFormatMove(128),    
    /**@ Format Number dialog box */
    xlDialogFormatNumber(42),    
    /**@ Format Overlay dialog box */
    xlDialogFormatOverlay(226),    
    /**@ Format Size dialog box */
    xlDialogFormatSize(129),    
    /**@ Format Text dialog box */
    xlDialogFormatText(89),    
    /**@ Formula Find dialog box */
    xlDialogFormulaFind(64),    
    /**@ Formula Goto dialog box */
    xlDialogFormulaGoto(63),    
    /**@ Formula Replace dialog box */
    xlDialogFormulaReplace(130),    
    /**@ Function Wizard dialog box */
    xlDialogFunctionWizard(450),    
    /**@ Gallery 3D Area dialog box */
    xlDialogGallery3dArea(193),    
    /**@ Gallery 3D Bar dialog box */
    xlDialogGallery3dBar(272),    
    /**@ Gallery 3D Column dialog box */
    xlDialogGallery3dColumn(194),    
    /**@ Gallery 3D Line dialog box */
    xlDialogGallery3dLine(195),    
    /**@ Gallery 3D Pie dialog box */
    xlDialogGallery3dPie(196),    
    /**@ Gallery 3D Surface dialog box */
    xlDialogGallery3dSurface(273),    
    /**@ Gallery Area dialog box */
    xlDialogGalleryArea(67),    
    /**@ Gallery Bar dialog box */
    xlDialogGalleryBar(68),    
    /**@ Gallery Column dialog box */
    xlDialogGalleryColumn(69),    
    /**@ Gallery Custom dialog box */
    xlDialogGalleryCustom(388),    
    /**@ Gallery Doughnut dialog box */
    xlDialogGalleryDoughnut(344),    
    /**@ Gallery Line dialog box */
    xlDialogGalleryLine(70),    
    /**@ Gallery Pie dialog box */
    xlDialogGalleryPie(71),    
    /**@ Gallery Radar dialog box */
    xlDialogGalleryRadar(249),    
    /**@ Gallery Scatter dialog box */
    xlDialogGalleryScatter(72),    
    /**@ Goal Seek dialog box */
    xlDialogGoalSeek(198),    
    /**@ Gridlines dialog box */
    xlDialogGridlines(76),    
    /**@ Import Text File dialog box */
    xlDialogImportTextFile(666),    
    /**@ Insert dialog box */
    xlDialogInsert(55),    
    /**@ Insert Hyperlink dialog box */
    xlDialogInsertHyperlink(596),    
    /**@ Insert Object dialog box */
    xlDialogInsertObject(259),    
    /**@ Insert Picture dialog box */
    xlDialogInsertPicture(342),    
    /**@ Insert Title dialog box */
    xlDialogInsertTitle(380),    
    /**@ Label Properties dialog box */
    xlDialogLabelProperties(436),    
    /**@ Listbox Properties dialog box */
    xlDialogListboxProperties(437),    
    /**@ Macro Options dialog box */
    xlDialogMacroOptions(382),    
    /**@ Mail Edit Mailer dialog box */
    xlDialogMailEditMailer(470),    
    /**@ Mail Logon dialog box */
    xlDialogMailLogon(339),    
    /**@ Mail Next Letter dialog box */
    xlDialogMailNextLetter(378),    
    /**@ Main Chart dialog box */
    xlDialogMainChart(85),    
    /**@ Main Chart Type dialog box */
    xlDialogMainChartType(185),    
    /**@ Manage Relationships dialog box */
    xlDialogManageRelationships(1271),    
    /**@ Menu Editor dialog box */
    xlDialogMenuEditor(322),    
    /**@ Move dialog box */
    xlDialogMove(262),    
    /**@ My Permission dialog box */
    xlDialogMyPermission(834),    
    /**@ NameManager dialog box */
    xlDialogNameManager(977),    
    /**@ New dialog box */
    xlDialogNew(119),    
    /**@ NewName dialog box */
    xlDialogNewName(978),    
    /**@ New Web Query dialog box */
    xlDialogNewWebQuery(667),    
    /**@ Note dialog box */
    xlDialogNote(154),    
    /**@ Object Properties dialog box */
    xlDialogObjectProperties(207),    
    /**@ Object Protection dialog box */
    xlDialogObjectProtection(214),    
    /**@ Open dialog box */
    xlDialogOpen(1),    
    /**@ Open Links dialog box */
    xlDialogOpenLinks(2),    
    /**@ Open Mail dialog box */
    xlDialogOpenMail(188),    
    /**@ Open Text dialog box */
    xlDialogOpenText(441),    
    /**@ Options Calculation dialog box */
    xlDialogOptionsCalculation(318),    
    /**@ Options Chart dialog box */
    xlDialogOptionsChart(325),    
    /**@ Options Edit dialog box */
    xlDialogOptionsEdit(319),    
    /**@ Options General dialog box */
    xlDialogOptionsGeneral(356),    
    /**@ Options Lists Add dialog box */
    xlDialogOptionsListsAdd(458),    
    /**@ OptionsME dialog box */
    xlDialogOptionsME(647),    
    /**@ Options Transition dialog box */
    xlDialogOptionsTransition(355),    
    /**@ Options View dialog box */
    xlDialogOptionsView(320),    
    /**@ Outline dialog box */
    xlDialogOutline(142),    
    /**@ Overlay dialog box */
    xlDialogOverlay(86),    
    /**@ Overlay ChartType dialog box */
    xlDialogOverlayChartType(186),    
    /**@ Page Setup dialog box */
    xlDialogPageSetup(7),    
    /**@ Parse dialog box */
    xlDialogParse(91),    
    /**@ Paste Names dialog box */
    xlDialogPasteNames(58),    
    /**@ Paste Special dialog box */
    xlDialogPasteSpecial(53),    
    /**@ Patterns dialog box */
    xlDialogPatterns(84),    
    /**@ Permission dialog box */
    xlDialogPermission(832),    
    /**@ Phonetic dialog box */
    xlDialogPhonetic(656),    
    /**@ Pivot Calculated Field dialog box */
    xlDialogPivotCalculatedField(570),    
    /**@ Pivot Calculated Item dialog box */
    xlDialogPivotCalculatedItem(572),    
    /**@ Pivot Client Server Set dialog box */
    xlDialogPivotClientServerSet(689),    
    /**@ Pivot Field Group dialog box */
    xlDialogPivotFieldGroup(433),    
    /**@ Pivot Field Properties dialog box */
    xlDialogPivotFieldProperties(313),    
    /**@ Pivot Field Ungroup dialog box */
    xlDialogPivotFieldUngroup(434),    
    /**@ Pivot Show Pages dialog box */
    xlDialogPivotShowPages(421),    
    /**@ Pivot Solve Order dialog box */
    xlDialogPivotSolveOrder(568),    
    /**@ PivotTable Options dialog box */
    xlDialogPivotTableOptions(567),    
    /**@ PivotTable Slicer Connections dialog box */
    xlDialogPivotTableSlicerConnections(1183),    
    /**@ PivotTable What If Analysis Settings dialog box */
    xlDialogPivotTableWhatIfAnalysisSettings(1153),    
    /**@ PivotTable Wizard dialog box */
    xlDialogPivotTableWizard(312),    
    /**@ Placement dialog box */
    xlDialogPlacement(300),    
    /**@ Print dialog box */
    xlDialogPrint(8),    
    /**@ Printer Setup dialog box */
    xlDialogPrinterSetup(9),    
    /**@ Print Preview dialog box */
    xlDialogPrintPreview(222),    
    /**@ Promote dialog box */
    xlDialogPromote(202),    
    /**@ Properties dialog box */
    xlDialogProperties(474),    
    /**@ Property Fields dialog box */
    xlDialogPropertyFields(754),    
    /**@ Protect Document dialog box */
    xlDialogProtectDocument(28),    
    /**@ Protect Sharing dialog box */
    xlDialogProtectSharing(620),    
    /**@ Publish As WebPage dialog box */
    xlDialogPublishAsWebPage(653),    
    /**@ Pushbutton Properties dialog box */
    xlDialogPushbuttonProperties(445),    
    /**@ Recommended PivotTables dialog box */
    xlDialogRecommendedPivotTables(1258),    
    /**@ Replace Font dialog box */
    xlDialogReplaceFont(134),    
    /**@ This object or member has been deprecated, but it remains part of the object model for backward compatibility. You should not use it in new applications. */
    xlDialogRoutingSlip(336),    
    /**@ Row Height dialog box */
    xlDialogRowHeight(127),    
    /**@ Run dialog box */
    xlDialogRun(17),    
    /**@ SaveAs dialog box */
    xlDialogSaveAs(5),    
    /**@ SaveCopyAs dialog box */
    xlDialogSaveCopyAs(456),    
    /**@ Save New Object dialog box */
    xlDialogSaveNewObject(208),    
    /**@ Save Workbook dialog box */
    xlDialogSaveWorkbook(145),    
    /**@ Save Workspace dialog box */
    xlDialogSaveWorkspace(285),    
    /**@ Scale dialog box */
    xlDialogScale(87),    
    /**@ Scenario Add dialog box */
    xlDialogScenarioAdd(307),    
    /**@ Scenario Cells dialog box */
    xlDialogScenarioCells(305),    
    /**@ Scenario Edit dialog box */
    xlDialogScenarioEdit(308),    
    /**@ Scenario Merge dialog box */
    xlDialogScenarioMerge(473),    
    /**@ Scenario Summary dialog box */
    xlDialogScenarioSummary(311),    
    /**@ Scrollbar Properties dialog box */
    xlDialogScrollbarProperties(420),    
    /**@ Search dialog box */
    xlDialogSearch(731),    
    /**@ Select Special dialog box */
    xlDialogSelectSpecial(132),    
    /**@ Send Mail dialog box */
    xlDialogSendMail(189),    
    /**@ Series Axes dialog box */
    xlDialogSeriesAxes(460),    
    /**@ Series Options dialog box */
    xlDialogSeriesOptions(557),    
    /**@ Series Order dialog box */
    xlDialogSeriesOrder(466),    
    /**@ Series Shape dialog box */
    xlDialogSeriesShape(504),    
    /**@ Series X dialog box */
    xlDialogSeriesX(461),    
    /**@ Series Y dialog box */
    xlDialogSeriesY(462),    
    /**@ Set Background Picture dialog box */
    xlDialogSetBackgroundPicture(509),    
    /**@ Set Manager dialog box */
    xlDialogSetManager(1109),    
    /**@ Set MDX Editor dialog box */
    xlDialogSetMDXEditor(1208),    
    /**@ Set Print Titles dialog box */
    xlDialogSetPrintTitles(23),    
    /**@ Set Tuple Editor On Columns dialog box */
    xlDialogSetTupleEditorOnColumns(1108),    
    /**@ Set Tuple Editor On Rows dialog box */
    xlDialogSetTupleEditorOnRows(1107),    
    /**@ Set Update Status dialog box */
    xlDialogSetUpdateStatus(159),    
    /**@ Show Detail dialog box */
    xlDialogShowDetail(204),    
    /**@ Show Toolbar dialog box */
    xlDialogShowToolbar(220),    
    /**@ Size dialog box */
    xlDialogSize(261),    
    /**@ Slicer Creation dialog box */
    xlDialogSlicerCreation(1182),    
    /**@ Slicer PivotTable Connections dialog box */
    xlDialogSlicerPivotTableConnections(1184),    
    /**@ Slicer Settings dialog box */
    xlDialogSlicerSettings(1179),    
    /**@ Sort dialog box */
    xlDialogSort(39),    
    /**@ Sort Special dialog box */
    xlDialogSortSpecial(192),    
    /**@ Sparkline Insert Column dialog box */
    xlDialogSparklineInsertColumn(1134),    
    /**@ Sparkline Insert Line dialog box */
    xlDialogSparklineInsertLine(1133),    
    /**@ Sparkline Insert Win Loss dialog box */
    xlDialogSparklineInsertWinLoss(1135),    
    /**@ Split dialog box */
    xlDialogSplit(137),    
    /**@ Standard Font dialog box */
    xlDialogStandardFont(190),    
    /**@ Standard Width dialog box */
    xlDialogStandardWidth(472),    
    /**@ Style dialog box */
    xlDialogStyle(44),    
    /**@ Subscribe To dialog box */
    xlDialogSubscribeTo(218),    
    /**@ Subtotal Create dialog box */
    xlDialogSubtotalCreate(398),    
    /**@ Summary Info dialog box */
    xlDialogSummaryInfo(474),    
    /**@ Table dialog box */
    xlDialogTable(41),    
    /**@ Tab Order dialog box */
    xlDialogTabOrder(394),    
    /**@ Text To Columns dialog box */
    xlDialogTextToColumns(422),    
    /**@ Unhide dialog box */
    xlDialogUnhide(94),    
    /**@ Update Link dialog box */
    xlDialogUpdateLink(201),    
    /**@ VBA Insert File dialog box */
    xlDialogVbaInsertFile(328),    
    /**@ VBA Make Addin dialog box */
    xlDialogVbaMakeAddin(478),    
    /**@ VBA Procedure Definition dialog box */
    xlDialogVbaProcedureDefinition(330),    
    /**@ View 3D dialog box */
    xlDialogView3d(197),    
    /**@ Web Options Browsers dialog box */
    xlDialogWebOptionsBrowsers(773),    
    /**@ Web Options Encoding dialog box */
    xlDialogWebOptionsEncoding(686),    
    /**@ Web Options Files dialog box */
    xlDialogWebOptionsFiles(684),    
    /**@ Web Options Fonts dialog box */
    xlDialogWebOptionsFonts(687),    
    /**@ Web Options General dialog box */
    xlDialogWebOptionsGeneral(683),    
    /**@ Web Options Pictures dialog box */
    xlDialogWebOptionsPictures(685),    
    /**@ Window Move dialog box */
    xlDialogWindowMove(14),    
    /**@ Window Size dialog box */
    xlDialogWindowSize(13),    
    /**@ Workbook Add dialog box */
    xlDialogWorkbookAdd(281),    
    /**@ Workbook Copy dialog box */
    xlDialogWorkbookCopy(283),    
    /**@ Workbook Insert dialog box */
    xlDialogWorkbookInsert(354),    
    /**@ Workbook Move dialog box */
    xlDialogWorkbookMove(282),    
    /**@ Workbook Name dialog box */
    xlDialogWorkbookName(386),    
    /**@ Workbook New dialog box */
    xlDialogWorkbookNew(302),    
    /**@ Workbook Options dialog box */
    xlDialogWorkbookOptions(284),    
    /**@ Workbook Protect dialog box */
    xlDialogWorkbookProtect(417),    
    /**@ Workbook Tab Split dialog box */
    xlDialogWorkbookTabSplit(415),    
    /**@ Workbook Unhide dialog box */
    xlDialogWorkbookUnhide(384),    
    /**@ Workgroup dialog box */
    xlDialogWorkgroup(199),    
    /**@ Workspace dialog box */
    xlDialogWorkspace(95),    
    /**@ Zoom dialog box */
    xlDialogZoom(256);

    private final long value;

    XlBuiltInDialog(long value) {
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
