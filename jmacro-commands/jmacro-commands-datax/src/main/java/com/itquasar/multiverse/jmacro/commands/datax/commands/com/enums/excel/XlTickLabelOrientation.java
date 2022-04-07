package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlticklabelorientation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlticklabelorientation</a>}
*/
public enum XlTickLabelOrientation implements COMEnum {
    
    /**@ Text orientation set by Excel. */
    xlTickLabelOrientationAutomatic(-4105),    
    /**@ Text runs down. */
    xlTickLabelOrientationDownward(-4170),    
    /**@ Characters run horizontally. */
    xlTickLabelOrientationHorizontal(-4128),    
    /**@ Text runs up. */
    xlTickLabelOrientationUpward(-4171),    
    /**@ Characters run vertically. */
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
