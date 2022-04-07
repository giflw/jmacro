package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppslidelayout">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppslidelayout</a>}
*/
public enum PpSlideLayout implements COMEnum {
    
    /**@ Blank */
    ppLayoutBlank(12),    
    /**@ Chart */
    ppLayoutChart(8),    
    /**@ Chart and text */
    ppLayoutChartAndText(6),    
    /**@ ClipArt and text */
    ppLayoutClipArtAndText(10),    
    /**@ ClipArt and vertical text */
    ppLayoutClipArtAndVerticalText(26),    
    /**@ Comparison */
    ppLayoutComparison(34),    
    /**@ Content with caption */
    ppLayoutContentWithCaption(35),    
    /**@ Custom */
    ppLayoutCustom(32),    
    /**@ Four objects */
    ppLayoutFourObjects(24),    
    /**@ Large object */
    ppLayoutLargeObject(15),    
    /**@ MediaClip and text */
    ppLayoutMediaClipAndText(18),    
    /**@ Mixed */
    ppLayoutMixed(-2),    
    /**@ Object */
    ppLayoutObject(16),    
    /**@ Object and text */
    ppLayoutObjectAndText(14),    
    /**@ Object and two objects */
    ppLayoutObjectAndTwoObjects(30),    
    /**@ Object over text */
    ppLayoutObjectOverText(19),    
    /**@ Organization chart */
    ppLayoutOrgchart(7),    
    /**@ Picture with caption */
    ppLayoutPictureWithCaption(36),    
    /**@ Section header */
    ppLayoutSectionHeader(33),    
    /**@ Table */
    ppLayoutTable(4),    
    /**@ Text */
    ppLayoutText(2),    
    /**@ Text and chart */
    ppLayoutTextAndChart(5),    
    /**@ Text and ClipArt */
    ppLayoutTextAndClipArt(9),    
    /**@ Text and MediaClip */
    ppLayoutTextAndMediaClip(17),    
    /**@ Text and object */
    ppLayoutTextAndObject(13),    
    /**@ Text and two objects */
    ppLayoutTextAndTwoObjects(21),    
    /**@ Text over object */
    ppLayoutTextOverObject(20),    
    /**@ Title */
    ppLayoutTitle(1),    
    /**@ Title only */
    ppLayoutTitleOnly(11),    
    /**@ Two-column text */
    ppLayoutTwoColumnText(3),    
    /**@ Two objects */
    ppLayoutTwoObjects(29),    
    /**@ Two objects and object */
    ppLayoutTwoObjectsAndObject(31),    
    /**@ Two objects and text */
    ppLayoutTwoObjectsAndText(22),    
    /**@ Two objects over text */
    ppLayoutTwoObjectsOverText(23),    
    /**@ Vertical text */
    ppLayoutVerticalText(25),    
    /**@ Vertical title and text */
    ppLayoutVerticalTitleAndText(27),    
    /**@ Vertical title and text over chart */
    ppLayoutVerticalTitleAndTextOverChart(28);

    private final long value;

    PpSlideLayout(long value) {
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
