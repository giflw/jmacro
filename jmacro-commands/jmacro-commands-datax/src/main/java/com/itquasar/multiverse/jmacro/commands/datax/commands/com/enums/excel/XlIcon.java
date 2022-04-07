package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlicon">https://docs.microsoft.com/en-us/office/vba/api/excel.xlicon</a>}
*/
public enum XlIcon implements COMEnum {
    
    /**@ Signal Meter With No Filled Bars */
    xlIcon0Bars(37),    
    /**@ 0 Filled Boxes */
    xlIcon0FilledBoxes(52),    
    /**@ Signal Meter With One Filled Bar */
    xlIcon1Bar(38),    
    /**@ 1 Filled Boxes */
    xlIcon1FilledBox(51),    
    /**@ Signal Meter With Two Filled Bars */
    xlIcon2Bars(39),    
    /**@ 2 Filled Boxes */
    xlIcon2FilledBoxes(50),    
    /**@ Signal Meter With Three Filled Bars */
    xlIcon3Bars(40),    
    /**@ 3 Filled Boxes */
    xlIcon3FilledBoxes(49),    
    /**@ Signal Meter With Four Filled Bars */
    xlIcon4Bars(41),    
    /**@ 4 Filled Boxes */
    xlIcon4FilledBoxes(48),    
    /**@ Black Circle */
    xlIconBlackCircle(32),    
    /**@ Black Circle With Border */
    xlIconBlackCircleWithBorder(13),    
    /**@ Circle With One White Quarter */
    xlIconCircleWithOneWhiteQuarter(33),    
    /**@ Circle With Three White Quarters */
    xlIconCircleWithThreeWhiteQuarters(35),    
    /**@ Circle With Two White Quarters */
    xlIconCircleWithTwoWhiteQuarters(34),    
    /**@ Gold Star */
    xlIconGoldStar(42),    
    /**@ Gray Circle */
    xlIconGrayCircle(31),    
    /**@ Gray Down Arrow */
    xlIconGrayDownArrow(6),    
    /**@ Gray Down Incline Arrow */
    xlIconGrayDownInclineArrow(28),    
    /**@ Gray Side Arrow */
    xlIconGraySideArrow(5),    
    /**@ Gray Up Arrow */
    xlIconGrayUpArrow(4),    
    /**@ Gray Up Incline Arrow */
    xlIconGrayUpInclineArrow(27),    
    /**@ Green Check */
    xlIconGreenCheck(22),    
    /**@ Green Check Symbol */
    xlIconGreenCheckSymbol(19),    
    /**@ Green Circle */
    xlIconGreenCircle(10),    
    /**@ Green Flag */
    xlIconGreenFlag(7),    
    /**@ Green Traffic Light */
    xlIconGreenTrafficLight(14),    
    /**@ Green Up Arrow */
    xlIconGreenUpArrow(1),    
    /**@ Green Up Triangle */
    xlIconGreenUpTriangle(45),    
    /**@ Half Gold Star */
    xlIconHalfGoldStar(43),    
    /**@ No Cell Icon */
    xlIconNoCellIcon(-1),    
    /**@ Pink Circle */
    xlIconPinkCircle(30),    
    /**@ Red Circle */
    xlIconRedCircle(29),    
    /**@ Red Circle With Border */
    xlIconRedCircleWithBorder(12),    
    /**@ Red Cross */
    xlIconRedCross(24),    
    /**@ Red Cross Symbol */
    xlIconRedCrossSymbol(21),    
    /**@ Red Diamond */
    xlIconRedDiamond(18),    
    /**@ Red Down Arrow */
    xlIconRedDownArrow(3),    
    /**@ Red Down Triangle */
    xlIconRedDownTriangle(47),    
    /**@ Red Flag */
    xlIconRedFlag(9),    
    /**@ Red Traffic Light */
    xlIconRedTrafficLight(16),    
    /**@ Silver Star */
    xlIconSilverStar(44),    
    /**@ White Circle (All White Quarters) */
    xlIconWhiteCircleAllWhiteQuarters(36),    
    /**@ Yellow Circle */
    xlIconYellowCircle(11),    
    /**@ Yellow Dash */
    xlIconYellowDash(46),    
    /**@ Yellow Down Incline Arrow */
    xlIconYellowDownInclineArrow(26),    
    /**@ Yellow Exclamation */
    xlIconYellowExclamation(23),    
    /**@ Yellow Exclamation Symbol */
    xlIconYellowExclamationSymbol(20),    
    /**@ Yellow Flag */
    xlIconYellowFlag(8),    
    /**@ Yellow Side Arrow */
    xlIconYellowSideArrow(2),    
    /**@ Yellow Traffic Light */
    xlIconYellowTrafficLight(15),    
    /**@ Yellow Triangle */
    xlIconYellowTriangle(17),    
    /**@ Yellow Up Incline Arrow */
    xlIconYellowUpInclineArrow(25);

    private final long value;

    XlIcon(long value) {
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
