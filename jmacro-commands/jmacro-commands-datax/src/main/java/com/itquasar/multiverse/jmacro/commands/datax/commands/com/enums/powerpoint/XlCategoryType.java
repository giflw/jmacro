package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlcategorytype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlcategorytype</a>}
*/
public enum XlCategoryType implements COMEnum {
    
    /**@ Word controls the axis type. */
    xlAutomaticScale(-4105),    
    /**@ Axis groups data by an arbitrary set of categories. */
    xlCategoryScale(2),    
    /**@ Axis groups data on a time scale. */
    xlTimeScale(3);

    private final long value;

    XlCategoryType(long value) {
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
