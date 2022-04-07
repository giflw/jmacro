package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acdefreportview">https://docs.microsoft.com/en-us/office/vba/api/access.acdefreportview</a>}
*/
public enum AcDefReportView implements COMEnum {
    
    /**@ The report opens in Print Preview. */
    acDefViewPreview(0),    
    /**@ The report opens in Report view. */
    acDefViewReportBrowse(1);

    private final long value;

    AcDefReportView(long value) {
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
