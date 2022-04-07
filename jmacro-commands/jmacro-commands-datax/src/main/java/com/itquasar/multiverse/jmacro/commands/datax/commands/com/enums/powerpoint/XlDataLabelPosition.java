package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xldatalabelposition">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xldatalabelposition</a>}
*/
public enum XlDataLabelPosition implements COMEnum {
    
    /**@ The data label is positioned above the data point. */
    xlLabelPositionAbove(0),    
    /**@ The data label is positioned below the data point. */
    xlLabelPositionBelow(1),    
    /**@ Word sets the position of the data label. */
    xlLabelPositionBestFit(5),    
    /**@ The data label is centered on the data point or is inside a bar or pie chart. */
    xlLabelPositionCenter(-4108),    
    /**@ The data label is in a custom position. */
    xlLabelPositionCustom(7),    
    /**@ The data label is positioned inside the data point at the bottom edge. */
    xlLabelPositionInsideBase(4),    
    /**@ The data label is positioned inside the data point at the top edge. */
    xlLabelPositionInsideEnd(3),    
    /**@ The data label is positioned to the left of the data point. */
    xlLabelPositionLeft(-4131),    
    /**@ Data labels are in multiple positions. */
    xlLabelPositionMixed(6),    
    /**@ The data label is positioned outside the data point at the top edge. */
    xlLabelPositionOutsideEnd(2),    
    /**@ The data label is positioned to the right of the data point. */
    xlLabelPositionRight(-4152);

    private final long value;

    XlDataLabelPosition(long value) {
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
