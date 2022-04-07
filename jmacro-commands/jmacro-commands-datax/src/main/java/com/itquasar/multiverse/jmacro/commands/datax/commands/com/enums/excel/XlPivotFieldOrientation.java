package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotfieldorientation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotfieldorientation</a>}
*/
public enum XlPivotFieldOrientation implements COMEnum {
    
    /**@ Column */
    xlColumnField(2),    
    /**@ Data */
    xlDataField(4),    
    /**@ Hidden */
    xlHidden(0),    
    /**@ Page */
    xlPageField(3),    
    /**@ Row */
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
