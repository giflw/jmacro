package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlvalign">https://docs.microsoft.com/en-us/office/vba/api/excel.xlvalign</a>}
*/
public enum XlVAlign implements COMEnum {
    
    /**@ Bottom */
    xlVAlignBottom(-4107),    
    /**@ Center */
    xlVAlignCenter(-4108),    
    /**@ Distributed */
    xlVAlignDistributed(-4117),    
    /**@ Justify */
    xlVAlignJustify(-4130),    
    /**@ Top */
    xlVAlignTop(-4160);

    private final long value;

    XlVAlign(long value) {
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
