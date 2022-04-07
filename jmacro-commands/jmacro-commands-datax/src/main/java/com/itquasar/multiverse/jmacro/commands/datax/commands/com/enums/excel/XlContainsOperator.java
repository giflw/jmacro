package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcontainsoperator">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcontainsoperator</a>}
*/
public enum XlContainsOperator implements COMEnum {
    
    /**@ Begins with a specified value. */
    xlBeginsWith(2),    
    /**@ Contains a specified value. */
    xlContains(0),    
    /**@ Does not contain the specified value. */
    xlDoesNotContain(1),    
    /**@ Endswith the specified value */
    xlEndsWith(3);

    private final long value;

    XlContainsOperator(long value) {
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
