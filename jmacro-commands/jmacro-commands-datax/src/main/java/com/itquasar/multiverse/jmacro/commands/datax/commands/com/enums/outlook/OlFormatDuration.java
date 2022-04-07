package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatduration">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatduration</a>}
*/
public enum OlFormatDuration implements COMEnum {
    
    /**@ Displays duration values using full names for time period descriptions. */
    olFormatDurationLong(2),    
    /**@ Displays duration values, taking into consideration specified calendar work week settings and using full names for time period descriptions. */
    olFormatDurationLongBusiness(4),    
    /**@ Displays duration values using abbreviations for time period descriptions. */
    olFormatDurationShort(1),    
    /**@ Displays duration values, taking into consideration specified calendar work week settings and using abbreviations for time period descriptions. */
    olFormatDurationShortBusiness(3);

    private final long value;

    OlFormatDuration(long value) {
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
