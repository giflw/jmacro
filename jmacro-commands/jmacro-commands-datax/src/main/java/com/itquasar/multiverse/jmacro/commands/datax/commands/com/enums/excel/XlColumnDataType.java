package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcolumndatatype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcolumndatatype</a>}
*/
public enum XlColumnDataType implements COMEnum {
    
    /**@ DMY date format. */
    xlDMYFormat(4),    
    /**@ DYM date format. */
    xlDYMFormat(7),    
    /**@ EMD date format. */
    xlEMDFormat(10),    
    /**@ General. */
    xlGeneralFormat(1),    
    /**@ MDY date format. */
    xlMDYFormat(3),    
    /**@ MYD date format. */
    xlMYDFormat(6),    
    /**@ Column is not parsed. */
    xlSkipColumn(9),    
    /**@ Text. */
    xlTextFormat(2),    
    /**@ YDM date format. */
    xlYDMFormat(8),    
    /**@ YMD date format. */
    xlYMDFormat(5);

    private final long value;

    XlColumnDataType(long value) {
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
