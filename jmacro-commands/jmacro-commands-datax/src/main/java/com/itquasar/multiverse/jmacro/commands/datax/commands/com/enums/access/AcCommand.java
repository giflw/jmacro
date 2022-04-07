package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.accommand">https://docs.microsoft.com/en-us/office/vba/api/access.accommand</a>}
*/
public enum AcCommand implements COMEnum {
    
    /**@ No description provided */
    acCmdAboutMicrosoftAccess(35),    
    /**@ No description provided */
    acCmdAddDataMacroAfterDelete(720),    
    /**@ No description provided */
    acCmdAddDataMacroAfterInsert(718),    
    /**@ No description provided */
    acCmdAddDataMacroAfterUpdate(719),    
    /**@ No description provided */
    acCmdAddDataMacroValidateChange(722),    
    /**@ No description provided */
    acCmdAddDataMacroValidateDelete(721),    
    /**@ No description provided */
    acCmdAddFromOutlook(583),    
    /**@ No description provided */
    acCmdAddInManager(526),    
    /**@ No description provided */
    acCmdAddNamedDataMacro(723),    
    /**@ No description provided */
    acCmdAddToNewGroup(494),    
    /**@ No description provided */
    acCmdAddWatch(201),    
    /**@ No description provided */
    acCmdAdvancedFilterSort(99),    
    /**@ No description provided */
    acCmdAlignBottom(46),    
    /**@ No description provided */
    acCmdAlignCenter(477),    
    /**@ No description provided */
    acCmdAlignLeft(43),    
    /**@ No description provided */
    acCmdAlignmentAndSizing(478),    
    /**@ No description provided */
    acCmdAlignMiddle(476),    
    /**@ No description provided */
    acCmdAlignRight(44),    
    /**@ No description provided */
    acCmdAlignToGrid(47),    
    /**@ No description provided */
    acCmdAlignTop(45),    
    /**@ No description provided */
    acCmdAlignToShortest(153),    
    /**@ No description provided */
    acCmdAlignToTallest(154),    
    /**@ No description provided */
    acCmdAnalyzePerformance(283),    
    /**@ No description provided */
    acCmdAnalyzeTable(284),    
    /**@ No description provided */
    acCmdAnchorBottomLeft(616),    
    /**@ No description provided */
    acCmdAnchorBottomRight(618),    
    /**@ No description provided */
    acCmdAnchorBottomStretchAcross(617),    
    /**@ No description provided */
    acCmdAnchorStretchAcross(611),    
    /**@ No description provided */
    acCmdAnchorStretchDown(613),    
    /**@ No description provided */
    acCmdAnchorStretchDownAcross(614),    
    /**@ No description provided */
    acCmdAnchorStretchDownRight(615),    
    /**@ No description provided */
    acCmdAnchorTopLeft(610),    
    /**@ No description provided */
    acCmdAnchorTopRight(612),    
    /**@ No description provided */
    acCmdAnswerWizard(235),    
    /**@ No description provided */
    acCmdApplyAutoFormat1(648),    
    /**@ No description provided */
    acCmdApplyAutoFormat10(657),    
    /**@ No description provided */
    acCmdApplyAutoFormat11(658),    
    /**@ No description provided */
    acCmdApplyAutoFormat12(659),    
    /**@ No description provided */
    acCmdApplyAutoFormat13(660),    
    /**@ No description provided */
    acCmdApplyAutoFormat14(661),    
    /**@ No description provided */
    acCmdApplyAutoFormat15(662),    
    /**@ No description provided */
    acCmdApplyAutoFormat16(663),    
    /**@ No description provided */
    acCmdApplyAutoFormat17(664),    
    /**@ No description provided */
    acCmdApplyAutoFormat18(665),    
    /**@ No description provided */
    acCmdApplyAutoFormat19(666),    
    /**@ No description provided */
    acCmdApplyAutoFormat2(649),    
    /**@ No description provided */
    acCmdApplyAutoFormat20(667),    
    /**@ No description provided */
    acCmdApplyAutoFormat21(668),    
    /**@ No description provided */
    acCmdApplyAutoFormat22(669),    
    /**@ No description provided */
    acCmdApplyAutoFormat23(670),    
    /**@ No description provided */
    acCmdApplyAutoFormat24(671),    
    /**@ No description provided */
    acCmdApplyAutoFormat25(672),    
    /**@ No description provided */
    acCmdApplyAutoFormat3(650),    
    /**@ No description provided */
    acCmdApplyAutoFormat4(651),    
    /**@ No description provided */
    acCmdApplyAutoFormat5(652),    
    /**@ No description provided */
    acCmdApplyAutoFormat6(653),    
    /**@ No description provided */
    acCmdApplyAutoFormat7(654),    
    /**@ No description provided */
    acCmdApplyAutoFormat8(655),    
    /**@ No description provided */
    acCmdApplyAutoFormat9(656),    
    /**@ No description provided */
    acCmdApplyDefault(55),    
    /**@ No description provided */
    acCmdApplyFilterSort(93),    
    /**@ No description provided */
    acCmdAppMaximize(10),    
    /**@ No description provided */
    acCmdAppMinimize(11),    
    /**@ No description provided */
    acCmdAppMove(12),    
    /**@ No description provided */
    acCmdAppRestore(9),    
    /**@ No description provided */
    acCmdAppSize(13),    
    /**@ No description provided */
    acCmdArrangeIconsAuto(218),    
    /**@ No description provided */
    acCmdArrangeIconsByCreated(216),    
    /**@ No description provided */
    acCmdArrangeIconsByModified(217),    
    /**@ No description provided */
    acCmdArrangeIconsByName(214),    
    /**@ No description provided */
    acCmdArrangeIconsByType(215),    
    /**@ No description provided */
    acCmdAutoCorrect(261),    
    /**@ No description provided */
    acCmdAutoDial(192),    
    /**@ No description provided */
    acCmdAutoFormat(270),    
    /**@ No description provided */
    acCmdBackgroundPicture(474),    
    /**@ No description provided */
    acCmdBackgroundSound(475),    
    /**@ No description provided */
    acCmdBackup(513),    
    /**@ No description provided */
    acCmdBookmarksClearAll(310),    
    /**@ No description provided */
    acCmdBookmarksNext(308),    
    /**@ No description provided */
    acCmdBookmarksPrevious(309),    
    /**@ No description provided */
    acCmdBookmarksToggle(307),    
    /**@ No description provided */
    acCmdBringToFront(52),    
    /**@ No description provided */
    acCmdBrowseSharePointList(621),    
    /**@ No description provided */
    acCmdCalculatedColumn(698),    
    /**@ No description provided */
    acCmdCallStack(172),    
    /**@ No description provided */
    acCmdChangeToCheckBox(231),    
    /**@ No description provided */
    acCmdChangeToComboBox(230),    
    /**@ No description provided */
    acCmdChangeToCommandButton(501),    
    /**@ No description provided */
    acCmdChangeToImage(234),    
    /**@ No description provided */
    acCmdChangeToLabel(228),    
    /**@ No description provided */
    acCmdChangeToListBox(229),    
    /**@ No description provided */
    acCmdChangeToOptionButton(233),    
    /**@ No description provided */
    acCmdChangeToTextBox(227),    
    /**@ No description provided */
    acCmdChangeToToggleButton(232),    
    /**@ No description provided */
    acCmdClearAll(146),    
    /**@ No description provided */
    acCmdClearAllBreakpoints(132),    
    /**@ No description provided */
    acCmdClearGrid(71),    
    /**@ No description provided */
    acCmdClearHyperlink(343),    
    /**@ No description provided */
    acCmdClearItemDefaults(237),    
    /**@ No description provided */
    acCmdClose(58),    
    /**@ No description provided */
    acCmdCloseAll(646),    
    /**@ No description provided */
    acCmdCloseDatabase(538),    
    /**@ No description provided */
    acCmdCloseWindow(186),    
    /**@ No description provided */
    acCmdCollectDataViaEmail(608),    
    /**@ No description provided */
    acCmdColumnWidth(117),    
    /**@ No description provided */
    acCmdCompactDatabase(4),    
    /**@ No description provided */
    acCmdCompatCheckCurrentObject(696),    
    /**@ No description provided */
    acCmdCompatCheckDatabase(695),    
    /**@ No description provided */
    acCmdCompileAllModules(125),    
    /**@ No description provided */
    acCmdCompileAndSaveAllModules(126),    
    /**@ No description provided */
    acCmdCompileLoadedModules(290),    
    /**@ No description provided */
    acCmdCompleteWord(306),    
    /**@ No description provided */
    acCmdConditionalFormatting(500),    
    /**@ No description provided */
    acCmdConnection(383),    
    /**@ No description provided */
    acCmdControlMarginsMedium(630),    
    /**@ No description provided */
    acCmdControlMarginsNarrow(629),    
    /**@ No description provided */
    acCmdControlMarginsNone(628),    
    /**@ No description provided */
    acCmdControlMarginsWide(631),    
    /**@ No description provided */
    acCmdControlPaddingMedium(634),    
    /**@ No description provided */
    acCmdControlPaddingNarrow(633),    
    /**@ No description provided */
    acCmdControlPaddingNone(632),    
    /**@ No description provided */
    acCmdControlPaddingWide(635),    
    /**@ No description provided */
    acCmdControlWizardsToggle(197),    
    /**@ No description provided */
    acCmdConvertDatabase(171),    
    /**@ No description provided */
    acCmdConvertLinkedTableToLocal(700),    
    /**@ No description provided */
    acCmdConvertMacrosToVisualBasic(279),    
    /**@ No description provided */
    acCmdCopy(190),    
    /**@ No description provided */
    acCmdCopyDatabaseFile(516),    
    /**@ No description provided */
    acCmdCopyHyperlink(328),    
    /**@ No description provided */
    acCmdCreateMenuFromMacro(334),    
    /**@ No description provided */
    acCmdCreateRelationship(150),    
    /**@ No description provided */
    acCmdCreateReplica(263),    
    /**@ No description provided */
    acCmdCreateShortcut(219),    
    /**@ No description provided */
    acCmdCreateShortcutMenuFromMacro(336),    
    /**@ No description provided */
    acCmdCreateToolbarFromMacro(335),    
    /**@ No description provided */
    acCmdCut(189),    
    /**@ No description provided */
    acCmdDatabaseProperties(256),    
    /**@ No description provided */
    acCmdDatabaseSplitter(520),    
    /**@ No description provided */
    acCmdDataEntry(78),    
    /**@ No description provided */
    acCmdDataOutline(468),    
    /**@ No description provided */
    acCmdDatasheetView(282),    
    /**@ No description provided */
    acCmdDateAndTime(226),    
    /**@ No description provided */
    acCmdDebugWindow(123),    
    /**@ No description provided */
    acCmdDelete(337),    
    /**@ No description provided */
    acCmdDeleteGroup(493),    
    /**@ No description provided */
    acCmdDeletePage(332),    
    /**@ No description provided */
    acCmdDeleteQueryColumn(81),    
    /**@ No description provided */
    acCmdDeleteRecord(223),    
    /**@ No description provided */
    acCmdDeleteRows(188),    
    /**@ No description provided */
    acCmdDeleteSharePointList(627),    
    /**@ No description provided */
    acCmdDeleteTab(255),    
    /**@ No description provided */
    acCmdDeleteTable(489),    
    /**@ No description provided */
    acCmdDeleteTableColumn(271),    
    /**@ No description provided */
    acCmdDeleteWatch(267),    
    /**@ No description provided */
    acCmdDesignObject(697),    
    /**@ No description provided */
    acCmdDesignView(183),    
    /**@ No description provided */
    acCmdDiagramAddRelatedTables(373),    
    /**@ No description provided */
    acCmdDiagramAutosizeSelectedTables(378),    
    /**@ No description provided */
    acCmdDiagramDeleteRelationship(382),    
    /**@ No description provided */
    acCmdDiagramLayoutDiagram(380),    
    /**@ No description provided */
    acCmdDiagramLayoutSelection(379),    
    /**@ No description provided */
    acCmdDiagramModifyUserDefinedView(375),    
    /**@ No description provided */
    acCmdDiagramNewLabel(372),    
    /**@ No description provided */
    acCmdDiagramNewTable(381),    
    /**@ No description provided */
    acCmdDiagramRecalculatePageBreaks(377),    
    /**@ No description provided */
    acCmdDiagramShowRelationshipLabels(374),    
    /**@ No description provided */
    acCmdDiagramViewPageBreaks(376),    
    /**@ No description provided */
    acCmdDiscardChanges(639),    
    /**@ No description provided */
    acCmdDiscardChangesAndRefresh(640),    
    /**@ No description provided */
    acCmdDocMaximize(15),    
    /**@ No description provided */
    acCmdDocMinimize(60),    
    /**@ No description provided */
    acCmdDocMove(16),    
    /**@ No description provided */
    acCmdDocRestore(14),    
    /**@ No description provided */
    acCmdDocSize(17),    
    /**@ No description provided */
    acCmdDocumenter(285),    
    /**@ No description provided */
    acCmdDropSQLDatabase(517),    
    /**@ No description provided */
    acCmdDuplicate(34),    
    /**@ No description provided */
    acCmdEditHyperlink(325),    
    /**@ No description provided */
    acCmdEditingAllowed(70),    
    /**@ No description provided */
    acCmdEditListItems(607),    
    /**@ No description provided */
    acCmdEditRelationship(151),    
    /**@ No description provided */
    acCmdEditTriggers(384),    
    /**@ No description provided */
    acCmdEditWatch(202),    
    /**@ No description provided */
    acCmdEncryptDecryptDatabase(5),    
    /**@ No description provided */
    acCmdEnd(198),    
    /**@ No description provided */
    acCmdExit(3),    
    /**@ No description provided */
    acCmdExportAccess(559),    
    /**@ No description provided */
    acCmdExportdBase(565),    
    /**@ No description provided */
    acCmdExportExcel(556),    
    /**@ No description provided */
    acCmdExportFixedFormat(592),    
    /**@ No description provided */
    acCmdExportHTML(564),    
    /**@ No description provided */
    acCmdExportODBC(562),    
    /**@ No description provided */
    acCmdExportRTF(558),    
    /**@ No description provided */
    acCmdExportSharePointList(557),    
    /**@ No description provided */
    acCmdExportSnapShot(563),    
    /**@ No description provided */
    acCmdExportText(560),    
    /**@ No description provided */
    acCmdExportXML(561),    
    /**@ No description provided */
    acCmdFavoritesAddTo(299),    
    /**@ No description provided */
    acCmdFavoritesOpen(298),    
    /**@ No description provided */
    acCmdFieldList(42),    
    /**@ No description provided */
    acCmdFilterByForm(207),    
    /**@ No description provided */
    acCmdFilterBySelection(208),    
    /**@ No description provided */
    acCmdFilterExcludingSelection(277),    
    /**@ No description provided */
    acCmdFilterMenu(619),    
    /**@ No description provided */
    acCmdFind(30),    
    /**@ No description provided */
    acCmdFindNext(341),    
    /**@ No description provided */
    acCmdFindNextWordUnderCursor(313),    
    /**@ No description provided */
    acCmdFindPrevious(120),    
    /**@ No description provided */
    acCmdFindPrevWordUnderCursor(312),    
    /**@ No description provided */
    acCmdFitToWindow(245),    
    /**@ No description provided */
    acCmdFont(19),    
    /**@ No description provided */
    acCmdFormatCells(77),    
    /**@ No description provided */
    acCmdFormHdrFtr(36),    
    /**@ No description provided */
    acCmdFormView(281),    
    /**@ No description provided */
    acCmdFreezeColumn(105),    
    /**@ No description provided */
    acCmdGoBack(294),    
    /**@ No description provided */
    acCmdGoContinue(127),    
    /**@ No description provided */
    acCmdGoForward(295),    
    /**@ No description provided */
    acCmdGroupByTable(387),    
    /**@ No description provided */
    acCmdGroupControls(484),    
    /**@ No description provided */
    acCmdHideColumns(79),    
    /**@ No description provided */
    acCmdHideMessageBar(677),    
    /**@ No description provided */
    acCmdHidePane(365),    
    /**@ No description provided */
    acCmdHideTable(147),    
    /**@ No description provided */
    acCmdHorizontalSpacingDecrease(158),    
    /**@ No description provided */
    acCmdHorizontalSpacingIncrease(159),    
    /**@ No description provided */
    acCmdHorizontalSpacingMakeEqual(157),    
    /**@ No description provided */
    acCmdHyperlinkDisplayText(329),    
    /**@ No description provided */
    acCmdImportAttachAccess(544),    
    /**@ No description provided */
    acCmdImportAttachdBase(552),    
    /**@ No description provided */
    acCmdImportAttachExcel(545),    
    /**@ No description provided */
    acCmdImportAttachHTML(550),    
    /**@ No description provided */
    acCmdImportAttachODBC(549),    
    /**@ No description provided */
    acCmdImportAttachOutlook(551),    
    /**@ No description provided */
    acCmdImportAttachSharePointList(547),    
    /**@ No description provided */
    acCmdImportAttachText(546),    
    /**@ No description provided */
    acCmdImportAttachXML(548),    
    /**@ No description provided */
    acCmdIndent(205),    
    /**@ No description provided */
    acCmdIndexes(152),    
    /**@ No description provided */
    acCmdInsertActiveXControl(258),    
    /**@ No description provided */
    acCmdInsertChart(293),    
    /**@ No description provided */
    acCmdInsertFile(39),    
    /**@ No description provided */
    acCmdInsertFileIntoModule(118),    
    /**@ No description provided */
    acCmdInsertHyperlink(259),    
    /**@ No description provided */
    acCmdInsertLogo(585),    
    /**@ No description provided */
    acCmdInsertLookupColumn(273),    
    /**@ No description provided */
    acCmdInsertLookupField(291),    
    /**@ No description provided */
    acCmdInsertMovieFromFile(469),    
    /**@ No description provided */
    acCmdInsertNavigationButton(724),    
    /**@ No description provided */
    acCmdInsertObject(33),    
    /**@ No description provided */
    acCmdInsertPage(331),    
    /**@ No description provided */
    acCmdInsertPicture(222),    
    /**@ No description provided */
    acCmdInsertPivotTable(470),    
    /**@ No description provided */
    acCmdInsertProcedure(262),    
    /**@ No description provided */
    acCmdInsertQueryColumn(82),    
    /**@ No description provided */
    acCmdInsertRows(187),    
    /**@ No description provided */
    acCmdInsertSpreadsheet(471),    
    /**@ No description provided */
    acCmdInsertSubdatasheet(499),    
    /**@ No description provided */
    acCmdInsertTableColumn(272),    
    /**@ No description provided */
    acCmdInsertTitle(586),    
    /**@ No description provided */
    acCmdInsertUnboundSection(472),    
    /**@ No description provided */
    acCmdInvokeBuilder(178),    
    /**@ No description provided */
    acCmdJoinProperties(72),    
    /**@ No description provided */
    acCmdLastPosition(339),    
    /**@ No description provided */
    acCmdLayoutGridlinesBoth(574),    
    /**@ No description provided */
    acCmdLayoutGridlinesBottom(580),    
    /**@ No description provided */
    acCmdLayoutGridlinesCrossHatch(578),    
    /**@ No description provided */
    acCmdLayoutGridlinesHorizontal(576),    
    /**@ No description provided */
    acCmdLayoutGridlinesNone(577),    
    /**@ No description provided */
    acCmdLayoutGridlinesOutline(581),    
    /**@ No description provided */
    acCmdLayoutGridlinesTop(579),    
    /**@ No description provided */
    acCmdLayoutGridlinesVertical(575),    
    /**@ No description provided */
    acCmdLayoutInsertColumnLeft(680),    
    /**@ No description provided */
    acCmdLayoutInsertColumnRight(681),    
    /**@ No description provided */
    acCmdLayoutInsertRowAbove(678),    
    /**@ No description provided */
    acCmdLayoutInsertRowBelow(679),    
    /**@ No description provided */
    acCmdLayoutMergeCells(682),    
    /**@ No description provided */
    acCmdLayoutPreview(141),    
    /**@ No description provided */
    acCmdLayoutSplitColumnCell(683),    
    /**@ No description provided */
    acCmdLayoutSplitRowCell(684),    
    /**@ No description provided */
    acCmdLayoutView(593),    
    /**@ No description provided */
    acCmdLineUpIcons(213),    
    /**@ No description provided */
    acCmdLinkedTableManager(519),    
    /**@ No description provided */
    acCmdLinkTables(102),    
    /**@ No description provided */
    acCmdListConstants(303),    
    /**@ No description provided */
    acCmdLoadFromQuery(95),    
    /**@ No description provided */
    acCmdMacroAllActions(589),    
    /**@ No description provided */
    acCmdMakeMDEFile(7),    
    /**@ No description provided */
    acCmdManageAttachments(673),    
    /**@ No description provided */
    acCmdManageReplies(609),    
    /**@ No description provided */
    acCmdManageTableEvents(717),    
    /**@ No description provided */
    acCmdMaximiumRecords(508),    
    /**@ No description provided */
    acCmdMicrosoftAccessHelpTopics(100),    
    /**@ No description provided */
    acCmdMicrosoftOnTheWeb(236),    
    /**@ No description provided */
    acCmdModifySharePointList(622),    
    /**@ No description provided */
    acCmdModifySharePointListAlerts(623),    
    /**@ No description provided */
    acCmdModifySharePointListPermissions(625),    
    /**@ No description provided */
    acCmdModifySharePointListWorkflow(624),    
    /**@ No description provided */
    acCmdMoreWindows(8),    
    /**@ No description provided */
    acCmdMoveColumnCellDown(573),    
    /**@ No description provided */
    acCmdMoveColumnCellUp(572),    
    /**@ No description provided */
    acCmdNewDatabase(26),    
    /**@ No description provided */
    acCmdNewGroup(491),    
    /**@ No description provided */
    acCmdNewObjectAutoForm(193),    
    /**@ No description provided */
    acCmdNewObjectAutoFormWeb(705),    
    /**@ No description provided */
    acCmdNewObjectAutoReport(194),    
    /**@ No description provided */
    acCmdNewObjectAutoReportWeb(706),    
    /**@ No description provided */
    acCmdNewObjectBlankForm(600),    
    /**@ No description provided */
    acCmdNewObjectBlankFormWeb(703),    
    /**@ No description provided */
    acCmdNewObjectBlankReport(602),    
    /**@ No description provided */
    acCmdNewObjectBlankReportWeb(704),    
    /**@ No description provided */
    acCmdNewObjectClassModule(140),    
    /**@ No description provided */
    acCmdNewObjectContinuousForm(594),    
    /**@ No description provided */
    acCmdNewObjectContinuousFormWeb(701),    
    /**@ No description provided */
    acCmdNewObjectDatasheetForm(598),    
    /**@ No description provided */
    acCmdNewObjectDatasheetFormWeb(702),    
    /**@ No description provided */
    acCmdNewObjectDesignForm(604),    
    /**@ No description provided */
    acCmdNewObjectDesignQuery(603),    
    /**@ No description provided */
    acCmdNewObjectDesignReport(605),    
    /**@ No description provided */
    acCmdNewObjectDesignTable(606),    
    /**@ No description provided */
    acCmdNewObjectDiagram(352),    
    /**@ No description provided */
    acCmdNewObjectForm(136),    
    /**@ No description provided */
    acCmdNewObjectFunction(394),    
    /**@ No description provided */
    acCmdNewObjectLabelsReport(601),    
    /**@ No description provided */
    acCmdNewObjectMacro(138),    
    /**@ No description provided */
    acCmdNewObjectMacroWeb(708),    
    /**@ No description provided */
    acCmdNewObjectModalForm(599),    
    /**@ No description provided */
    acCmdNewObjectModule(139),    
    /**@ No description provided */
    acCmdNewObjectNavigationLeft(690),    
    /**@ No description provided */
    acCmdNewObjectNavigationLeftWeb(710),    
    /**@ No description provided */
    acCmdNewObjectNavigationRight(691),    
    /**@ No description provided */
    acCmdNewObjectNavigationRightWeb(711),    
    /**@ No description provided */
    acCmdNewObjectNavigationTop(689),    
    /**@ No description provided */
    acCmdNewObjectNavigationTopLeft(693),    
    /**@ No description provided */
    acCmdNewObjectNavigationTopLeftWeb(713),    
    /**@ No description provided */
    acCmdNewObjectNavigationTopRight(694),    
    /**@ No description provided */
    acCmdNewObjectNavigationTopRightWeb(714),    
    /**@ No description provided */
    acCmdNewObjectNavigationTopTop(692),    
    /**@ No description provided */
    acCmdNewObjectNavigationTopTopWeb(712),    
    /**@ No description provided */
    acCmdNewObjectNavigationTopWeb(709),    
    /**@ No description provided */
    acCmdNewObjectPivotChart(596),    
    /**@ No description provided */
    acCmdNewObjectPivotTable(597),    
    /**@ No description provided */
    acCmdNewObjectQuery(135),    
    /**@ No description provided */
    acCmdNewObjectQueryWeb(707),    
    /**@ No description provided */
    acCmdNewObjectReport(137),    
    /**@ No description provided */
    acCmdNewObjectSplitForm(595),    
    /**@ No description provided */
    acCmdNewObjectStoredProcedure(351),    
    /**@ No description provided */
    acCmdNewObjectTable(134),    
    /**@ No description provided */
    acCmdNewObjectView(350),    
    /**@ No description provided */
    acCmdObjBrwFindWholeWordOnly(314),    
    /**@ No description provided */
    acCmdObjBrwGroupMembers(318),    
    /**@ No description provided */
    acCmdObjBrwHelp(316),    
    /**@ No description provided */
    acCmdObjBrwShowHiddenMembers(315),    
    /**@ No description provided */
    acCmdObjBrwViewDefinition(317),    
    /**@ No description provided */
    acCmdObjectBrowser(200),    
    /**@ No description provided */
    acCmdOfficeClipboard(488),    
    /**@ No description provided */
    acCmdOLEDDELinks(27),    
    /**@ No description provided */
    acCmdOLEObjectConvert(167),    
    /**@ No description provided */
    acCmdOLEObjectDefaultVerb(57),    
    /**@ No description provided */
    acCmdOpenDatabase(25),    
    /**@ No description provided */
    acCmdOpenHyperlink(326),    
    /**@ No description provided */
    acCmdOpenNewHyperlink(327),    
    /**@ No description provided */
    acCmdOpenSearchPage(253),    
    /**@ No description provided */
    acCmdOpenStartPage(252),    
    /**@ No description provided */
    acCmdOpenTable(221),    
    /**@ No description provided */
    acCmdOpenURL(251),    
    /**@ No description provided */
    acCmdOptions(49),    
    /**@ No description provided */
    acCmdOutdent(206),    
    /**@ No description provided */
    acCmdOutputToExcel(175),    
    /**@ No description provided */
    acCmdOutputToRTF(176),    
    /**@ No description provided */
    acCmdOutputToText(177),    
    /**@ No description provided */
    acCmdPageHdrFtr(182),    
    /**@ No description provided */
    acCmdPageNumber(225),    
    /**@ No description provided */
    acCmdPageProperties(467),    
    /**@ No description provided */
    acCmdPageSetup(32),    
    /**@ No description provided */
    acCmdParameterInfo(305),    
    /**@ No description provided */
    acCmdPartialReplicaWizard(524),    
    /**@ No description provided */
    acCmdPaste(191),    
    /**@ No description provided */
    acCmdPasteAppend(38),    
    /**@ No description provided */
    acCmdPasteAsHyperlink(490),    
    /**@ No description provided */
    acCmdPasteFormatting(587),    
    /**@ No description provided */
    acCmdPasteSpecial(64),    
    /**@ No description provided */
    acCmdPivotAutoAverage(416),    
    /**@ No description provided */
    acCmdPivotAutoCount(413),    
    /**@ No description provided */
    acCmdPivotAutoFilter(398),    
    /**@ No description provided */
    acCmdPivotAutoMax(415),    
    /**@ No description provided */
    acCmdPivotAutoMin(414),    
    /**@ No description provided */
    acCmdPivotAutoStdDev(417),    
    /**@ No description provided */
    acCmdPivotAutoStdDevP(419),    
    /**@ No description provided */
    acCmdPivotAutoSum(412),    
    /**@ No description provided */
    acCmdPivotAutoVar(418),    
    /**@ No description provided */
    acCmdPivotAutoVarP(420),    
    /**@ No description provided */
    acCmdPivotChartByRowByColumn(456),    
    /**@ No description provided */
    acCmdPivotChartDrillInto(457),    
    /**@ No description provided */
    acCmdPivotChartDrillOut(532),    
    /**@ No description provided */
    acCmdPivotChartMultiplePlots(458),    
    /**@ No description provided */
    acCmdPivotChartMultiplePlotsUnifiedScale(459),    
    /**@ No description provided */
    acCmdPivotChartShowLegend(455),    
    /**@ No description provided */
    acCmdPivotChartSortAscByTotal(534),    
    /**@ No description provided */
    acCmdPivotChartSortDescByTotal(535),    
    /**@ No description provided */
    acCmdPivotChartType(453),    
    /**@ No description provided */
    acCmdPivotChartUndo(460),    
    /**@ No description provided */
    acCmdPivotChartView(397),    
    /**@ No description provided */
    acCmdPivotCollapse(400),    
    /**@ No description provided */
    acCmdPivotDelete(454),    
    /**@ No description provided */
    acCmdPivotDropAreas(452),    
    /**@ No description provided */
    acCmdPivotExpand(401),    
    /**@ No description provided */
    acCmdPivotRefresh(404),    
    /**@ No description provided */
    acCmdPivotShowAll(461),    
    /**@ No description provided */
    acCmdPivotShowBottom1(432),    
    /**@ No description provided */
    acCmdPivotShowBottom10(435),    
    /**@ No description provided */
    acCmdPivotShowBottom10Percent(440),    
    /**@ No description provided */
    acCmdPivotShowBottom1Percent(437),    
    /**@ No description provided */
    acCmdPivotShowBottom2(433),    
    /**@ No description provided */
    acCmdPivotShowBottom25(436),    
    /**@ No description provided */
    acCmdPivotShowBottom25Percent(441),    
    /**@ No description provided */
    acCmdPivotShowBottom2Percent(438),    
    /**@ No description provided */
    acCmdPivotShowBottom5(434),    
    /**@ No description provided */
    acCmdPivotShowBottom5Percent(439),    
    /**@ No description provided */
    acCmdPivotShowBottomOther(442),    
    /**@ No description provided */
    acCmdPivotShowTop1(421),    
    /**@ No description provided */
    acCmdPivotShowTop10(424),    
    /**@ No description provided */
    acCmdPivotShowTop10Percent(429),    
    /**@ No description provided */
    acCmdPivotShowTop1Percent(426),    
    /**@ No description provided */
    acCmdPivotShowTop2(422),    
    /**@ No description provided */
    acCmdPivotShowTop25(425),    
    /**@ No description provided */
    acCmdPivotShowTop25Percent(430),    
    /**@ No description provided */
    acCmdPivotShowTop2Percent(427),    
    /**@ No description provided */
    acCmdPivotShowTop5(423),    
    /**@ No description provided */
    acCmdPivotShowTop5Percent(428),    
    /**@ No description provided */
    acCmdPivotShowTopOther(431),    
    /**@ No description provided */
    acCmdPivotTableClearCustomOrdering(527),    
    /**@ No description provided */
    acCmdPivotTableCreateCalcField(444),    
    /**@ No description provided */
    acCmdPivotTableCreateCalcTotal(443),    
    /**@ No description provided */
    acCmdPivotTableDemote(411),    
    /**@ No description provided */
    acCmdPivotTableExpandIndicators(451),    
    /**@ No description provided */
    acCmdPivotTableExportToExcel(405),    
    /**@ No description provided */
    acCmdPivotTableFilterBySelection(528),    
    /**@ No description provided */
    acCmdPivotTableGroupItems(530),    
    /**@ No description provided */
    acCmdPivotTableHideDetails(402),    
    /**@ No description provided */
    acCmdPivotTableMoveToColumnArea(407),    
    /**@ No description provided */
    acCmdPivotTableMoveToDetailArea(409),    
    /**@ No description provided */
    acCmdPivotTableMoveToFilterArea(408),    
    /**@ No description provided */
    acCmdPivotTableMoveToRowArea(406),    
    /**@ No description provided */
    acCmdPivotTablePercentColumnTotal(447),    
    /**@ No description provided */
    acCmdPivotTablePercentGrandTotal(450),    
    /**@ No description provided */
    acCmdPivotTablePercentParentColumnItem(449),    
    /**@ No description provided */
    acCmdPivotTablePercentParentRowItem(448),    
    /**@ No description provided */
    acCmdPivotTablePercentRowTotal(446),    
    /**@ No description provided */
    acCmdPivotTablePromote(410),    
    /**@ No description provided */
    acCmdPivotTableRemove(529),    
    /**@ No description provided */
    acCmdPivotTableShowAsNormal(445),    
    /**@ No description provided */
    acCmdPivotTableShowDetails(403),    
    /**@ No description provided */
    acCmdPivotTableSubtotal(399),    
    /**@ No description provided */
    acCmdPivotTableUngroupItems(531),    
    /**@ No description provided */
    acCmdPivotTableView(396),    
    /**@ No description provided */
    acCmdPrepareDatabaseForWeb(716),    
    /**@ No description provided */
    acCmdPreviewEightPages(249),    
    /**@ No description provided */
    acCmdPreviewFourPages(248),    
    /**@ No description provided */
    acCmdPreviewOnePage(246),    
    /**@ No description provided */
    acCmdPreviewTwelvePages(250),    
    /**@ No description provided */
    acCmdPreviewTwoPages(247),    
    /**@ No description provided */
    acCmdPrimaryKey(107),    
    /**@ No description provided */
    acCmdPrint(340),    
    /**@ No description provided */
    acCmdPrintPreview(54),    
    /**@ No description provided */
    acCmdPrintRelationships(483),    
    /**@ No description provided */
    acCmdPrintSelection(590),    
    /**@ No description provided */
    acCmdProcedureDefinition(122),    
    /**@ No description provided */
    acCmdProperties(287),    
    /**@ No description provided */
    acCmdPublishDatabase(537),    
    /**@ No description provided */
    acCmdPublishDefaults(324),    
    /**@ No description provided */
    acCmdPublishFixedFormat(591),    
    /**@ No description provided */
    acCmdQueryAddToOutput(362),    
    /**@ No description provided */
    acCmdQueryGroupBy(361),    
    /**@ No description provided */
    acCmdQueryParameters(76),    
    /**@ No description provided */
    acCmdQueryTotals(73),    
    /**@ No description provided */
    acCmdQueryTypeAppend(91),    
    /**@ No description provided */
    acCmdQueryTypeCrosstab(74),    
    /**@ No description provided */
    acCmdQueryTypeDelete(92),    
    /**@ No description provided */
    acCmdQueryTypeMakeTable(94),    
    /**@ No description provided */
    acCmdQueryTypeSelect(89),    
    /**@ No description provided */
    acCmdQueryTypeSQLDataDefinition(168),    
    /**@ No description provided */
    acCmdQueryTypeSQLPassThrough(169),    
    /**@ No description provided */
    acCmdQueryTypeSQLUnion(180),    
    /**@ No description provided */
    acCmdQueryTypeUpdate(90),    
    /**@ No description provided */
    acCmdQuickInfo(304),    
    /**@ No description provided */
    acCmdQuickPrint(278),    
    /**@ No description provided */
    acCmdQuickWatch(203),    
    /**@ No description provided */
    acCmdRecordsGoToFirst(67),    
    /**@ No description provided */
    acCmdRecordsGoToLast(68),    
    /**@ No description provided */
    acCmdRecordsGoToNew(28),    
    /**@ No description provided */
    acCmdRecordsGoToNext(65),    
    /**@ No description provided */
    acCmdRecordsGoToPrevious(66),    
    /**@ No description provided */
    acCmdRecoverDesignMaster(265),    
    /**@ No description provided */
    acCmdRedo(199),    
    /**@ No description provided */
    acCmdReferences(260),    
    /**@ No description provided */
    acCmdRefresh(18),    
    /**@ No description provided */
    acCmdRefreshData(541),    
    /**@ No description provided */
    acCmdRefreshPage(297),    
    /**@ No description provided */
    acCmdRefreshSharePointList(626),    
    /**@ No description provided */
    acCmdRegisterActiveXControls(254),    
    /**@ No description provided */
    acCmdRelationships(133),    
    /**@ No description provided */
    acCmdRemove(366),    
    /**@ No description provided */
    acCmdRemoveAllFilters(644),    
    /**@ No description provided */
    acCmdRemoveAllSorts(645),    
    /**@ No description provided */
    acCmdRemoveFilterFromCurrentColumn(643),    
    /**@ No description provided */
    acCmdRemoveFilterSort(144),    
    /**@ No description provided */
    acCmdRemoveFromLayout(582),    
    /**@ No description provided */
    acCmdRemoveTable(84),    
    /**@ No description provided */
    acCmdRename(143),    
    /**@ No description provided */
    acCmdRenameColumn(274),    
    /**@ No description provided */
    acCmdRenameGroup(492),    
    /**@ No description provided */
    acCmdRepairDatabase(6),    
    /**@ No description provided */
    acCmdReplace(29),    
    /**@ No description provided */
    acCmdReportHdrFtr(37),    
    /**@ No description provided */
    acCmdReportView(539),    
    /**@ No description provided */
    acCmdReset(124),    
    /**@ No description provided */
    acCmdResolveConflicts(266),    
    /**@ No description provided */
    acCmdRestore(514),    
    /**@ No description provided */
    acCmdRowHeight(116),    
    /**@ No description provided */
    acCmdRun(181),    
    /**@ No description provided */
    acCmdRunMacro(31),    
    /**@ No description provided */
    acCmdRunOpenMacro(338),    
    /**@ No description provided */
    acCmdSave(20),    
    /**@ No description provided */
    acCmdSaveAllModules(280),    
    /**@ No description provided */
    acCmdSaveAs(21),    
    /**@ No description provided */
    acCmdSaveAsHTML(321),    
    /**@ No description provided */
    acCmdSaveAsOutlookContact(584),    
    /**@ No description provided */
    acCmdSaveAsQuery(96),    
    /**@ No description provided */
    acCmdSaveAsReport(142),    
    /**@ No description provided */
    acCmdSaveAsTemplate(686),    
    /**@ No description provided */
    acCmdSaveDatabaseAsNewTemplatePart(687),    
    /**@ No description provided */
    acCmdSavedExports(555),    
    /**@ No description provided */
    acCmdSavedImports(543),    
    /**@ No description provided */
    acCmdSaveLayout(145),    
    /**@ No description provided */
    acCmdSaveModuleAsText(119),    
    /**@ No description provided */
    acCmdSaveRecord(97),    
    /**@ No description provided */
    acCmdSaveSelectionAsNewDataType(688),    
    /**@ No description provided */
    acCmdSelectAll(333),    
    /**@ No description provided */
    acCmdSelectAllRecords(109),    
    /**@ No description provided */
    acCmdSelectEntireColumn(571),    
    /**@ No description provided */
    acCmdSelectEntireLayout(715),    
    /**@ No description provided */
    acCmdSelectEntireRow(570),    
    /**@ No description provided */
    acCmdSelectForm(40),    
    /**@ No description provided */
    acCmdSelectRecord(50),    
    /**@ No description provided */
    acCmdSelectReport(319),    
    /**@ No description provided */
    acCmdSend(173),    
    /**@ No description provided */
    acCmdSendToBack(53),    
    /**@ No description provided */
    acCmdServerFilterByForm(507),    
    /**@ No description provided */
    acCmdServerProperties(496),    
    /**@ No description provided */
    acCmdSetCaption(637),    
    /**@ No description provided */
    acCmdSetControlDefaults(56),    
    /**@ No description provided */
    acCmdSetDatabasePassword(275),    
    /**@ No description provided */
    acCmdSetNextStatement(129),    
    /**@ No description provided */
    acCmdShareOnSharePoint(542),    
    /**@ No description provided */
    acCmdSharePointSiteRecycleBin(641),    
    /**@ No description provided */
    acCmdShowAllRelationships(149),    
    /**@ No description provided */
    acCmdShowColumnHistory(620),    
    /**@ No description provided */
    acCmdShowDatePicker(636),    
    /**@ No description provided */
    acCmdShowDirectRelationships(148),    
    /**@ No description provided */
    acCmdShowEnvelope(533),    
    /**@ No description provided */
    acCmdShowLogicCatalog(685),    
    /**@ No description provided */
    acCmdShowMembers(302),    
    /**@ No description provided */
    acCmdShowMessageBar(676),    
    /**@ No description provided */
    acCmdShowNextStatement(130),    
    /**@ No description provided */
    acCmdShowTable(185),    
    /**@ No description provided */
    acCmdSingleStep(88),    
    /**@ No description provided */
    acCmdSizeToFit(59),    
    /**@ No description provided */
    acCmdSizeToFitForm(69),    
    /**@ No description provided */
    acCmdSizeToGrid(48),    
    /**@ No description provided */
    acCmdSizeToNarrowest(155),    
    /**@ No description provided */
    acCmdSizeToWidest(156),    
    /**@ No description provided */
    acCmdSnapToGrid(62),    
    /**@ No description provided */
    acCmdSortAscending(163),    
    /**@ No description provided */
    acCmdSortDescending(164),    
    /**@ No description provided */
    acCmdSortingAndGrouping(51),    
    /**@ No description provided */
    acCmdSpeech(511),    
    /**@ No description provided */
    acCmdSpelling(269),    
    /**@ No description provided */
    acCmdSQLView(184),    
    /**@ No description provided */
    acCmdStackedLayout(568),    
    /**@ No description provided */
    acCmdStartNewWorkflow(675),    
    /**@ No description provided */
    acCmdStartupProperties(224),    
    /**@ No description provided */
    acCmdStepInto(342),    
    /**@ No description provided */
    acCmdStepOut(311),    
    /**@ No description provided */
    acCmdStepOver(128),    
    /**@ No description provided */
    acCmdStepToCursor(204),    
    /**@ No description provided */
    acCmdSubdatasheetCollapseAll(505),    
    /**@ No description provided */
    acCmdSubdatasheetExpandAll(504),    
    /**@ No description provided */
    acCmdSubdatasheetRemove(506),    
    /**@ No description provided */
    acCmdSubformDatasheet(108),    
    /**@ No description provided */
    acCmdSubformDatasheetView(463),    
    /**@ No description provided */
    acCmdSubformFormView(462),    
    /**@ No description provided */
    acCmdSubformInNewWindow(495),    
    /**@ No description provided */
    acCmdSubformPivotChartView(465),    
    /**@ No description provided */
    acCmdSubformPivotTableView(464),    
    /**@ No description provided */
    acCmdSwitchboardManager(521),    
    /**@ No description provided */
    acCmdSynchronize(638),    
    /**@ No description provided */
    acCmdSynchronizeNow(264),    
    /**@ No description provided */
    acCmdSyncWebApplication(699),    
    /**@ No description provided */
    acCmdTabControlPageOrder(330),    
    /**@ No description provided */
    acCmdTableAddTable(498),    
    /**@ No description provided */
    acCmdTableCustomView(497),    
    /**@ No description provided */
    acCmdTableNames(75),    
    /**@ No description provided */
    acCmdTabOrder(41),    
    /**@ No description provided */
    acCmdTabularLayout(569),    
    /**@ No description provided */
    acCmdTestValidationRules(196),    
    /**@ No description provided */
    acCmdTileHorizontally(286),    
    /**@ No description provided */
    acCmdTileVertically(23),    
    /**@ No description provided */
    acCmdToggleBreakpoint(131),    
    /**@ No description provided */
    acCmdToggleCacheListData(642),    
    /**@ No description provided */
    acCmdToggleFilter(220),    
    /**@ No description provided */
    acCmdToggleOffline(540),    
    /**@ No description provided */
    acCmdToolbarControlProperties(301),    
    /**@ No description provided */
    acCmdToolbarsCustomize(165),    
    /**@ No description provided */
    acCmdTransferSQLDatabase(515),    
    /**@ No description provided */
    acCmdTransparentBackground(288),    
    /**@ No description provided */
    acCmdTransparentBorder(289),    
    /**@ No description provided */
    acCmdUndo(292),    
    /**@ No description provided */
    acCmdUnfreezeAllColumns(106),    
    /**@ No description provided */
    acCmdUngroupControls(485),    
    /**@ No description provided */
    acCmdUnhideColumns(80),    
    /**@ No description provided */
    acCmdUpsizingWizard(522),    
    /**@ No description provided */
    acCmdUserAndGroupAccounts(104),    
    /**@ No description provided */
    acCmdUserAndGroupPermissions(103),    
    /**@ No description provided */
    acCmdUserLevelSecurityWizard(276),    
    /**@ No description provided */
    acCmdVerticalSpacingDecrease(161),    
    /**@ No description provided */
    acCmdVerticalSpacingIncrease(162),    
    /**@ No description provided */
    acCmdVerticalSpacingMakeEqual(160),    
    /**@ No description provided */
    acCmdViewCode(170),    
    /**@ No description provided */
    acCmdViewDetails(210),    
    /**@ No description provided */
    acCmdViewDiagrams(354),    
    /**@ No description provided */
    acCmdViewFieldList(353),    
    /**@ No description provided */
    acCmdViewForms(112),    
    /**@ No description provided */
    acCmdViewFunctions(395),    
    /**@ No description provided */
    acCmdViewGrid(63),    
    /**@ No description provided */
    acCmdViewLargeIcons(209),    
    /**@ No description provided */
    acCmdViewList(212),    
    /**@ No description provided */
    acCmdViewMacros(114),    
    /**@ No description provided */
    acCmdViewModules(115),    
    /**@ No description provided */
    acCmdViewObjectDependencies(536),    
    /**@ No description provided */
    acCmdViewQueries(111),    
    /**@ No description provided */
    acCmdViewReports(113),    
    /**@ No description provided */
    acCmdViewRuler(61),    
    /**@ No description provided */
    acCmdViewShowPaneDiagram(358),    
    /**@ No description provided */
    acCmdViewShowPaneGrid(359),    
    /**@ No description provided */
    acCmdViewShowPaneSQL(357),    
    /**@ No description provided */
    acCmdViewSmallIcons(211),    
    /**@ No description provided */
    acCmdViewStoredProcedures(355),    
    /**@ No description provided */
    acCmdViewTableColumnNames(363),    
    /**@ No description provided */
    acCmdViewTableColumnProperties(368),    
    /**@ No description provided */
    acCmdViewTableKeys(369),    
    /**@ No description provided */
    acCmdViewTableNameOnly(364),    
    /**@ No description provided */
    acCmdViewTables(110),    
    /**@ No description provided */
    acCmdViewTableUserView(370),    
    /**@ No description provided */
    acCmdViewToolbox(85),    
    /**@ No description provided */
    acCmdViewVerifySQL(360),    
    /**@ No description provided */
    acCmdViewViews(356),    
    /**@ No description provided */
    acCmdVisualBasicEditor(525),    
    /**@ No description provided */
    acCmdWindowArrangeIcons(24),    
    /**@ No description provided */
    acCmdWindowCascade(22),    
    /**@ No description provided */
    acCmdWindowHide(2),    
    /**@ No description provided */
    acCmdWindowSplit(121),    
    /**@ No description provided */
    acCmdWindowUnhide(1),    
    /**@ No description provided */
    acCmdWordMailMerge(195),    
    /**@ No description provided */
    acCmdWorkflowTasks(674),    
    /**@ No description provided */
    acCmdWorkgroupAdministrator(391),    
    /**@ No description provided */
    acCmdZoom10(244),    
    /**@ No description provided */
    acCmdZoom100(240),    
    /**@ No description provided */
    acCmdZoom1000(482),    
    /**@ No description provided */
    acCmdZoom150(239),    
    /**@ No description provided */
    acCmdZoom200(238),    
    /**@ No description provided */
    acCmdZoom25(243),    
    /**@ No description provided */
    acCmdZoom50(242),    
    /**@ No description provided */
    acCmdZoom500(481),    
    /**@ No description provided */
    acCmdZoom75(241),    
    /**@ No description provided */
    acCmdZoomBox(179),    
    /**@ No description provided */
    acCmdZoomSelection(371);

    private final long value;

    AcCommand(long value) {
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
