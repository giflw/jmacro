package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viscellvals">https://docs.microsoft.com/en-us/office/vba/api/visio.viscellvals</a>}
*/
public enum VisCellVals implements COMEnum {
    
    /**@ No description provided */
    visArchitectural(1),    
    /**@ No description provided */
    visArrowSizeColossal(6),    
    /**@ No description provided */
    visArrowSizeJumbo(5),    
    /**@ No description provided */
    visArrowSizeLarge(3),    
    /**@ No description provided */
    visArrowSizeMedium(2),    
    /**@ No description provided */
    visArrowSizeSmall(1),    
    /**@ No description provided */
    visArrowSizeVeryLarge(4),    
    /**@ No description provided */
    visArrowSizeVerySmall(0),    
    /**@ No description provided */
    visBackDotsMini(8),    
    /**@ No description provided */
    visBackDotsWide(18),    
    /**@ No description provided */
    visBold(1),    
    /**@ No description provided */
    visCalArabicHijri(1),    
    /**@ No description provided */
    visCalChineseTaiwan(3),    
    /**@ No description provided */
    visCalHebrewLunar(2),    
    /**@ No description provided */
    visCalJapaneseEmperor(4),    
    /**@ No description provided */
    visCalKoreanDanki(6),    
    /**@ No description provided */
    visCalSakaEra(7),    
    /**@ No description provided */
    visCaltableHeaderaiBuddhist(5),    
    /**@ No description provided */
    visCalTranslitEnglish(8),    
    /**@ No description provided */
    visCalTranslitFrench(9),    
    /**@ No description provided */
    visCalWestern(0),    
    /**@ No description provided */
    visCaseAllCaps(1),    
    /**@ No description provided */
    visCaseInitialCaps(2),    
    /**@ No description provided */
    visCaseNormal(0),    
    /**@ No description provided */
    visCnnctTypeInwardOutward(2),    
    /**@ No description provided */
    visCnnctTypeInward(0),    
    /**@ No description provided */
    visCnnctTypeOutward(1),    
    /**@ No description provided */
    visComplexBold(16),    
    /**@ No description provided */
    visComplexItalic(32),    
    /**@ No description provided */
    visCtlLockedHidden(6),    
    /**@ No description provided */
    visCtlLocked(1),    
    /**@ No description provided */
    visCtlOffsetMaxHidden(9),    
    /**@ No description provided */
    visCtlOffsetMax(4),    
    /**@ No description provided */
    visCtlOffsetMidHidden(8),    
    /**@ No description provided */
    visCtlOffsetMid(3),    
    /**@ No description provided */
    visCtlOffsetMinHidden(7),    
    /**@ No description provided */
    visCtlOffsetMin(2),    
    /**@ No description provided */
    visCtlProportionalHidden(5),    
    /**@ No description provided */
    visCtlProportional(0),    
    /**@ No description provided */
    visCustom(3),    
    /**@ No description provided */
    visDocPreviewQualityDetailed(1),    
    /**@ No description provided */
    visDocPreviewQualityDraft(0),    
    /**@ No description provided */
    visDocPreviewScope1stPage(0),    
    /**@ No description provided */
    visDocPreviewScopeNone(1),    
    /**@ No description provided */
    visDSArch(7),    
    /**@ No description provided */
    visDSEngr(6),    
    /**@ No description provided */
    visDSMetric(5),    
    /**@ No description provided */
    visDynFBDefault(0),    
    /**@ No description provided */
    visDynFBUCon3Leg(1),    
    /**@ No description provided */
    visDynFBUCon5Leg(2),    
    /**@ No description provided */
    visEngineering(2),    
    /**@ No description provided */
    visForeDotsMini(10),    
    /**@ No description provided */
    visForeDotsNarrow(11),    
    /**@ No description provided */
    visForeDotsWide(12),    
    /**@ No description provided */
    visFSTOblique(2),    
    /**@ No description provided */
    visFSTPageDefault(0),    
    /**@ No description provided */
    visFSTSimple(1),    
    /**@ No description provided */
    visGlueTypeDefault(0),    
    /**@ No description provided */
    visGlueTypeNoWalkingTo(8),    
    /**@ No description provided */
    visGlueTypeNoWalking(4),    
    /**@ No description provided */
    visGlueTypeWalking(2),    
    /**@ No description provided */
    visGridCoarse(2),    
    /**@ No description provided */
    visGridFine(8),    
    /**@ No description provided */
    visGridFixed(0),    
    /**@ No description provided */
    visGridNormal(4),    
    /**@ No description provided */
    visGrpDispModeBack(1),    
    /**@ No description provided */
    visGrpDispModeFront(2),    
    /**@ No description provided */
    visGrpDispModeNone(0),    
    /**@ No description provided */
    visGrpSelModeGroup1st(1),    
    /**@ No description provided */
    visGrpSelModeGroupOnly(0),    
    /**@ No description provided */
    visGrpSelModeMembers1st(2),    
    /**@ No description provided */
    visHalfAndHalf(9),    
    /**@ No description provided */
    visHorzCenter(1),    
    /**@ No description provided */
    visHorzDistribute(4),    
    /**@ No description provided */
    visHorzJustifyHigh(8),    
    /**@ No description provided */
    visHorzJustifyLow(6),    
    /**@ No description provided */
    visHorzJustifyMedium(7),    
    /**@ No description provided */
    visHorzJustify(3),    
    /**@ No description provided */
    visHorzLeft(0),    
    /**@ No description provided */
    visHorzRight(2),    
    /**@ No description provided */
    visItalic(2),    
    /**@ No description provided */
    visLayerAvailable(2),    
    /**@ No description provided */
    visLayerDeleted(1),    
    /**@ No description provided */
    visLayerValid(0),    
    /**@ No description provided */
    visLocFontAlways(1),    
    /**@ No description provided */
    visLocFontIfArialOrSym(0),    
    /**@ No description provided */
    visLocFontNever(2),    
    /**@ No description provided */
    visLOFlagsDont(4),    
    /**@ No description provided */
    visLOFlagsPlacable(1),    
    /**@ No description provided */
    visLOFlagsPNRGroup(8),    
    /**@ No description provided */
    visLOFlagsRoutable(2),    
    /**@ No description provided */
    visLOFlagsVisDecides(0),    
    /**@ No description provided */
    visLOFlipDefault(0),    
    /**@ No description provided */
    visLOFlipNone(8),    
    /**@ No description provided */
    visLOFlipRotate(4),    
    /**@ No description provided */
    visLOFlipX(1),    
    /**@ No description provided */
    visLOFlipY(2),    
    /**@ No description provided */
    visLogical(4),    
    /**@ No description provided */
    visLOJumpDirXDefault(0),    
    /**@ No description provided */
    visLOJumpDirXDown(2),    
    /**@ No description provided */
    visLOJumpDirXUp(1),    
    /**@ No description provided */
    visLOJumpDirYDefault(0),    
    /**@ No description provided */
    visLOJumpDirYLeft(1),    
    /**@ No description provided */
    visLOJumpDirYRight(2),    
    /**@ No description provided */
    visLOJumpStyle2Point(5),    
    /**@ No description provided */
    visLOJumpStyle3Point(6),    
    /**@ No description provided */
    visLOJumpStyle4Point(7),    
    /**@ No description provided */
    visLOJumpStyle5Point(8),    
    /**@ No description provided */
    visLOJumpStyle6Point(9),    
    /**@ No description provided */
    visLOJumpStyleArc(1),    
    /**@ No description provided */
    visLOJumpStyleDefault(0),    
    /**@ No description provided */
    visLOJumpStyleGap(2),    
    /**@ No description provided */
    visLOJumpStyleSquare(3),    
    /**@ No description provided */
    visLOJumpStyleTriangle(4),    
    /**@ No description provided */
    visLOPlaceBottomToTop(4),    
    /**@ No description provided */
    visLOPlaceCircular(6),    
    /**@ No description provided */
    visLOPlaceCompactDownLeft(14),    
    /**@ No description provided */
    visLOPlaceCompactDownRight(7),    
    /**@ No description provided */
    visLOPlaceCompactLeftDown(13),    
    /**@ No description provided */
    visLOPlaceCompactLeftUp(12),    
    /**@ No description provided */
    visLOPlaceCompactRightDown(8),    
    /**@ No description provided */
    visLOPlaceCompactRightUp(9),    
    /**@ No description provided */
    visLOPlaceCompactUpLeft(11),    
    /**@ No description provided */
    visLOPlaceCompactUpRight(10),    
    /**@ No description provided */
    visLOPlaceDefault(0),    
    /**@ No description provided */
    visLOPlaceHierarchyBottomToTopCenter(20),    
    /**@ No description provided */
    visLOPlaceHierarchyBottomToTopLeft(19),    
    /**@ No description provided */
    visLOPlaceHierarchyBottomToTopRight(21),    
    /**@ No description provided */
    visLOPlaceHierarchyLeftToRightBottom(24),    
    /**@ No description provided */
    visLOPlaceHierarchyLeftToRightMiddle(23),    
    /**@ No description provided */
    visLOPlaceHierarchyLeftToRightTop(22),    
    /**@ No description provided */
    visLOPlaceHierarchyRightToLeftBottom(27),    
    /**@ No description provided */
    visLOPlaceHierarchyRightToLeftMiddle(26),    
    /**@ No description provided */
    visLOPlaceHierarchyRightToLeftTop(25),    
    /**@ No description provided */
    visLOPlaceHierarchyTopToBottomCenter(17),    
    /**@ No description provided */
    visLOPlaceHierarchyTopToBottomLeft(16),    
    /**@ No description provided */
    visLOPlaceHierarchyTopToBottomRight(18),    
    /**@ No description provided */
    visLOPlaceLeftToRight(2),    
    /**@ No description provided */
    visLOPlaceParentDefault(15),    
    /**@ No description provided */
    visLOPlaceRadial(3),    
    /**@ No description provided */
    visLOPlaceRightToLeft(5),    
    /**@ No description provided */
    visLOPlaceTopToBottom(1),    
    /**@ No description provided */
    visLORouteCenterToCenter(16),    
    /**@ No description provided */
    visLORouteDefault(0),    
    /**@ No description provided */
    visLORouteExtDefault(0),    
    /**@ No description provided */
    visLORouteExtNURBS(2),    
    /**@ No description provided */
    visLORouteExtStraight(1),    
    /**@ No description provided */
    visLORouteFlowchartEW(13),    
    /**@ No description provided */
    visLORouteFlowchartNS(5),    
    /**@ No description provided */
    visLORouteFlowchartSN(12),    
    /**@ No description provided */
    visLORouteFlowchartWE(6),    
    /**@ No description provided */
    visLORouteNetwork(9),    
    /**@ No description provided */
    visLORouteOrgChartEW(11),    
    /**@ No description provided */
    visLORouteOrgChartNS(3),    
    /**@ No description provided */
    visLORouteOrgChartSN(10),    
    /**@ No description provided */
    visLORouteOrgChartWE(4),    
    /**@ No description provided */
    visLORouteRightAngle(1),    
    /**@ No description provided */
    visLORouteSimpleEW(20),    
    /**@ No description provided */
    visLORouteSimpleHV(21),    
    /**@ No description provided */
    visLORouteSimpleNS(17),    
    /**@ No description provided */
    visLORouteSimpleSN(19),    
    /**@ No description provided */
    visLORouteSimpleVH(22),    
    /**@ No description provided */
    visLORouteSimpleWE(18),    
    /**@ No description provided */
    visLORouteStraight(2),    
    /**@ No description provided */
    visLORouteTreeEW(15),    
    /**@ No description provided */
    visLORouteTreeNS(7),    
    /**@ No description provided */
    visLORouteTreeSN(14),    
    /**@ No description provided */
    visLORouteTreeWE(8),    
    /**@ No description provided */
    visNoFill(0),    
    /**@ No description provided */
    visNoLayerColor(255),    
    /**@ No description provided */
    visNoScale(0),    
    /**@ No description provided */
    visPLOJumpDisplayOrder(4),    
    /**@ No description provided */
    visPLOJumpHorizontal(1),    
    /**@ No description provided */
    visPLOJumpLastRouted(3),    
    /**@ No description provided */
    visPLOJumpNone(0),    
    /**@ No description provided */
    visPLOJumpProhibitAll(6),    
    /**@ No description provided */
    visPLOJumpReverseDisplayOrder(5),    
    /**@ No description provided */
    visPLOJumpVertical(2),    
    /**@ No description provided */
    visPLOLineAdjustFromAll(1),    
    /**@ No description provided */
    visPLOLineAdjustFromNone(2),    
    /**@ No description provided */
    visPLOLineAdjustFromNotRelated(0),    
    /**@ No description provided */
    visPLOLineAdjustFromRoutingDefault(3),    
    /**@ No description provided */
    visPLOLineAdjustToAll(1),    
    /**@ No description provided */
    visPLOLineAdjustToDefault(0),    
    /**@ No description provided */
    visPLOLineAdjustToNone(2),    
    /**@ No description provided */
    visPLOLineAdjustToRelated(3),    
    /**@ No description provided */
    visPLOPlaceBottomToTop(4),    
    /**@ No description provided */
    visPLOPlaceCircular(6),    
    /**@ No description provided */
    visPLOPlaceCompactDownLeft(14),    
    /**@ No description provided */
    visPLOPlaceCompactDownRight(7),    
    /**@ No description provided */
    visPLOPlaceCompactLeftDown(13),    
    /**@ No description provided */
    visPLOPlaceCompactLeftUp(12),    
    /**@ No description provided */
    visPLOPlaceCompactRightDown(8),    
    /**@ No description provided */
    visPLOPlaceCompactRightUp(9),    
    /**@ No description provided */
    visPLOPlaceCompactUpLeft(11),    
    /**@ No description provided */
    visPLOPlaceCompactUpRight(10),    
    /**@ No description provided */
    visPLOPlaceDefault(0),    
    /**@ No description provided */
    visPLOPlaceDeptableHeaderDeep(2),    
    /**@ No description provided */
    visPLOPlaceDeptableHeaderDefault(0),    
    /**@ No description provided */
    visPLOPlaceDeptableHeaderMedium(1),    
    /**@ No description provided */
    visPLOPlaceDeptableHeaderShallow(3),    
    /**@ No description provided */
    visPLOPlaceLeftToRight(2),    
    /**@ No description provided */
    visPLOPlaceRadial(3),    
    /**@ No description provided */
    visPLOPlaceRightToLeft(5),    
    /**@ No description provided */
    visPLOPlaceTopToBottom(1),    
    /**@ No description provided */
    visPLOPlowAll(1),    
    /**@ No description provided */
    visPLOPlowNone(0),    
    /**@ No description provided */
    visPLOSplitAllow(1),    
    /**@ No description provided */
    visPLOSplitNone(0),    
    /**@ No description provided */
    visPosNormal(0),    
    /**@ No description provided */
    visPosSub(2),    
    /**@ No description provided */
    visPosSuper(1),    
    /**@ No description provided */
    visPPFlagsRTLText(1),    
    /**@ No description provided */
    visPPOLandscape(2),    
    /**@ No description provided */
    visPPOPortrait(1),    
    /**@ No description provided */
    visPPOSameAsPrinter(0),    
    /**@ No description provided */
    visPrintSetup(0),    
    /**@ No description provided */
    visPropTypeBool(3),    
    /**@ No description provided */
    visPropTypeCurrency(7),    
    /**@ No description provided */
    visPropTypeDate(5),    
    /**@ No description provided */
    visPropTypeDuration(6),    
    /**@ No description provided */
    visPropTypeListFix(1),    
    /**@ No description provided */
    visPropTypeListVar(4),    
    /**@ No description provided */
    visPropTypeNumber(2),    
    /**@ No description provided */
    visPropTypeString(0),    
    /**@ No description provided */
    visRulerCoarse(8),    
    /**@ No description provided */
    visRulerFine(32),    
    /**@ No description provided */
    visRulerFixed(0),    
    /**@ No description provided */
    visRulerNormal(16),    
    /**@ No description provided */
    visScaleCustom(3),    
    /**@ No description provided */
    visScaleMechanical(5),    
    /**@ No description provided */
    visScaleMetric(4),    
    /**@ No description provided */
    visSLOConFixedRerouteAsNeeded(1),    
    /**@ No description provided */
    visSLOConFixedRerouteFreely(0),    
    /**@ No description provided */
    visSLOConFixedRerouteNever(2),    
    /**@ No description provided */
    visSLOConFixedRerouteOnCrossover(3),    
    /**@ No description provided */
    visSLOFixedConnPtsIgnore(32),    
    /**@ No description provided */
    visSLOFixedConnPtsOnly(64),    
    /**@ No description provided */
    visSLOFixedNoFoldToShape(128),    
    /**@ No description provided */
    visSLOFixedPermeablePlow(4),    
    /**@ No description provided */
    visSLOFixedPlacement(1),    
    /**@ No description provided */
    visSLOFixedPlow(2),    
    /**@ No description provided */
    visSLOJumpAlways(2),    
    /**@ No description provided */
    visSLOJumpDefault(0),    
    /**@ No description provided */
    visSLOJumpNeitableHeaderer(4),    
    /**@ No description provided */
    visSLOJumpNever(1),    
    /**@ No description provided */
    visSLOJumpOtableHeaderer(3),    
    /**@ No description provided */
    visSLOPlowAlways(2),    
    /**@ No description provided */
    visSLOPlowDefault(0),    
    /**@ No description provided */
    visSLOPlowNever(1),    
    /**@ No description provided */
    visSLOSplitAllow(1),    
    /**@ No description provided */
    visSLOSplitNone(0),    
    /**@ No description provided */
    visSLOSplittableAllow(1),    
    /**@ No description provided */
    visSLOSplittableNone(0),    
    /**@ No description provided */
    visSmallCaps(8),    
    /**@ No description provided */
    visSmartTagDispModeAlways(2),    
    /**@ No description provided */
    visSmartTagDispModeMouseOver(0),    
    /**@ No description provided */
    visSmartTagDispModeShapeSelected(1),    
    /**@ No description provided */
    visSmartTagXJustifyCenter(1),    
    /**@ No description provided */
    visSmartTagXJustifyLeft(0),    
    /**@ No description provided */
    visSmartTagXJustifyRight(2),    
    /**@ No description provided */
    visSmartTagYJustifyBottom(2),    
    /**@ No description provided */
    visSmartTagYJustifyMiddle(1),    
    /**@ No description provided */
    visSmartTagYJustifyTop(0),    
    /**@ No description provided */
    visSolid(1),    
    /**@ No description provided */
    visStandard(2),    
    /**@ No description provided */
    visTabStopCenter(1),    
    /**@ No description provided */
    visTabStopComma(4),    
    /**@ No description provided */
    visTabStopDecimal(3),    
    /**@ No description provided */
    visTabStopLeft(0),    
    /**@ No description provided */
    visTabStopRight(2),    
    /**@ No description provided */
    visTFOKHorizontalInVertical(1),    
    /**@ No description provided */
    visTFOKStandard(0),    
    /**@ No description provided */
    vistableHeaderickDiagonalCross(17),    
    /**@ No description provided */
    vistableHeaderickDownDiagonal(15),    
    /**@ No description provided */
    vistableHeaderickHorz(13),    
    /**@ No description provided */
    vistableHeaderickUpDiagonal(16),    
    /**@ No description provided */
    vistableHeaderickVertical(14),    
    /**@ No description provided */
    vistableHeaderinCross(23),    
    /**@ No description provided */
    vistableHeaderinDiagonalCross(24),    
    /**@ No description provided */
    vistableHeaderinDownDiagonal(21),    
    /**@ No description provided */
    vistableHeaderinHorz(19),    
    /**@ No description provided */
    vistableHeaderinUpDiagonal(22),    
    /**@ No description provided */
    vistableHeaderinVert(20),    
    /**@ No description provided */
    visTight(1),    
    /**@ No description provided */
    visTxtBlkFlagsHideHiddens(1),    
    /**@ No description provided */
    visTxtBlkLeftToRight(0),    
    /**@ No description provided */
    visTxtBlkOpaque(255),    
    /**@ No description provided */
    visTxtBlkTopToBottom(1),    
    /**@ No description provided */
    visUIVHidden(1),    
    /**@ No description provided */
    visUIVNormal(0),    
    /**@ No description provided */
    visUnderLine(4),    
    /**@ No description provided */
    visVertBottom(2),    
    /**@ No description provided */
    visVertMiddle(1),    
    /**@ No description provided */
    visVertTop(0),    
    /**@ No description provided */
    visWalkPrefBegNS(1),    
    /**@ No description provided */
    visWalkPrefEndNS(2),    
    /**@ No description provided */
    visWideCross(3),    
    /**@ No description provided */
    visWideDiagonalCross(4),    
    /**@ No description provided */
    visWideDownDiagonal(5),    
    /**@ No description provided */
    visWideHorz(6),    
    /**@ No description provided */
    visWideUpDiagonal(2),    
    /**@ No description provided */
    visWideVert(7),    
    /**@ No description provided */
    visXFormResizeDontCare(0),    
    /**@ No description provided */
    visXFormResizeScale(2),    
    /**@ No description provided */
    visXFormResizeSpread(1);

    private final long value;

    VisCellVals(long value) {
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
