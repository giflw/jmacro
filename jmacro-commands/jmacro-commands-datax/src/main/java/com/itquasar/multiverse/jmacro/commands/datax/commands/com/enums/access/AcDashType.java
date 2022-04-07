package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acdashtype">https://docs.microsoft.com/en-us/office/vba/api/access.acdashtype</a>}
*/
public enum AcDashType implements COMEnum {
    
    /**@ Dash */
    acDashTypeDash(1),    
    /**@ Dash Dot */
    acDashTypeDashDot(3),    
    /**@ Dot */
    acDashTypeDot(2),    
    /**@ Solid */
    acDashTypeSolid(0);

    private final long value;

    AcDashType(long value) {
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
