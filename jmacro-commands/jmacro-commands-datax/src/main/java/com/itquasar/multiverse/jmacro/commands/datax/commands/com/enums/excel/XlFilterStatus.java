package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlfilterstatus">https://docs.microsoft.com/en-us/office/vba/api/excel.xlfilterstatus</a>}
*/
public enum XlFilterStatus implements COMEnum {
    
    /**@ Signifies OK or successful. */
    xlFilterStatusOK(0),    
    /**@ SetFilterDateRange(?): StartDate > EndDate */
    xlFilterStatusDateWrongOrder(1),    
    /**@ SetFilterDateRange(?): StartDate or EndDate have a time portion. */
    xlFilterStatusDateHasTime(2),    
    /**@ SetFilterDateRange(?): StartDate or EndDate are not valid dates. */
    xlFilterStatusInvalidDate(3);

    private final long value;

    XlFilterStatus(long value) {
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
