package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldatalabelposition">https://docs.microsoft.com/en-us/office/vba/api/excel.xldatalabelposition</a>}
*/
public enum XlDataLabelPosition implements COMEnum {
    
    /**@ Data label is positioned above the data point. */
    xlLabelPositionAbove(0),    
    /**@ Data label is positioned below the data point. */
    xlLabelPositionBelow(1),    
    /**@ Microsoft Office Excel 2007 sets the position of the data label. */
    xlLabelPositionBestFit(5),    
    /**@ Data label is centered on the data point or is inside a bar or pie chart. */
    xlLabelPositionCenter(-4108),    
    /**@ Data label is in a custom position. */
    xlLabelPositionCustom(7),    
    /**@ Data label is positioned inside the data point at the bottom edge. */
    xlLabelPositionInsideBase(4),    
    /**@ Data label is positioned inside the data point at the top edge. */
    xlLabelPositionInsideEnd(3),    
    /**@ Data label is positioned to the left of the data point. */
    xlLabelPositionLeft(-4131),    
    /**@ Data labels are in multiple positions. */
    xlLabelPositionMixed(6),    
    /**@ Data label is positioned outside the data point at the top edge. */
    xlLabelPositionOutsideEnd(2),    
    /**@ Data label is positioned to the right of the data point. */
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
