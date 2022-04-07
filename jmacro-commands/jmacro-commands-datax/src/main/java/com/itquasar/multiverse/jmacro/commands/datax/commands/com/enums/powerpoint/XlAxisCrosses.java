package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlaxiscrosses">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlaxiscrosses</a>}
*/
public enum XlAxisCrosses implements COMEnum {
    
    /**@ Word sets the axis crossing point. */
    xlAxisCrossesAutomatic(-4105),    
    /**@ The CrossesAt property specifies the axis crossing point. */
    xlAxisCrossesCustom(-4114),    
    /**@ The axis crosses at the maximum value. */
    xlAxisCrossesMaximum(2),    
    /**@ The axis crosses at the minimum value. */
    xlAxisCrossesMinimum(4);

    private final long value;

    XlAxisCrosses(long value) {
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
