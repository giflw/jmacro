package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlfilevalidationpivotmode">https://docs.microsoft.com/en-us/office/vba/api/excel.xlfilevalidationpivotmode</a>}
*/
public enum XlFileValidationPivotMode implements COMEnum {
    
    /**@ Validate the contents of data caches as specified by the PivotOptions registry setting (default). */
    xlFileValidationPivotDefault(0),    
    /**@ Validate the contents of all data caches regardless of the registry setting. */
    xlFileValidationPivotRun(1),    
    /**@ Do not validate the contents of data caches. */
    xlFileValidationPivotSkip(2);

    private final long value;

    XlFileValidationPivotMode(long value) {
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
