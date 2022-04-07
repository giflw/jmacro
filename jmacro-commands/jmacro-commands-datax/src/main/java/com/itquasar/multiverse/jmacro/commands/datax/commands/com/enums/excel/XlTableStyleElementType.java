package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xltablestyleelementtype">https://docs.microsoft.com/en-us/office/vba/api/excel.xltablestyleelementtype</a>}
*/
public enum XlTableStyleElementType implements COMEnum {
    
    /**@ Blank row */
    xlBlankRow(19),    
    /**@ Column Stripe1 */
    xlColumnStripe1(7),    
    /**@ Column Stripe2 */
    xlColumnStripe2(8),    
    /**@ Column Subheading1 */
    xlColumnSubheading1(20),    
    /**@ Column Subheading2 */
    xlColumnSubheading2(21),    
    /**@ Column Subheading3 */
    xlColumnSubheading3(22),    
    /**@ First column */
    xlFirstColumn(3),    
    /**@ First header cell */
    xlFirstHeaderCell(9),    
    /**@ First total cell */
    xlFirstTotalCell(11),    
    /**@ Grand total column */
    xlGrandTotalColumn(4),    
    /**@ Grand total row */
    xlGrandTotalRow(2),    
    /**@ Header row */
    xlHeaderRow(1),    
    /**@ Last column */
    xlLastColumn(4),    
    /**@ Last header cell */
    xlLastHeaderCell(10),    
    /**@ Last total cell */
    xlLastTotalCell(12),    
    /**@ Page field labels */
    xlPageFieldLabels(26),    
    /**@ Page field values */
    xlPageFieldValues(27),    
    /**@ Row Stripe1 */
    xlRowStripe1(5),    
    /**@ Row Stripe2 */
    xlRowStripe2(6),    
    /**@ Row Subheading1 */
    xlRowSubheading1(23),    
    /**@ Row Subheading2 */
    xlRowSubheading2(24),    
    /**@ Row Subheading3 */
    xlRowSubheading3(25),    
    /**@ A selected item, hovered over by the user, that contains data. */
    xlSlicerHoveredSelectedItemWithData(33),    
    /**@ A selected item, hovered over by the user, that does not contain data. */
    xlSlicerHoveredSelectedItemWithNoData(35),    
    /**@ An item, hovered over by the user, that is not selected and that contains data. */
    xlSlicerHoveredUnselectedItemWithData(32),    
    /**@ A selected item, hovered over by the user, that is not selected and that does not contain data. */
    xlSlicerHoveredUnselectedItemWithNoData(34),    
    /**@ A selected item that contains data. */
    xlSlicerSelectedItemWithData(30),    
    /**@ A selected item that does not contain data. */
    xlSlicerSelectedItemWithNoData(31),    
    /**@ An item that is not selected that contains data. */
    xlSlicerUnselectedItemWithData(28),    
    /**@ An item that is not selected that does not contain data. */
    xlSlicerUnselectedItemWithNoData(29),    
    /**@ Subtotal Column1 */
    xlSubtotalColumn1(13),    
    /**@ Subtotal Column2 */
    xlSubtotalColumn2(14),    
    /**@ Subtotal Column3 */
    xlSubtotalColumn3(15),    
    /**@ Subtotal Row1 */
    xlSubtotalRow1(16),    
    /**@ Subtotal Row2 */
    xlSubtotalRow2(17),    
    /**@ Subtotal Row3 */
    xlSubtotalRow3(18),    
    /**@ Timeline Period Label */
    xlTimelinePeriodLabels1(38),    
    /**@ Additional Timeline Period Label */
    xlTimelinePeriodLabels2(39),    
    /**@ Selected Timeline Time Block */
    xlTimelineSelectedTimeBlock(40),    
    /**@ Selected Timeline Time Block space */
    xlTimelineSelectedTimeBlockSpace(42),    
    /**@ Timeline Selection Label */
    xlTimelineSelectionLabel(36),    
    /**@ Timeline Level */
    xlTimelineTimeLevel(37),    
    /**@ Unselected Timeline Time Block */
    xlTimelineUnselectedTimeBlock(41),    
    /**@ Total Row */
    xlTotalRow(2),    
    /**@ Whole Table */
    xlWholeTable(0);

    private final long value;

    XlTableStyleElementType(long value) {
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
