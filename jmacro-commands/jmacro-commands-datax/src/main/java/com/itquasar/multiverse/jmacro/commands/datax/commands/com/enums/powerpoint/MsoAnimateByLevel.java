package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimatebylevel">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimatebylevel</a>}
*/
public enum MsoAnimateByLevel implements COMEnum {
    
    /**@ Animate chart all at once */
    msoAnimateChartAllAtOnce(7),    
    /**@ Animate chart by category */
    msoAnimateChartByCategory(8),    
    /**@ Animate chart by category elements */
    msoAnimateChartByCategoryElements(9),    
    /**@ Animate chart by series */
    msoAnimateChartBySeries(10),    
    /**@ Animate chart by series elements */
    msoAnimateChartBySeriesElements(11),    
    /**@ Animate diagram all at once */
    msoAnimateDiagramAllAtOnce(12),    
    /**@ Animate diagram breadth by level */
    msoAnimateDiagramBreadthByLevel(16),    
    /**@ Animate diagram breadth by node */
    msoAnimateDiagramBreadthByNode(15),    
    /**@ Animate diagram clockwise */
    msoAnimateDiagramClockwise(17),    
    /**@ Animate diagram clockwise in */
    msoAnimateDiagramClockwiseIn(18),    
    /**@ Animate diagram clockwise out */
    msoAnimateDiagramClockwiseOut(19),    
    /**@ Animate diagram counter-clockwise */
    msoAnimateDiagramCounterClockwise(20),    
    /**@ Animate diagram counter-clockwise in */
    msoAnimateDiagramCounterClockwiseIn(21),    
    /**@ Animate diagram counter-clockwise out */
    msoAnimateDiagramCounterClockwiseOut(22),    
    /**@ Animate diagram depth by branch */
    msoAnimateDiagramDepthByBranch(14),    
    /**@ Animate diagram depth by node */
    msoAnimateDiagramDepthByNode(13),    
    /**@ Animate diagram down */
    msoAnimateDiagramDown(26),    
    /**@ Animate diagram in by ring */
    msoAnimateDiagramInByRing(23),    
    /**@ Animate diagram out by ring */
    msoAnimateDiagramOutByRing(24),    
    /**@ Animate diagram up */
    msoAnimateDiagramUp(25),    
    /**@ Animate level mixed */
    msoAnimateLevelMixed(-1),    
    /**@ Animate level none */
    msoAnimateLevelNone(0),    
    /**@ Animate text by all levels */
    msoAnimateTextByAllLevels(1),    
    /**@ Animate text by fifth level */
    msoAnimateTextByFifthLevel(6),    
    /**@ Animate text by first level */
    msoAnimateTextByFirstLevel(2),    
    /**@ Animate text by fourth level */
    msoAnimateTextByFourthLevel(5),    
    /**@ Animate text by second level */
    msoAnimateTextBySecondLevel(3),    
    /**@ Animate text by third level */
    msoAnimateTextByThirdLevel(4);

    private final long value;

    MsoAnimateByLevel(long value) {
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
