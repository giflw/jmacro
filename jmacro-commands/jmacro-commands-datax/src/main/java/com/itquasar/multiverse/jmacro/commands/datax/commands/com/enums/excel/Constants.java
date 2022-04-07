package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.constants">https://docs.microsoft.com/en-us/office/vba/api/excel.constants</a>}
*/
public enum Constants implements COMEnum {
    
    /**@ 3D Bar */
    xl3DBar(-4099),    
    /**@ 3D Effects1 */
    xl3DEffects1(13),    
    /**@ 3D Effects2 */
    xl3DEffects2(14),    
    /**@ 3D Surface */
    xl3DSurface(-4103),    
    /**@ Above */
    xlAbove(0),    
    /**@ Accounting1 */
    xlAccounting1(4),    
    /**@ Accounting2 */
    xlAccounting2(5),    
    /**@ Accounting4 */
    xlAccounting4(17),    
    /**@ Add */
    xlAdd(2),    
    /**@ All */
    xlAll(-4104),    
    /**@ Accounting3 */
    xlAccounting3(6),    
    /**@ All Except Borders */
    xlAllExceptBorders(7),    
    /**@ Automatic */
    xlAutomatic(-4105),    
    /**@ Automatic */
    xlBar(2),    
    /**@ Below */
    xlBelow(1),    
    /**@ Bidi */
    xlBidi(-5000),    
    /**@ BidiCalendar */
    xlBidiCalendar(3),    
    /**@ Both */
    xlBoth(1),    
    /**@ Bottom */
    xlBottom(-4107),    
    /**@ Cascade */
    xlCascade(7),    
    /**@ Center */
    xlCenter(-4108),    
    /**@ Center Across Selection */
    xlCenterAcrossSelection(7),    
    /**@ Chart 4 */
    xlChart4(2),    
    /**@ Chart Series */
    xlChartSeries(17),    
    /**@ Chart Short */
    xlChartShort(6),    
    /**@ Chart Titles */
    xlChartTitles(18),    
    /**@ Checker */
    xlChecker(9),    
    /**@ Circle */
    xlCircle(8),    
    /**@ Classic1 */
    xlClassic1(1),    
    /**@ Classic2 */
    xlClassic2(2),    
    /**@ Classic3 */
    xlClassic3(3),    
    /**@ Closed */
    xlClosed(3),    
    /**@ Color1 */
    xlColor1(7),    
    /**@ Color2 */
    xlColor2(8),    
    /**@ Color3 */
    xlColor3(9),    
    /**@ Column */
    xlColumn(3),    
    /**@ Combination */
    xlCombination(-4111),    
    /**@ Complete */
    xlComplete(4),    
    /**@ Constants */
    xlConstants(2),    
    /**@ Contents */
    xlContents(2),    
    /**@ Context */
    xlContext(-5002),    
    /**@ Corner */
    xlCorner(2),    
    /**@ CrissCross */
    xlCrissCross(16),    
    /**@ Cross */
    xlCross(4),    
    /**@ Custom */
    xlCustom(-4114),    
    /**@ Debug Code Pane */
    xlDebugCodePane(13),    
    /**@ Default Auto Format */
    xlDefaultAutoFormat(-1),    
    /**@ Desktop */
    xlDesktop(9),    
    /**@ Diamond */
    xlDiamond(2),    
    /**@ Direct */
    xlDirect(1),    
    /**@ Distributed */
    xlDistributed(-4117),    
    /**@ Divide */
    xlDivide(5),    
    /**@ Double Accounting */
    xlDoubleAccounting(5),    
    /**@ Double Closed */
    xlDoubleClosed(5),    
    /**@ Double Open */
    xlDoubleOpen(4),    
    /**@ Double Quote */
    xlDoubleQuote(1),    
    /**@ Drawing Object */
    xlDrawingObject(14),    
    /**@ Entire Chart */
    xlEntireChart(20),    
    /**@ Excel Menus */
    xlExcelMenus(1),    
    /**@ Extended */
    xlExtended(3),    
    /**@ Fill */
    xlFill(5),    
    /**@ First */
    xlFirst(0),    
    /**@ Fixed Value */
    xlFixedValue(1),    
    /**@ Floating */
    xlFloating(5),    
    /**@ Formats */
    xlFormats(-4122),    
    /**@ Formula */
    xlFormula(5),    
    /**@ Full Script */
    xlFullScript(1),    
    /**@ General */
    xlGeneral(1),    
    /**@ Gray16 */
    xlGray16(17),    
    /**@ Gray25 */
    xlGray25(-4124),    
    /**@ Gray50 */
    xlGray50(-4125),    
    /**@ Gray75 */
    xlGray75(-4126),    
    /**@ Gray8 */
    xlGray8(18),    
    /**@ Gregorian */
    xlGregorian(2),    
    /**@ Grid */
    xlGrid(15),    
    /**@ Gridline */
    xlGridline(22),    
    /**@ High */
    xlHigh(-4127),    
    /**@ Hindi Numerals */
    xlHindiNumerals(3),    
    /**@ Icons */
    xlIcons(1),    
    /**@ Immediate Pane */
    xlImmediatePane(12),    
    /**@ Inside */
    xlInside(2),    
    /**@ Integer */
    xlInteger(2),    
    /**@ Justify */
    xlJustify(-4130),    
    /**@ Last */
    xlLast(1),    
    /**@ Last Cell */
    xlLastCell(11),    
    /**@ Latin */
    xlLatin(-5001),    
    /**@ Left */
    xlLeft(-4131),    
    /**@ Left To Right */
    xlLeftToRight(2),    
    /**@ Light Down */
    xlLightDown(13),    
    /**@ Light Horizontal */
    xlLightHorizontal(11),    
    /**@ Light Up */
    xlLightUp(14),    
    /**@ Light Vertical */
    xlLightVertical(12),    
    /**@ List1 */
    xlList1(10),    
    /**@ List2 */
    xlList2(11),    
    /**@ List3 */
    xlList3(12),    
    /**@ Local Format1 */
    xlLocalFormat1(15),    
    /**@ Local Format2 */
    xlLocalFormat2(16),    
    /**@ Logical Cursor */
    xlLogicalCursor(1),    
    /**@ Long */
    xlLong(3),    
    /**@ Lotus Help */
    xlLotusHelp(2),    
    /**@ Low */
    xlLow(-4134),    
    /**@ LTR */
    xlLTR(-5003),    
    /**@ MacrosheetCell */
    xlMacrosheetCell(7),    
    /**@ Manual */
    xlManual(-4135),    
    /**@ Maximum */
    xlMaximum(2),    
    /**@ Minimum */
    xlMinimum(4),    
    /**@ Minus Values */
    xlMinusValues(3),    
    /**@ Mixed */
    xlMixed(2),    
    /**@ Mixed Authorized Script */
    xlMixedAuthorizedScript(4),    
    /**@ Mixed Script */
    xlMixedScript(3),    
    /**@ Module */
    xlModule(-4141),    
    /**@ Multiply */
    xlMultiply(4),    
    /**@ Narrow */
    xlNarrow(1),    
    /**@ Next To Axis */
    xlNextToAxis(4),    
    /**@ No Documents */
    xlNoDocuments(3),    
    /**@ None */
    xlNone(-4142),    
    /**@ Notes */
    xlNotes(-4144),    
    /**@ Off */
    xlOff(-4146),    
    /**@ On */
    xlOn(1),    
    /**@ Opaque */
    xlOpaque(3),    
    /**@ Open */
    xlOpen(2),    
    /**@ Outside */
    xlOutside(3),    
    /**@ Partial */
    xlPartial(3),    
    /**@ Partial Script */
    xlPartialScript(2),    
    /**@ Percent */
    xlPercent(2),    
    /**@ Plus */
    xlPlus(9),    
    /**@ Plus Values */
    xlPlusValues(2),    
    /**@ Reference */
    xlReference(4),    
    /**@ Right */
    xlRight(-4152),    
    /**@ RTL */
    xlRTL(-5004),    
    /**@ Scale */
    xlScale(3),    
    /**@ Semiautomatic */
    xlSemiautomatic(2),    
    /**@ SemiGray75 */
    xlSemiGray75(10),    
    /**@ Short */
    xlShort(1),    
    /**@ Show Label */
    xlShowLabel(4),    
    /**@ Show Label and Percent */
    xlShowLabelAndPercent(5),    
    /**@ Show Percent */
    xlShowPercent(3),    
    /**@ Show Value */
    xlShowValue(2),    
    /**@ Simple */
    xlSimple(-4154),    
    /**@ Single */
    xlSingle(2),    
    /**@ Single Accounting */
    xlSingleAccounting(4),    
    /**@ Single Quote */
    xlSingleQuote(2),    
    /**@ Solid */
    xlSolid(1),    
    /**@ Square */
    xlSquare(1),    
    /**@ Star */
    xlStar(5),    
    /**@ St Error */
    xlStError(4),    
    /**@ Strict */
    xlStrict(2),    
    /**@ Subtract */
    xlSubtract(3),    
    /**@ System */
    xlSystem(1),    
    /**@ Text Box */
    xlTextBox(16),    
    /**@ Tiled */
    xlTiled(1),    
    /**@ Title Bar */
    xlTitleBar(8),    
    /**@ Toolbar */
    xlToolbar(1),    
    /**@ Toolbar Button */
    xlToolbarButton(2),    
    /**@ Top */
    xlTop(-4160),    
    /**@ Top To Bottom */
    xlTopToBottom(1),    
    /**@ Transparent */
    xlTransparent(2),    
    /**@ Triangle */
    xlTriangle(3),    
    /**@ Very Hidden */
    xlVeryHidden(2),    
    /**@ Visible */
    xlVisible(12),    
    /**@ Visual Cursor */
    xlVisualCursor(2),    
    /**@ Watch Pane */
    xlWatchPane(11),    
    /**@ Wide */
    xlWide(3),    
    /**@ Workbook Tab */
    xlWorkbookTab(6),    
    /**@ Worksheet4 */
    xlWorksheet4(1),    
    /**@ Worksheet Cell */
    xlWorksheetCell(3),    
    /**@ Worksheet Short */
    xlWorksheetShort(5);

    private final long value;

    Constants(long value) {
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
