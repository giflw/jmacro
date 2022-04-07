package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlpivotfieldorientation">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlpivotfieldorientation</a>}
*/
public enum XlPivotFieldOrientation implements COMEnum {
    
    /**@ A column field. */
    xlColumnField(2),    
    /**@ A data field. */
    xlDataField(4),    
    /**@ A hidden field. */
    xlHidden(0),    
    /**@ A page field. */
    xlPageField(3),    
    /**@ A row field. */
    xlRowField(1);

    private final long value;

    XlPivotFieldOrientation(long value) {
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
