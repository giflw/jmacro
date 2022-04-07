package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpagebreak">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpagebreak</a>}
*/
public enum XlPageBreak implements COMEnum {
    
    /**@ Excel will automatically add page breaks. */
    xlPageBreakAutomatic(-4105),    
    /**@ Page breaks are manually inserted. */
    xlPageBreakManual(-4135),    
    /**@ Page breaks are not inserted on the worksheet. */
    xlPageBreakNone(-4142);

    private final long value;

    XlPageBreak(long value) {
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
