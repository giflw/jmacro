package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlpiesliceindex">https://docs.microsoft.com/en-us/office/vba/api/word.xlpiesliceindex</a>}
*/
public enum XlPieSliceIndex implements COMEnum {
    
    /**@ The center point of a pie slice. */
    xlCenterPoint(5),    
    /**@ The innermost center point of a doughnut slice. */
    xlInnerCenterPoint(8),    
    /**@ The innermost point of the most clockwise radius of a doughnut slice. */
    xlInnerClockwisePoint(7),    
    /**@ The innermost point of the most counterclockwise radius of a doughnut slice. */
    xlInnerCounterClockwisePoint(9),    
    /**@ The midpoint of the most clockwise radius of a slice. */
    xlMidClockwiseRadiusPoint(4),    
    /**@ The midpoint of the most counterclockwise radius of a slice. */
    xlMidCounterClockwiseRadiusPoint(6),    
    /**@ The outer center point of the circumference of a slice. */
    xlOuterCenterPoint(2),    
    /**@ The outermost clockwise point of the circumference of a slice. */
    xlOuterClockwisePoint(3),    
    /**@ The outermost counterclockwise point of the circumference of a slice. */
    xlOuterCounterClockwisePoint(1);

    private final long value;

    XlPieSliceIndex(long value) {
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
