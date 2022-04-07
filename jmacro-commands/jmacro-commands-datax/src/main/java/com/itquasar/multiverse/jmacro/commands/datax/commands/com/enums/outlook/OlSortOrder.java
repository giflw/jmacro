package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olsortorder">https://docs.microsoft.com/en-us/office/vba/api/outlook.olsortorder</a>}
*/
public enum OlSortOrder implements COMEnum {
    
    /**@ Ascending order */
    olAscending(1),    
    /**@ Descending order */
    olDescending(2),    
    /**@ Not sorted */
    olSortNone(0);

    private final long value;

    OlSortOrder(long value) {
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
