package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlbarshape">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlbarshape</a>}
*/
public enum XlBarShape implements COMEnum {
    
    /**@ A box. */
    xlBox(0),    
    /**@ A cone, truncated at the specified value. */
    xlConeToMax(5),    
    /**@ A cone, coming to a point at the specified value. */
    xlConeToPoint(4),    
    /**@ A cylinder. */
    xlCylinder(3),    
    /**@ A pyramid, truncated at the specified value. */
    xlPyramidToMax(2),    
    /**@ A pyramid, coming to a point at the specified value. */
    xlPyramidToPoint(1);

    private final long value;

    XlBarShape(long value) {
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
