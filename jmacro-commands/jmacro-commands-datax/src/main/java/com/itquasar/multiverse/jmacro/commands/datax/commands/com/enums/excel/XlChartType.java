package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcharttype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcharttype</a>}
*/
public enum XlChartType implements COMEnum {
    
    /**@ 3D Area. */
    xl3DArea(-4098),    
    /**@ 3D Stacked Area. */
    xl3DAreaStacked(78),    
    /**@ 100% Stacked Area. */
    xl3DAreaStacked100(79),    
    /**@ 3D Clustered Bar. */
    xl3DBarClustered(60),    
    /**@ 3D Stacked Bar. */
    xl3DBarStacked(61),    
    /**@ 3D 100% Stacked Bar. */
    xl3DBarStacked100(62),    
    /**@ 3D Column. */
    xl3DColumn(-4100),    
    /**@ 3D Clustered Column. */
    xl3DColumnClustered(54),    
    /**@ 3D Stacked Column. */
    xl3DColumnStacked(55),    
    /**@ 3D 100% Stacked Column. */
    xl3DColumnStacked100(56),    
    /**@ 3D Line. */
    xl3DLine(-4101),    
    /**@ 3D Pie. */
    xl3DPie(-4102),    
    /**@ Exploded 3D Pie. */
    xl3DPieExploded(70),    
    /**@ Area */
    xlArea(1),    
    /**@ Stacked Area. */
    xlAreaStacked(76),    
    /**@ 100% Stacked Area. */
    xlAreaStacked100(77),    
    /**@ Clustered Bar. */
    xlBarClustered(57),    
    /**@ Bar of Pie. */
    xlBarOfPie(71),    
    /**@ Stacked Bar. */
    xlBarStacked(58),    
    /**@ 100% Stacked Bar. */
    xlBarStacked100(59),    
    /**@ Bubble. */
    xlBubble(15),    
    /**@ Bubble with 3D effects. */
    xlBubble3DEffect(87),    
    /**@ Clustered Column. */
    xlColumnClustered(51),    
    /**@ Stacked Column. */
    xlColumnStacked(52),    
    /**@ 100% Stacked Column. */
    xlColumnStacked100(53),    
    /**@ Clustered Cone Bar. */
    xlConeBarClustered(102),    
    /**@ Stacked Cone Bar. */
    xlConeBarStacked(103),    
    /**@ 100% Stacked Cone Bar. */
    xlConeBarStacked100(104),    
    /**@ 3D Cone Column. */
    xlConeCol(105),    
    /**@ Clustered Cone Column. */
    xlConeColClustered(99),    
    /**@ Stacked Cone Column. */
    xlConeColStacked(100),    
    /**@ 100% Stacked Cone Column. */
    xlConeColStacked100(101),    
    /**@ Clustered Cylinder Bar. */
    xlCylinderBarClustered(95),    
    /**@ Stacked Cylinder Bar. */
    xlCylinderBarStacked(96),    
    /**@ 100% Stacked Cylinder Bar. */
    xlCylinderBarStacked100(97),    
    /**@ 3D Cylinder Column. */
    xlCylinderCol(98),    
    /**@ Clustered Cone Column. */
    xlCylinderColClustered(92),    
    /**@ Stacked Cone Column. */
    xlCylinderColStacked(93),    
    /**@ 100% Stacked Cylinder Column. */
    xlCylinderColStacked100(94),    
    /**@ Doughnut. */
    xlDoughnut(-4120),    
    /**@ Exploded Doughnut. */
    xlDoughnutExploded(80),    
    /**@ Line. */
    xlLine(4),    
    /**@ Line with Markers. */
    xlLineMarkers(65),    
    /**@ Stacked Line with Markers. */
    xlLineMarkersStacked(66),    
    /**@ 100% Stacked Line with Markers. */
    xlLineMarkersStacked100(67),    
    /**@ Stacked Line. */
    xlLineStacked(63),    
    /**@ 100% Stacked Line. */
    xlLineStacked100(64),    
    /**@ Pie. */
    xlPie(5),    
    /**@ Exploded Pie. */
    xlPieExploded(69),    
    /**@ Pie of Pie. */
    xlPieOfPie(68),    
    /**@ Clustered Pyramid Bar. */
    xlPyramidBarClustered(109),    
    /**@ Stacked Pyramid Bar. */
    xlPyramidBarStacked(110),    
    /**@ 100% Stacked Pyramid Bar. */
    xlPyramidBarStacked100(111),    
    /**@ 3D Pyramid Column. */
    xlPyramidCol(112),    
    /**@ Clustered Pyramid Column. */
    xlPyramidColClustered(106),    
    /**@ Stacked Pyramid Column. */
    xlPyramidColStacked(107),    
    /**@ 100% Stacked Pyramid Column. */
    xlPyramidColStacked100(108),    
    /**@ Radar. */
    xlRadar(-4151),    
    /**@ Filled Radar. */
    xlRadarFilled(82),    
    /**@ Radar with Data Markers. */
    xlRadarMarkers(81),    
    /**@ Map chart. */
    xlRegionMap(140),    
    /**@ High-Low-Close. */
    xlStockHLC(88),    
    /**@ Open-High-Low-Close. */
    xlStockOHLC(89),    
    /**@ Volume-High-Low-Close. */
    xlStockVHLC(90),    
    /**@ Volume-Open-High-Low-Close. */
    xlStockVOHLC(91),    
    /**@ 3D Surface. */
    xlSurface(83),    
    /**@ Surface (Top View). */
    xlSurfaceTopView(85),    
    /**@ Surface (Top View wireframe). */
    xlSurfaceTopViewWireframe(86),    
    /**@ 3D Surface (wireframe). */
    xlSurfaceWireframe(84),    
    /**@ Scatter. */
    xlXYScatter(-4169),    
    /**@ Scatter with Lines. */
    xlXYScatterLines(74),    
    /**@ Scatter with Lines and No Data Markers. */
    xlXYScatterLinesNoMarkers(75),    
    /**@ Scatter with Smoothed Lines. */
    xlXYScatterSmooth(72),    
    /**@ Scatter with Smoothed Lines and No Data Markers. */
    xlXYScatterSmoothNoMarkers(73);

    private final long value;

    XlChartType(long value) {
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
