package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlticklabelorientation">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlticklabelorientation</a>}
*/
public enum XlTickLabelOrientation implements COMEnum {
    
    /**@ The text orientation is set by Microsoft Word. */
    xlTickLabelOrientationAutomatic(-4105),    
    /**@ The text runs downward. */
    xlTickLabelOrientationDownward(-4170),    
    /**@ The characters run horizontally. */
    xlTickLabelOrientationHorizontal(-4128),    
    /**@ The text runs upward. */
    xlTickLabelOrientationUpward(-4171),    
    /**@ The characters run vertically. */
    xlTickLabelOrientationVertical(-4166);

    private final long value;

    XlTickLabelOrientation(long value) {
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
