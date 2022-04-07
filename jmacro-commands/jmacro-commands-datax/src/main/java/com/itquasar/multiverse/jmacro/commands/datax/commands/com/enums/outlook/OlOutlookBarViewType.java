package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oloutlookbarviewtype">https://docs.microsoft.com/en-us/office/vba/api/outlook.oloutlookbarviewtype</a>}
*/
public enum OlOutlookBarViewType implements COMEnum {
    
    /**@ The Outlook Bar group displays large icons. */
    olLargeIcon(0),    
    /**@ The Outlook Bar group displays small icons. */
    olSmallIcon(1);

    private final long value;

    OlOutlookBarViewType(long value) {
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
