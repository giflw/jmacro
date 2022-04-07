package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viseventcodes">https://docs.microsoft.com/en-us/office/vba/api/visio.viseventcodes</a>}
*/
public enum VisEventCodes implements COMEnum {
    
    /**@ AddAdvise action code */
    visActCodeAdvise(2),    
    /**@ RunAddon action code */
    visActCodeRunAddon(1),    
    /**@ Event code for adding an Event object, passed to the Add and AddAdvise methods. Used in conjunction with object codes for particular objects. */
    visEvtAdd(32768),    
    /**@ AfterModal event */
    visEvtAfterModal(64),    
    /**@ Application object */
    visEvtApp(4096),    
    /**@ AppActivated event */
    visEvtAppActivate(1),    
    /**@ AppDeactivated event */
    visEvtAppDeactivate(2),    
    /**@ BeforeModal event */
    visEvtBeforeModal(32),    
    /**@ BeforeQuit event */
    visEvtBeforeQuit(16),    
    /**@ Cell object */
    visEvtCell(2048),    
    /**@ AfterCoauthMerge event code */
    visEvtCodeAfterCoauthMerge(14),    
    /**@ AfterForcedFlush event code */
    visEvtCodeAfterForcedFlush(201),    
    /**@ AfterResume event code */
    visEvtCodeAfterResume(209),    
    /**@ AfterResumeEvents event code */
    visEvtCodeAfterResumeEvents(213),    
    /**@ BeforeDocumentSaveAs event code */
    visEvtCodeBefDocSaveAs(8),    
    /**@ BeforeDocumentSave event code */
    visEvtCodeBefDocSave(7),    
    /**@ BeforeForcedFlush event code */
    visEvtCodeBefForcedFlush(200),    
    /**@ BeforeReplaceShapes event code */
    visEvtCodeBeforeReplaceShapes(913),    
    /**@ BeforeSuspend event code */
    visEvtCodeBeforeSuspend(208),    
    /**@ BeforeSuspendEvents event code */
    visEvtCodeBeforeSuspendEvents(212),    
    /**@ BeforeSelectionDelete event code */
    visEvtCodeBefSelDel(901),    
    /**@ BeforeWindowPageTurn event code */
    visEvtCodeBefWinPageTurn(703),    
    /**@ BeforeWindowSelDelete event code */
    visEvtCodeBefWinSelDel(702),    
    /**@ CalloutRelationshipAdded event code */
    visEvtCodeCalloutRelationshipAdded(504),    
    /**@ CalloutRelationshipDeleted event code */
    visEvtCodeCalloutRelationshipDeleted(505),    
    /**@ ConvertToGroupCanceled event code */
    visEvtCodeCancelConvertToGroup(908),    
    /**@ DocumentCloseCanceled event code */
    visEvtCodeCancelDocClose(10),    
    /**@ MasterDeleteCanceled event code */
    visEvtCodeCancelMasterDel(401),    
    /**@ PageDeleteCanceled event code */
    visEvtCodeCancelPageDel(501),    
    /**@ QuitCanceled event code */
    visEvtCodeCancelQuit(205),    
    /**@ ReplaceShapesCancelled event code */
    visEvtCodeCancelReplaceShapes(912),    
    /**@ SelectionDeleteCanceled event code */
    visEvtCodeCancelSelDel(904),    
    /**@ GroupCanceled event code */
    visEvtCodeCancelSelGroup(910),    
    /**@ StyleDeleteCanceled event code */
    visEvtCodeCancelStyleDel(301),    
    /**@ SuspendCanceled event code */
    visEvtCodeCancelSuspend(207),    
    /**@ SuspendEventsCanceled event code */
    visEvtCodeCancelSuspendEvents(211),    
    /**@ UngroupCanceled event code */
    visEvtCodeCancelUngroup(906),    
    /**@ WindowCloseCanceled event code */
    visEvtCodeCancelWinClose(707),    
    /**@ ContainerRelationshipAdded event code */
    visEvtCodeContainerRelationshipAdded(502),    
    /**@ ContainerRelationshipDeleted event code */
    visEvtCodeContainerRelationshipDeleted(503),    
    /**@ DocumentCreated event code */
    visEvtCodeDocCreate(1),    
    /**@ DocumentDesignModeEntered event code */
    visEvtCodeDocDesign(6),    
    /**@ DocumentOpened event code */
    visEvtCodeDocOpen(2),    
    /**@ DocumentRunModeEntered event code */
    visEvtCodeDocRunning(5),    
    /**@ DocumentSavedAs event code */
    visEvtCodeDocSaveAs(4),    
    /**@ DocumentSaved event code */
    visEvtCodeDocSave(3),    
    /**@ EnterScope event code */
    visEvtCodeEnterScope(202),    
    /**@ ExitScope event code */
    visEvtCodeExitScope(203),    
    /**@ An event code no event can have. */
    visEvtCodeInval(0),    
    /**@ KeyDown event code */
    visEvtCodeKeyDown(712),    
    /**@ KeyPress event code */
    visEvtCodeKeyPress(713),    
    /**@ KeyUp event code */
    visEvtCodeKeyUp(714),    
    /**@ MouseDown event code */
    visEvtCodeMouseDown(709),    
    /**@ MousePress event code */
    visEvtCodeMouseMove(710),    
    /**@ MouseUp event code */
    visEvtCodeMouseUp(711),    
    /**@ QueryCancelConvertToGroup event code */
    visEvtCodeQueryCancelConvertToGroup(907),    
    /**@ QueryCancelDocumentClose event code */
    visEvtCodeQueryCancelDocClose(9),    
    /**@ QueryCancelMasterDelete event code */
    visEvtCodeQueryCancelMasterDel(400),    
    /**@ QueryCancelPageDelete event code */
    visEvtCodeQueryCancelPageDel(500),    
    /**@ QueryCancelReplaceShapes event code */
    visEvtCodeQueryCancelReplaceShapes(911),    
    /**@ QueryCancelQuit event code */
    visEvtCodeQueryCancelQuit(204),    
    /**@ QueryCancelSelectionDeleted event code */
    visEvtCodeQueryCancelSelDel(903),    
    /**@ QueryCancelGroup event code */
    visEvtCodeQueryCancelSelGroup(909),    
    /**@ QueryCancelStyleDeleted event code */
    visEvtCodeQueryCancelStyleDel(300),    
    /**@ QueryCancelSuspend event code */
    visEvtCodeQueryCancelSuspend(206),    
    /**@ QueryCancelSuspendEvents event code */
    visEvtCodeQueryCancelSuspendEvents(210),    
    /**@ QueryCancelUngroup event code */
    visEvtCodeQueryCancelUngroup(905),    
    /**@ QueryCancelWindowClose event code */
    visEvtCodeQueryCancelWinClose(706),    
    /**@ RuleSetValidated event code */
    visEvtCodeRuleSetValidated(13),    
    /**@ SelectionAdded event code */
    visEvtCodeSelAdded(902),    
    /**@ SelectionMovedToSubprocess event code */
    visEvtCodeSelectionMovedToSubprocess(12),    
    /**@ BeforeShapeTextEdit event code */
    visEvtCodeShapeBeforeTextEdit(803),    
    /**@ ShapesDeleted event code */
    visEvtCodeShapeDelete(801),    
    /**@ ShapeExitedTextEdit event code */
    visEvtCodeShapeExitTextEdit(804),    
    /**@ ShapeParentChanged event code */
    visEvtCodeShapeParentChange(802),    
    /**@ ShapesReplaced event code */
    visEvtCodeShapesReplaced(914),    
    /**@ ViewChanged event code */
    visEvtCodeViewChanged(705),    
    /**@ OnKeystrokeMessageForAddon event code */
    visEvtCodeWinOnAddonKeyMSG(708),    
    /**@ WindowTurnToPage event code */
    visEvtCodeWinPageTurn(704),    
    /**@ SelectionChanged event code */
    visEvtCodeWinSelChange(701),    
    /**@ Connect object */
    visEvtConnect(256),    
    /**@ Event code for deleting an Event object, passed to the Delete and AddAdvise methods. Used in conjunction with object codes for particular objects. */
    visEvtDel(16384),    
    /**@ DataRecordset object */
    visEvtDataRecordset(32),    
    /**@ Document object */
    visEvtDoc(2),    
    /**@ FormulaChanged event */
    visEvtFormula(4096),    
    /**@ An ID no event can have. */
    visEvtIDInval(-1),    
    /**@ VisioIsIdle event code */
    visEvtIdle(1024),    
    /**@ The ID of the most recent event to fire. */
    visEvtIdMostRecent(0),    
    /**@ MarkerEvent event */
    visEvtMarker(256),    
    /**@ Master object */
    visEvtMaster(8),    
    /**@ Used in conjunction with object codes for particular objects to create events that report a change to an object. For example, visEvtMod + visEvtCell consitutes the CellChanged event. */
    visEvtMod(8192),    
    /**@ NoEventsPending event */
    visEvtNonePending(512),    
    /**@ AppObjActivated event */
    visEvtObjActivate(4),    
    /**@ AppObjDeactivated */
    visEvtObjDeactivate(8),    
    /**@ Page object */
    visEvtPage(16),    
    /**@ AfterRemoveHiddenInformation event */
    visEvtRemoveHiddenInformation(11),    
    /**@ Row object */
    visEvtRow(1024),    
    /**@ Section object */
    visEvtSection(512),    
    /**@ Shape object */
    visEvtShape(64),    
    /**@ ShapeDataGraphicChanged event */
    visEvtShapeDataGraphicChanged(807),    
    /**@ ShapeLinkAdded event */
    visEvtShapeLinkAdded(805),    
    /**@ ShapeLinkDeleted event */
    visEvtShapeLinkDeleted(806),    
    /**@ Style object */
    visEvtStyle(4),    
    /**@ Text object */
    visEvtText(128),    
    /**@ WindowActivated event */
    visEvtWinActivate(128),    
    /**@ Window object */
    visEvtWindow(1),    
    /**@ An ID no event scope can have. */
    visScopeIDInval(-1);

    private final long value;

    VisEventCodes(long value) {
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
