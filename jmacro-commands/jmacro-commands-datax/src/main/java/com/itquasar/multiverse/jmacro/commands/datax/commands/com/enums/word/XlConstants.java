package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlconstants">https://docs.microsoft.com/en-us/office/vba/api/word.xlconstants</a>}
*/
public enum XlConstants implements COMEnum {
    
    /**@ Three-dimensional bar chart group or series. */
    xl3DBar(-4099),    
    /**@ Three-dimensional surface chart group or series. */
    xl3DSurface(-4103),    
    /**@ The summary row is displayed above the specified range. */
    xlAbove(0),    
    /**@ Word applies automatic settings, such as a color or page number, to the specified object. */
    xlAutomatic(-4105),    
    /**@ Two-dimensional bar chart group or series. */
    xlBar(2),    
    /**@ The summary row is displayed below the specified range. */
    xlBelow(1),    
    /**@ Display positive and negative error bars in the specified chart group or series. */
    xlBoth(1),    
    /**@ Bottom. */
    xlBottom(-4107),    
    /**@ Center. */
    xlCenter(-4108),    
    /**@ Checker pattern. */
    xlChecker(9),    
    /**@ Circle. */
    xlCircle(8),    
    /**@ Columnar chart group or series. */
    xlColumn(3),    
    /**@ Combination. */
    xlCombination(-4111),    
    /**@ Corner. */
    xlCorner(2),    
    /**@ Criss-cross pattern. */
    xlCrissCross(16),    
    /**@ Cross pattern. */
    xlCross(4),    
    /**@ Word applies custom settings, such as a color or error amount, to the specified object. */
    xlCustom(-4114),    
    /**@ Word applies default or automatic formatting. */
    xlDefaultAutoFormat(-1),    
    /**@ Diamond pattern. */
    xlDiamond(2),    
    /**@ Distributed. */
    xlDistributed(-4117),    
    /**@ Fill. */
    xlFill(5),    
    /**@ Display error amounts as a fixed value. */
    xlFixedValue(1),    
    /**@ General. */
    xlGeneral(1),    
    /**@ 16% gray pattern. */
    xlGray16(17),    
    /**@ 25% gray pattern. */
    xlGray25(-4124),    
    /**@ 50% gray pattern. */
    xlGray50(-4125),    
    /**@ 75% gray pattern. */
    xlGray75(-4126),    
    /**@ 8% gray pattern. */
    xlGray8(18),    
    /**@ Grid pattern. */
    xlGrid(15),    
    /**@ High. */
    xlHigh(-4127),    
    /**@ Inside. */
    xlInside(2),    
    /**@ Justify. */
    xlJustify(-4130),    
    /**@ Left. */
    xlLeft(-4131),    
    /**@ Light down line pattern. */
    xlLightDown(13),    
    /**@ Light horizontal line pattern. */
    xlLightHorizontal(11),    
    /**@ Light up line pattern. */
    xlLightUp(14),    
    /**@ Light vertical line pattern. */
    xlLightVertical(12),    
    /**@ Low. */
    xlLow(-4134),    
    /**@ Maximum. */
    xlMaximum(2),    
    /**@ Minimum. */
    xlMinimum(4),    
    /**@ Minus values. */
    xlMinusValues(3),    
    /**@ Next to axis. */
    xlNextToAxis(4),    
    /**@ Do not display error bars in the specified chart group or series. */
    xlNone(-4142),    
    /**@ Opaque fill. */
    xlOpaque(3),    
    /**@ Outside. */
    xlOutside(3),    
    /**@ Display error amounts as a percentage. */
    xlPercent(2),    
    /**@ Display positive error bars in the specified chart group or series. */
    xlPlus(9),    
    /**@ Plus values. */
    xlPlusValues(2),    
    /**@ Right. */
    xlRight(-4152),    
    /**@ Scale. */
    xlScale(3),    
    /**@ 75% semi-gray pattern. */
    xlSemiGray75(10),    
    /**@ Show label. */
    xlShowLabel(4),    
    /**@ Show label and percent. */
    xlShowLabelAndPercent(5),    
    /**@ Show percent. */
    xlShowPercent(3),    
    /**@ Show value. */
    xlShowValue(2),    
    /**@ Single line. */
    xlSingle(2),    
    /**@ Solid pattern. */
    xlSolid(1),    
    /**@ Square. */
    xlSquare(1),    
    /**@ Star. */
    xlStar(5),    
    /**@ Display error amounts as a standard error. */
    xlStError(4),    
    /**@ Top. */
    xlTop(-4160),    
    /**@ Transparent fill. */
    xlTransparent(2),    
    /**@ Triangle. */
    xlTriangle(3);

    private final long value;

    XlConstants(long value) {
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
