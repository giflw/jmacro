package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllookfor">https://docs.microsoft.com/en-us/office/vba/api/excel.xllookfor</a>}
*/
public enum XlLookFor implements COMEnum {
    
    /**@ Blanks */
    LookForBlanks(0),    
    /**@ Errors */
    LookForErrors(1),    
    /**@ Formulas */
    LookForFormulas(2);

    private final long value;

    XlLookFor(long value) {
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
