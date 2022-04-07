package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllocationintable">https://docs.microsoft.com/en-us/office/vba/api/excel.xllocationintable</a>}
*/
public enum XlLocationInTable implements COMEnum {
    
    /**@ Column header */
    xlColumnHeader(-4110),    
    /**@ Column item */
    xlColumnItem(5),    
    /**@ Data header */
    xlDataHeader(3),    
    /**@ Data item */
    xlDataItem(7),    
    /**@ Page header */
    xlPageHeader(2),    
    /**@ Page item */
    xlPageItem(6),    
    /**@ Row header */
    xlRowHeader(-4153),    
    /**@ Row item */
    xlRowItem(4),    
    /**@ Table body */
    xlTableBody(8);

    private final long value;

    XlLocationInTable(long value) {
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
