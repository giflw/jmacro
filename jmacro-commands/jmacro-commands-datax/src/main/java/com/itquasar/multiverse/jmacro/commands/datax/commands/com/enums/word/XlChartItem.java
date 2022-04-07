package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlchartitem">https://docs.microsoft.com/en-us/office/vba/api/word.xlchartitem</a>}
*/
public enum XlChartItem implements COMEnum {
    
    /**@ Axis. */
    xlAxis(21),    
    /**@ Axis title. */
    xlAxisTitle(17),    
    /**@ Chart area. */
    xlChartArea(2),    
    /**@ Chart title. */
    xlChartTitle(4),    
    /**@ Corners. */
    xlCorners(6),    
    /**@ Data label. */
    xlDataLabel(0),    
    /**@ Data table. */
    xlDataTable(7),    
    /**@ Display unit label. */
    xlDisplayUnitLabel(30),    
    /**@ Down bars. */
    xlDownBars(20),    
    /**@ Drop lines. */
    xlDropLines(26),    
    /**@ Error bars. */
    xlErrorBars(9),    
    /**@ Floor. */
    xlFloor(23),    
    /**@ HiLo lines. */
    xlHiLoLines(25),    
    /**@ Leader lines. */
    xlLeaderLines(29),    
    /**@ Legend. */
    xlLegend(24),    
    /**@ Legend entry. */
    xlLegendEntry(12),    
    /**@ Legend key. */
    xlLegendKey(13),    
    /**@ Major gridlines. */
    xlMajorGridlines(15),    
    /**@ Minor gridlines. */
    xlMinorGridlines(16),    
    /**@ Nothing. */
    xlNothing(28),    
    /**@ PivotChart drop zone. */
    xlPivotChartDropZone(32),    
    /**@ PivotChart field button. */
    xlPivotChartFieldButton(31),    
    /**@ Plot area. */
    xlPlotArea(19),    
    /**@ Radar axis labels. */
    xlRadarAxisLabels(27),    
    /**@ Series. */
    xlSeries(3),    
    /**@ Series lines. */
    xlSeriesLines(22),    
    /**@ Shape. */
    xlShape(14),    
    /**@ Trend line. */
    xlTrendline(8),    
    /**@ Up bars. */
    xlUpBars(18),    
    /**@ Walls. */
    xlWalls(5),    
    /**@ X error bars. */
    xlXErrorBars(10),    
    /**@ Y error bars. */
    xlYErrorBars(11);

    private final long value;

    XlChartItem(long value) {
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
