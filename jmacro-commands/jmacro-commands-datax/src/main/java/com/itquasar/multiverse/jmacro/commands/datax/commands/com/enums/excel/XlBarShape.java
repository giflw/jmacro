package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlbarshape">https://docs.microsoft.com/en-us/office/vba/api/excel.xlbarshape</a>}
*/
public enum XlBarShape implements COMEnum {
    
    /**@ Box. */
    xlBox(0),    
    /**@ Cone, truncated at value. */
    xlConeToMax(5),    
    /**@ Cone, coming to point at value. */
    xlConeToPoint(4),    
    /**@ Cylinder. */
    xlCylinder(3),    
    /**@ Pyramid, truncated at value. */
    xlPyramidToMax(2),    
    /**@ Pyramid, coming to point at value. */
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
